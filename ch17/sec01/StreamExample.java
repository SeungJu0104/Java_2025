package ch17.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

/*
 * 스트림의 대상은 컬렉션 또는 배열(배열 또한 따지면 컬렉션의 일종)
 * 
 * 데이터 관리(속도 빠른 순서)
 * Collection : List, Set, Map
 * DB : SQL
 * 
 * 스트림은 JPA와 밀접한 연관이 있다. -> 대기업은 JPA로 DB 작성
 */

interface Consumer {
	void accept(String str); // 람다식에서 추상 메소드의 이름은 중요하지 않다. 매개변수의 개수, 리턴타입이 가장 중요하고
}

public class StreamExample {
	static void forEach(Set<String> set, Consumer consumer) {
		for(var name : set) {
			consumer.accept(name);
		}
	}
	
	public static void main(String[] args) {
		//Set 컬렉션 생성
		Set<String> set = new HashSet< >();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		// forEach(set, name -> System.out.println(name));
		
//		for(var name : set) {
//			System.out.println("name = " + name);
//		}

		//Stream을 이용한 요소 반복 처리
		// SOLID의 S, O, D
		Stream<String> stream = set.stream();
		stream.forEach( name -> System.out.println(name) ); // forEach는 향상 for문과 같다.
	}
}