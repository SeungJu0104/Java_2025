package ch03.sec09;

public class BitShiftExample1 {
	public static void main(String[] args) {
	/*
		00000001  << 1 : 1
		00000010       : 2
		00000010  << 1 : 2
		00000100       : 4
		00000100  << 1 : 4
		00001000       : 8
		00001000  >> 1 : 8
		00000100       : 4
		00000100  >> 1 : 4
		00000010       : 2
		10001000  >> 1 :
		11000100       최상위부호가 1이므로 가장 좌측 빈자리에 1을 넣는다.
		110000100  >> 1 :
		111000010       최상위부호가 1이므로 가장 좌측 빈자리에 1을 넣는다.
	*/
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);		
		
		// 이진 수 변환
		byte value = 53; //00110101 -> 0011 / 0101
		System.out.println(value & 0x80); //00110101 & 0x10000000  16진수의 좌측 바이트 8의 자리
		System.out.println(value & 0x40);// 00110101 & 0x01000000  16진수의 좌측 바이트 4의 자리
		System.out.println(value & 0x20);// 00110101 & 0x00100000  16진수의 좌측 바이트 2의 자리
		System.out.println(value & 0x10);// 00110101 & 0x00010000   16진수의 좌측 바이트 1의 자리
		System.out.println(value & 0x08);// 00110101 & 0x00001000  16진수의 우측 바이트 8의 자리
		System.out.println(value & 0x04);// 00110101 & 0x00000100  16진수의 우측 바이트 4의 자리
		System.out.println(value & 0x02);// 00110101 & 0x00000010   16진수의 우측 바이트 2의 자리
		System.out.println(value & 0x01);// 00110101 & 0x00000001   16진수의 우측 바이트 1의 자리
	}
}	