package ch08.sec02.re;

// 인터페이스
// 속성, 변수, 일반 메소드없이 추상 메소드만 존재하는 클래스.
public interface RemoteControl { // 추상 메소드 사용하려면 반드시 추상 클래스 필요

	// public abstract 생략해도 묵시적으로 컴파일러가 동작시킨다.
	void turnOn();

}
