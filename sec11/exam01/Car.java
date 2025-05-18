package ch08.sec11.exam01;

public class Car {
	//필드
	Tire tire1 = new HankookTire(); // 특별화(객체(실체) 생성)
	Tire tire2 = new HankookTire(); // 특별화(객체(실체) 생성)

	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}