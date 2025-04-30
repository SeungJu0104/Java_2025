package ch07.sec05.exam02;

public class SportsCar extends Car {
	
	String name;
	
	@Override
	public void speedUp() {
		speed += 10;
	}

	// 오버라이딩을 할 수 없음
	// 부모클래스 Car에서 final 선언된 메소드 -> 상수 -> 자식 클래스에서 오버라이딩 불가
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}