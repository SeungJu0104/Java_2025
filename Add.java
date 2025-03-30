package ch05.sec11;

public class Add {

	public static void main(String[] args) { // 메인의 매개변수는 String 타입의 배열 받는다.
		// 프로그램 실행 전 입력 인자 전달 받아 사용(매개변수 사용)
		if(args.length != 2) {
			System.out.println("윈도우 터미널과 Add2 클래스 이용해 main 함수에 매개 변수 전달해 프로그램 실행");
			System.exit(0); // 프로그램 종료
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int res = a + b;
		
		System.out.println(res);
		
	}

}
