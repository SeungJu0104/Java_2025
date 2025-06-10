package ch09.sec07.exam03;

public class Button {	
	//정적 멤버 인터페이스 // 구현자측
	public static interface ClickListener {
		//추상 메소드 // 사용자측
		void onClick();
	}
	
	//필드
	private ClickListener clickListener; // 이벤트 발생 시 처리하는 변수
		
	// 리스너를 등록하는 메소드
	// 이벤트 처리 객체를 등록하는 메소드
	// 일종의 플러그인
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}