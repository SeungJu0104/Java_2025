package ch03.sec03;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
			var1++; //++ 연산은 var1의 값을 1 증가시킨다.
			System.out.println("var1: " + var1);
			
			System.out.println("var1: " + var1++); // 앞의 연산과 동일 결과 도출
		}
		// byte보다 범위가 넓은 short 이상의 자료형을 사용하면 오버플로우를 방지할 수 있다.
		// 오버플로우가 발생한 다음에는 최소값부터 반복문 수행한다.
		System.out.println("-----------------------");

		byte var2 = -125;
		for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
			var2--; //-- 연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2: " + var2);
		}
		// byte보다 범위가 넓은 short 이상의 자료형을 사용하면 오버플로우를 방지할 수 있다.
		// 언더플로우가 발생한 다음에는 최대값부터 반복문 수행한다.
	}
}