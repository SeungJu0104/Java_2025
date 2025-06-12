package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try { // 예외 발생되는 문장
			int result = data.length();
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) { // 발생시 처리법
			//System.out.println(e.getMessage()); //①
			//System.out.println(e.toString()); //②
			e.printStackTrace(); //③
		} finally { // 예외 발생 여부와 상관없이 실행. 생략 가능.
			System.out.println("[마무리 실행]\n");
		}
		System.out.println("[여기도 예외와 상관없이 실행]\n");
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}