package ch07.sec08.exam0000;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		Tire tire = new Tire(); 
		// 추상 클래스는 객체를 생성할 수 없다.
		// 반드시 상속을 하고, 오버라이딩 통해서만 접근 가능하다.
		Car myCar2 = new Car();
		
		myCar.run();
		myCar2.run();
	}
}