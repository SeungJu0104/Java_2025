package ch09.sec06.exam01;

public class Button { // 사용자가 버튼 누른다.
	//정적 멤버 인터페이스
	public static interface ClickListener { // 클릭이 발생한다.
		//추상 메소드
		void onClick(); // 클릭을 처리한다.
	}
}
// 인터페이스 이용해 결합도를 낮출 수 있다.
