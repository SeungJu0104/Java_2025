package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("-------------------------------");
		/*
		 * 비트연산
		 * 
		 * 00101101
		 * 	&
		 * 00011001
		 * -----------
		 * 00001001
		 * (둘 다 1이면 1)
		 * 
		 * 00101101
		 * 	|
		 * 00011001
		 * -----------
		 * 00111101
		 * (하나면 1이면 1)
		 * 
		 * 00101101
		 * 	^
		 * 00011001
		 * ----------
		 * 00110101
		 * (하나만 1이면 1)
		 * 
		 * 00101101
		 * 	~
		 * 00011001
		 * -----------
		 * 
		 */
		
		byte receiveData = -120;
		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255; // 컴파일러는 정수연산을 기본적으로 int로 본다. 즉, receiveData가  int로 자동 변환되어 계산 수행.
		System.out.println(unsignedInt1);

		//방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);

		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}
}