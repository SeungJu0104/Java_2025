package ch08.sec02.c3;

//추상클래스 작성
//속성, 변수가 없다
//일반 메소드가 없다
//추상 메소드만 존재할 경우 우리는 이것을 특별히 인터페이스라한다
//public abstract class RemoteControl {
//
//	public abstract void turnOn();
//}

public interface RemoteControl {
	/*public abstract 생략 가능*/ 
	void turnOn();
}
