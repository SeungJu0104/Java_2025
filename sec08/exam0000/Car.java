package ch07.sec08.exam0000;

public class Car {
	//필드 선언
	private Tire tire;
	
	// 생성자
	public Car() {}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	//메소드 선언
	public void run() {
		//tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}


}