package ch08.sec03;

class CRemoteControl{
	int volume = 0;
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
}

public interface RemoteControl {
	int MAX_VOLUME = 10; // public static 이 생략된 상수 필드. 인터페이스에서는 묵시적으로 상수로 만든다.
	int MIN_VOLUME = 0; // public static 이 생략된 상수 필드. 인터페이스에서는 묵시적으로 상수로 만든다.
}