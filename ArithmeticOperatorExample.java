package ch03.sec02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;			//모든 피연산자는 int 타입으로 자동 변환 후 연산
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4; 	//모든 피연산자는 long 타입으로 자동 변환 후 연산
		// byte 타입을 v1,v2를 int 타입으로 자동 형변환 후 연산(컴파일러는 byte, short 타입의 연산을 수행할 경우 int를 기본으로 계산한다.)
		//그 결과 값은  long으로 자동 형변환해 v4와 연산 수행
		// 자바는 java 파일 단위로 컴파일을 수행하는데 long으로 바로 형변환할까?
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2;	//double 타입으로 강제 변환 후 연산
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2; // byte 타입을 int 형으로 자동 형변환 후 나머지 연산 수행(컴파일러는 byte, short 타입의 연산을 수행할 경우 int를 기본으로 계산한다.)
		System.out.println("result4: " + result4);
	}
}	