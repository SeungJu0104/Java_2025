package ch08.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc; // 일반화(추상)
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television(); // 특별화(실체가 있는 객체를 갖고 기능을 호출)
		rc.turnOn(); // 특별화(실체가 있는 객체를 갖고 기능을 호출)
		rc.setVolume(5); // 특별화(실체가 있는 객체를 갖고 기능을 호출)
		rc.turnOff(); // 특별화(실체가 있는 객체를 갖고 기능을 호출)

		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}