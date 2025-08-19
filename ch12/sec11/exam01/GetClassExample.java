package ch12.sec11.exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
//		if(args.length != 2) {
//			System.out.println("실행에 필요한 정보 부족");
//			System.exit(0);
//		}
//		
//		// 외부에서 정보를 얻어 실행.
//		// 외부에서 얻은 정보의 자료형은 문자열.
//		int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]); // 문자열을 숫자로 변환해 사용하겠다.
//		int sum = a+b; // 실행될 때 a + b가 연산된다는 것은 고정. 실행 전까지 변수 a와 b의 값은 가변적이다.
//		// 일반화하려면 가변적이어야 대응되므로, 값을 정해버리는 하드 코딩보다는 복잡할 수 밖에 없다.
//		// 외부에서 클래스,필드, 생성자, 메소드, 접근제한자 등 다양한 정보를 담긴 문자열 데이터(메타 데이터)를 제공해주면 이걸 받아서 처리할 수 있어야한다.
//		// 리플렉션을 이용하면 외부에서 들어오는 데이터를 받아서 유연하게 필요한 것들을 생성할 수 있다. 이걸 Injection이라고 한다. (Spring의 인젝션도 유사)
//		System.out.println("sum + " + sum);
//		
//	Vehicle vehicle = new Vehicle(); // Vehicle 객체가 아니면 실행할 수 없다.(클래스는 일종의 사용자가 정의한 자료형) -> 일반화 X -> 특별화된 코드
//		
//		vehicle.run();

		//how1 -> Car 클래스 고정 -> 일반화 X
		//Class clazz = Car.class;
		
		//how2 -> 순수한 일반화
		//논리 오류 발생이 쉽다. (구문 오류 체크 불가하다.)
		Class clazz = Class.forName(args[0]); // 풀 클래스명 인젝션. 클래스정보(메타데이터)가 메모리에 로딩(주기)된다. 상속된 하위 클래스들 모두 쓸 수 있다.
		Constructor con = clazz.getConstructor();
		Constructor constructor = clazz.getConstructor();
		// 기본 생성자 정보를 리턴. Constructor 타입으로 받는다. 인젝션한 클래스에 있는 기본 생성자를 만든다.
		Object obj = con.newInstance();
		// 객체 생성 -> 기본 생성자 실행된다.
		
//		if(obj instanceof Vehicle vehicle) {
//			vehicle.run();
//		}
		try {
			//Method runMethod = clazz.getMethod("add", int.class, int.class); 
			Method runMethod = clazz.getMethod("run"); 
			// Method 타입으로 리턴. 함수는 실행할 때 인자가 없어도 객체 자기 자신을 묵시적으로 인자 전달한다.
			if(runMethod != null) {
				//Object result = runMethod.invoke(obj, 10, 20);
				Object result = runMethod.invoke(obj);
				System.out.println("result : " + result);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}
}