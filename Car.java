package ch06.sec06.exam02;

public class Car {
	//필드 선언(멤버 변수)
	String company = "현대자동차"; // 초기화
	String model = "그랜저"; // 초기화
	String color = "검정"; // 초기화
	int maxSpeed = 350; // 초기화
	int speed; //초기값 0
	
	// 멤버 함수(멤버 메소드)
	void drive() {
		System.out.println("운전 합니다.");
	}
	
	// 생성자(객체 생성시 동작)
	Car(){
		
	}
	// 매개변수 있는 생성자가 따로 없으면 컴파일러가 자동으로 기본 생성자를 생성 처리해준다.
}