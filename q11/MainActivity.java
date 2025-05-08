package ch07.checkquiz.q11;

public class MainActivity extends Activity{
	@Override // 오버라이딩
	public void onCreate() {
		super.onCreate(); // 부모클래스의 onCreate 함수 실행
		System.out.println("추가적인 실행 내용");
	}

	public static void main(String[] args) {
		(new MainActivity()).onCreate();
		// 기본적인 실행 내용
		// 추가적인 실행 내용
	}

}
