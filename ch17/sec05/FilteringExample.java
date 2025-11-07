package ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동"); 	list.add("신용권");
		list.add("감자바");		list.add("신용권");		list.add("신민철");
			//레거시 방법	
				//신으로 시작하는 요소만 필터링
				for(var n : list) {
					if (n.startsWith("신")) {
						System.out.println(n);
					}
				}
		
		
		// Stream은 사용할 때마다 객체를 새로 생성해야한다.
		// 1번 최종 처리하면 다시 사용할 수 없다.
//		Stream<String> stream = list.stream();
//		stream.distinct().forEach(n -> System.out.println(n));
		
		
		//중복 요소 제거
		list.stream()
			.distinct() // -> Set과 동일
			.forEach( n -> System.out.println(n)); // n은 List의 객체. 람다식에서 변수명은 중복만 아니면 중요하지 않다.
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		list.stream()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));		
	}
}