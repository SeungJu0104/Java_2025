package ch08.sec02;

import ch08.sec02.Audio;
import ch08.sec02.RemoteControl;
import ch08.sec02.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc;

		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	
	}
}