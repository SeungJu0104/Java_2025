package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
			
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //65 < 66
		System.out.println("result4: " + result4);
			
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); //true
		System.out.println("result5: " + result5);

		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);// float은 4바이트, double은 8바이트 -> 용량에 따른 자리수 오차때문에 false
		// 가능하면 실수 비교할 때 동등 비교 사용 지양
		boolean result7 = (num5 == (float)num6);
		double d = num6 - num5;
		// 사용하려면 정확한 비교를 위해 오차범위를 지정해준다.
		boolean r10 = Math.abs(num6 - num5) < 0.01; // 아래 비교식과 동일한 내용. 절대값 함수 사용.
		//boolean r10 = -0.01 < d && d<0.01;
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		System.out.println("result10: " + r10); //true
		// System.out.println("result10: " + (Math.abs(num6-num5) < 0.01)); 이렇게 한줄로 코딩 가능

		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}
}