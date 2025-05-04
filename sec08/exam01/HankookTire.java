package ch07.sec08.exam01;
	
public class HankookTire extends Tire {
	//메소드 재정의(오버라이딩)
//	@Override
//	public void roll() {
//		System.out.println("회전합니다.");
//	}
	
	public void roll(String b) {
		System.out.println("회전합니다.");
	}
}