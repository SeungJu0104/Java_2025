package ch12.sec11.exam01;

public class Bus extends Vehicle {
	public Bus() {
		System.out.println("기본 생성자 Bus 호출");
	}
	
	//메소드 재정의(오버라이딩)
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}