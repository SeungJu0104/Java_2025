package ch07.checkquiz.q10;

//public abstract class Computer extends Machine {
//	
//}

public class Computer extends Machine{
	
	@Override
	public void work() {
		super.powerOn();
		super.powerOff();
		System.out.println("현재 과제 중");
	} 
	
	public static void main(String [] args) {
		Machine m = new Computer();
		m.work();
	}
}

/**
 * 원인 ) 추상 클래스 내 추상 메소드 work를 
 * 			자식 클래스인 Computer 클래스에서 
 * 			오버라이딩하거나 다시 추상 메소드로 만들어야하는데 하지 않았기 때문에 에러 발생.
 * 
 * 해결 ) Computer 클래스를 추상 클래스로 정의하거나
 * 			work 메소드를 작성(오버라이딩)한다.
 * 
 * 
*/