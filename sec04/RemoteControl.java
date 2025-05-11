package ch08.sec04;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10; // 초기화 필수
	int MIN_VOLUME = 0; // 초기화 필수

	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}