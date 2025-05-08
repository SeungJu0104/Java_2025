package ch08.sec02.re;

/* 일반화를 적용해 기능 구현
 * -> 1. 구현체(실체)에 의존성 역전 원칙(DIP) 적용.
 * -> 2. 사용자에 개방 폐쇄 원칙(OCP) 적용.
 * 
 */

public class RemoteControlExample {
	public static void main(String[] args) {
		// 1. 부모 클래스의 참조변수 사용
		RemoteControl tv = new Television();
		tv.turnOn();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		
		// 2. 배열을 사용해 객체 선언
		// for문은 바뀌지 않으므로 어떤 의미로는 OCP가 적용됐다.
		RemoteControl [] arr = {new Television(), new Audio()};
		
		for(RemoteControl rc : arr) {
			rc.turnOn();
		}
	}
}