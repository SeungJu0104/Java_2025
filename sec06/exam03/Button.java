package ch09.sec06.exam03;

public class Button {
	//정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}

	//필드
	private ClickListener clickListener;

	//메소드
	// 인터페이스 구현체 등록
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 이벤트 발생 시 처리할 핸들러를 호출
	public void click() {
		this.clickListener.onClick(); // 제어권이 나에게 온다.
	}
}