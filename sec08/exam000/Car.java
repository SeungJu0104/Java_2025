package ch07.sec08.exam000;

public class Car {
	//필드 선언
	private HankookTire tire;
	
	// 생성자
	public Car() {}	

	//메소드 선언
	public void run() {
		//tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}


}