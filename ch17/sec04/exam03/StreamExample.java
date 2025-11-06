package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100); // 1부터 100까지
		int sum = 0;
		stream.forEach(a -> sum += a); // 중첩 클래스 -> 범위 바깥에 있는 매개변수 또는 지역변수를 범위 내부에서 사용하려하면 묵시적으로 final 처리한다. (ch09.sec04.exam03 참조)
		// 수정 불가능
		stream.sum(); // 최종 처리는 합계 처리해줄 수 있기때문에 위의 forEach 없이도 실행할 수 있다.
		System.out.println("총합: " + sum);
	}
}