package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // 문자열을 정수로 변환한다.
		double value2 = Double.parseDouble("3.14");// 문자열을 실수로 변환한다.
		boolean value3 = Boolean.parseBoolean("true");// 문자열을 Boolean으로 변환한다.
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);	// 다른 타입을 문자열로 변환한다.	
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}