package ch08.sec02.c1;

/* 일반화를 적용 하여 기능을 구현 하고자 함
 * 일반화를 적용 -> 1. 의존성 역전 원칙을 적용(구현체) 한다
 *                     
 *                  2. 개방 폐쇄의 원칙(사용자 측에 적용) 
 * 부모클래스의 참조변수 사용,
 * 부모클래스의 참조변수 배열, 
 * 반복문을 사용하여 여러개의 객체를 동일하게 실행 할 수 있다 -> 결과는 다르게 나온다     
 * 
 */
public class RemoteControlExample {
	public static void main(String[] args) {
//		//1. 부모클래스의 참조변수 사용,
//		RemoteControl tv = new Television();
//		tv.turnOn();
//		
//		RemoteControl audio = new Audio();
//		audio.turnOn();
		//2. 배열을 사용하여 객체 선언하는 방법 
		RemoteControl [] arr = {
			new Television(),
			new Audio()
		};
		
		for (RemoteControl rc : arr) {
			rc.turnOn();
		}
	}
}