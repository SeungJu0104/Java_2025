package ch16.sec02.exam01;

public class Person {
	// 2가지 작업 수행
	public void action(Workable workable) { // 1. 인터페이스 등록
		workable.work(); // 2. 추상 메소드 호출(이벤트 핸들러 호출 -> 나에게 제어권이 오는 곳)
	}
}