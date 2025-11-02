package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
	
public class ParallelStreamExample {
	public static void main(String[] args) { // main 함수가 하나의 스레드
		//List 컬렉션 생성
		List<String> list = new ArrayList< >();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");

		//병렬 처리. 멀티 스레드를 이용한 처리.
		// CPU의 코어 수만큼 스레드가 생성되어 동작한다. -> 성능 극대화
		Stream<String> parallelStream = list.parallelStream(); // 스트림 생성
		parallelStream.forEach( name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		} ); // 스트림 최종 처리
		
		// 단일 스레드
		Stream<String> singleStream = list.parallelStream(); // 스트림 생성
		singleStream.forEach( name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		} ); // 스트림 최종 처리
		
		// 위쪽의 forEach문과 동일한 문장. 단일 스레드 처리.
//		for(String name : list) { 
//			System.out.println(name + Thread.currentThread().getName()); 
//		}
		// 에러는 Member 클래스 없고, 생성자도 안만들어서
		List<Member> list2 = new ArrayList< >();
		list2.add(new Member("aaa1", "홍길동"));
		list2.add(new Member("aaa2", "신용권"));
		list2.add(new Member("aaa3", "감자바"));
		list2.add(new Member("aaa4", "람다식"));
		list2.add(new Member("aaa5", "박병렬"));
		
		Stream<Member> stream2 = list2.stream();
		
		//최종처리 
		stream2.forEach( member -> {
			System.out.println(member.getName() + ": " + Thread.currentThread().getName());
		} );
		
		
		
	}
}