package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//Ok 버튼 객체 생성
		Button btnOk = new Button();

		//Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		// 클릭 이벤트가 발생하면 실행
		//Ok 버튼 객체에 ClickListener 구현 객체 주입
		//1
		btnOk.setClickListener(new OkListener());
		
		//2 익명 객체 (복잡하다) -> 그래서 람다식 사용
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
				
			}
			
		});
		
		//3 람다식
		btnOk.setClickListener(() ->System.out.println("Ok 버튼을 클릭했습니다."));
		btnOk.setClickListener(() ->{System.out.println("Ok 버튼을 클릭했습니다.");});
		// 중괄호 쓰면 실행문 끝에 ; 붙이기
		
		//Ok 버튼 클릭하기
		btnOk.click();

		//-----------------------------------------------------------------------------
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();

		//Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
	}
}