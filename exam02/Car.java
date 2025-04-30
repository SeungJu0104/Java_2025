package ch07.sec05.exam02;

public class Car {
	//필드 선언
	public int speed;

	//메소드 선언
	public void speedUp() {
		speed += 1;
	}

	//final 메소드
	public final void stop() { // fianl을 붙였기 때문에 상수 -> 변경 불가 -> 자식 클래스에서 오버라이딩 불가
		System.out.println("차를 멈춤");
		speed = 0;
	}
}