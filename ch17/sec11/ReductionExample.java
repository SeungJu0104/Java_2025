package ch17.sec11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
		);		
		
		//방법1
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore) // .mapToInt(s -> s.getScore()) 와 동일
				.sum();	
		
		//방법2
		int sum2 = studentList.stream()
						.map(Student :: getScore) // map(s -> s.getScore())
						.reduce(0, (a, b) -> a+b); // 기존의 결과를 재사용. 누적 연산 ex) a = a + b;
						// 덧셈 뺄셈은 보통 기본 값을 0으로, 곱셈 나눗셈 연산은 보통 기본 값으로 1을 준다.
		
		IntStream.rangeClosed(1, 5).reduce(1, ((a,b) -> a*b));
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}