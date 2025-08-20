package ch12.sec12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		// Method[] declaredMethods = Service.class.getDeclaredMethods(); // 서비스 클래스의 명시된 메소드들을 갖고 온다.
		//Object service = Service.class.getDeclaredConstructor().newInstance();
		
		if(args.length != 1) {
			return;
		}
		
		Class clazz = Class.forName(args[0]);
		//Constructor con = clazz.getConstructor();
		//Object obj = con.newInstance();
		
		for(Method method : clazz.getDeclaredMethods()) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation // 어노테이션 정보를 갖고 온다.
					(PrintAnnotation.class);

			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);

			//메소드 호출
			method.invoke(new Service());
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
		
//		for(Method method : declaredMethods) {
//			//PrintAnnotation 얻기
//			PrintAnnotation printAnnotation = method.getAnnotation // 어노테이션 정보를 갖고 온다.
//					(PrintAnnotation.class);
//
//			//설정 정보를 이용해서 선 출력
//			printLine(printAnnotation);
//
//			//메소드 호출
//			method.invoke(new Service());
//			
//			//설정 정보를 이용해서 선 출력
//			printLine(printAnnotation);
//		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			//number 속성값 얻기
			int number = printAnnotation.number(); 
			for(int i=0; i<number; i++) {
				//value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}