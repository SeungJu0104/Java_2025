package ch03.sec10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;		
		result += 10;
		System.out.println("result=" + result);		
		result -= 5;
		System.out.println("result=" + result);		
		result *= 3;
		System.out.println("result=" + result);		
		result /= 5;
		System.out.println("result=" + result);		
		result %= 3;
		System.out.println("result=" + result);	
		
		result = 10;
		result *= 5 + 8; // result = result * (5 + 8);
		// 복합대입연산자는 우선순위가 낮다.
		System.out.println("result=" + result);
	}
}