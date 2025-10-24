package ch16.sec03;

public class Person {
	public void action1(Workable workable) { // 인터페이스 등록. 익명 객체
		workable.work("홍길동", "프로그래밍"); // 추상 메소드 호출. 이벤트 핸들러 호출.
	}

	public void action2(Speakable speakable) { // 인터페이스 등록. 익명 객체
		speakable.speak("안녕하세요"); // 추상 메소드 호출. 이벤트 핸들러 호출.
	}
}