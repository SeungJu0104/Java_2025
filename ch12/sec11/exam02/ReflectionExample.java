package ch12.sec11.exam02;

import java.lang.reflect.*;
	
public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors(); // 생성자 여러개
		for(Constructor constructor : constructors) { 
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes(); // 생성자의 인자 타입 갖고 온다.
			printParameters(parameters);
			System.out.println(")");
		 	}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields(); // 부모 클래스 것이 아닌 필드들만 갖고 온다.
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
			
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) { // 마지막 파라미터는 제외
				System.out.print(",");
			}
		}
	}
}		