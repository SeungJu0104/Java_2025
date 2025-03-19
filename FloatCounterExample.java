package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		float x;
		int i;
		
		for(x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		// 반복문에서 실수 사용은 지양
		// 정확도가 떨어진다.
		
		System.out.println("------------------------------------");
		
		x = 0.1f;
		for(i = 1; i <= 10; i++) {
			System.out.println(x);
			x += 0.1f;
		}
		// 정수 사용하면 정확도를 높일 수 있다.
		
		System.out.println("------------------------------------");
		
		x = 0.1f;		
		for(i = 0; i <= 10; i++, x+=0.1f) System.out.println(x);
		// 증감식은 , 를 이용해 여러개 쓸 수 있다.
		// 반복문에서 실수 사용은 지양
		
	}
}