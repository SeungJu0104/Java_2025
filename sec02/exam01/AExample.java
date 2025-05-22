package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		//A 객체 생성
		A a = new A();

		//B 객체 생성
		// 클래스 B는 A의 안에 위치해있으므로 클래스 A의 객체가 먼저 생성되어야한다.
		A.B b = a.new B(); // 실제로는 절대 사용안하는 코드
		// A클래스 내 B클래스 타입 참조변수 b에 a객체 통해 생성한 B 클래스 객체 주소값을 대입한다.
		
		
	}
}