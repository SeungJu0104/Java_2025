package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		// Optinal은 있을 수도 있고, 없을 수도 있다는 의미
		List<Integer> list = new ArrayList< >();

		//예외 발생(java.util.NoSuchElementException)
// 		double avg1 = list.stream()
// 			.mapToInt(Integer :: intValue)
// 			.average()
// 			.getAsDouble();
		

		//방법1
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue)
			.average();
		if(optional.isPresent()) { // if문을 이용한 null이면 0으로 리턴
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}

		//방법2
		double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0); // Optional 클래스 이용한 null이면 0으로 리턴
		System.out.println("방법2_평균: " + avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a));
	}
}