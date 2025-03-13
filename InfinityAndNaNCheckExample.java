package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
//		int x = 5;
//		double y = 0;
//		double z = x / y;
//		ArithmeticException 발생
// 	정수 / 0 -> ArithmeticException
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
		// 결과값 infinity;
		// double z = x % y;
		// 결과값 NaN
		// 실수 또는 정수 / 0.0 -> Infinity
		// 실수 또는 정수 % 0.0 -> NaN
		
		//잘못된 코드
		System.out.println(z + 2);	
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) { 
			System.out.println("값 산출 불가"); 
		} else { 
			System.out.println(z + 2); 
		}
	}
}