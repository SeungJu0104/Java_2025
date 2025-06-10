package ch09.sec07.exam03;

class OkListener implements Button.ClickListener {
	@Override
	public void onClick() {
		System.out.println("OK 버튼을 클릭했습니다.");
	}
}

public class ButtonExample { // 화면단 MVC에서 뷰 단
	public static void main(String[] args) {
		//Ok 버튼 객체 생성
		Button btnOk = new Button();

		//Ok 버튼 객체에 ClickListener 구현 객체 주입(자바 8 이전)(익명 객체)
		Button.ClickListener obj =  new Button.ClickListener() { 
			// 인터페이스는 추상 메소드가 있기 때문에 객체를 생성할 수 없다. 예외적으로 직접 추상 메소드를 선언하면 객체를 생성할 수 있다.	
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		};
		
		//Ok 버튼 객체에 ClickListener 구현 객체 주입(자바 8 이전)(익명 객체)
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
		
		//Ok 버튼 객체에 ClickListener 구현 객체 주입(자바 8 이후)(람다식)
		btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다. (람다식)"));

		//Ok 버튼 클릭하기
		btnOk.click();

		//----------------------------------------------------------------------------

		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();

		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});

		//Cancel 버튼 클릭하기
		btnCancel.click();
	}
}