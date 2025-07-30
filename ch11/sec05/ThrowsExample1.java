package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}

	public static void findClass() throws ClassNotFoundException { // ClassNotFoundException 클래스로 예외 처리 넘긴다.
		Class.forName("java.lang.String2");
	}
}