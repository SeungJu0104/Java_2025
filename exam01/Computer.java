package ch07.sec04.exam01;

public class Computer extends Calculator {
	//메소드 오버라이딩(메소드 재정의)
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	// 자식 클래스에서 부모 클래스의 areaCircle 메소드를 다시 작성.
	
	public void method() {
		// areaCircle(10); // 현재 클래스(자식 클래스)에서 재정의한 areaCircle 함수
		super.areaCircle(10); // 부모 클래스(Calculator)에서 정의한 areaCircle 함수
	}
}