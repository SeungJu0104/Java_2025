package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);

		//결합 연산
		// 문자열 전에 연산이 있다면 연산 수행하고 문자열 붙는 형태가 된다.
		// 문자열 후에 연산이 있다면 그냥 문자열로 본다.
		String result2 = 10 + 2 + "8"; // 문자열 128
		System.out.println("result2: " + result2);

		String result3 = 10 + "2" + 8;// 문자열 1028
		System.out.println("result3: " + result3);

		String result4 = "10" + 2 + 8;// 문자열 1028
		System.out.println("result4: " + result4);

		String result5 = "10" + (2 + 8);// 문자열 1010
		System.out.println("result5: " + result5);
	}
}