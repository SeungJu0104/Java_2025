package ch08.sec11.exam01;

public class CarExample {
	public static void main(String[] args) {
		//자동차 객체 생성
		Car myCar = new Car(); // 특별화

		//run() 메소드 실행
		myCar.run();

		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();

		//run() 메소드 실행(다형성: 하나의 호출로 서로 다른 실행 결과 도출)
		myCar.run(); 
	}
}