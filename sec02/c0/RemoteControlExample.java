package ch08.sec02.c0;

//특별한 기능으로 동작하는 코드 
//일반화가 적용되기 전 코드 

public class RemoteControlExample {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		
		Audio audio = new Audio();
		audio.turnOn();
	}
}