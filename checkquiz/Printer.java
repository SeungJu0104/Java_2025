package ch06.checkquiz;

public class Printer {
// 16번 문제
//	public void println(int value) {
//		System.out.println(value);
//	}
//	
//	public void println(boolean value) {
//		System.out.println(value);
//	}
//	
//	public void println(double value) {
//		System.out.println(value);
//	}
//	
//	public void println(String value) {
//		System.out.println(value);
//	}

// 17번 문제
	public static void println(int value) {
		System.out.println(value);
	}
	
	public static void println(boolean value) {
		System.out.println(value);
	}
	
	public static void println(double value) {
		System.out.println(value);
	}
	
	public static void println(String value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
//		16번 문제
//		Printer print = new Printer();
//		print.println(10);
//		print.println(true);
//		print.println(5.7);
//		print.println("홍길동");
		
//		17번 문제
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}
