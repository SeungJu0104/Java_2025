package ch06.sec15;

class Car{
	private static Car car = new Car(); // 외부에서 접근 못하는 객체 1개만 존재할 수 있도록 정적 객체 생성
																		// 싱글톤 객체
	private Car() {} // 생성자 통한 외부 접근 막기 위해 private 사용한 기본 생성자 작성
	
	public static Car getCar() { // static 없으면 객체 멤버 함수이므로 외부에서 접근하려면 객체가 필요하다.
															// 그래서 static 으로 만들어(정적 메소드)  따로 객체 생성없이 접근할 수 있도록 만든다.
		return car;
	}
}

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();

	//private 접근 권한을 갖는 생성자 선언
	private Singleton() {
	}

	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}
}