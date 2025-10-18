package ch15.sec05.exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		
		Person [] arr = {
				new Person("홍길동", 45),
				new Person("감자바", 25),
				new Person("박지원", 31)
		};
		
		// Comparable을 이용한 정렬
		// Arrays.sort(arr); // Comparable 타입으로 형변환 불가능 해 예외 발생
		// 사용자 정의 클래스(타입)을 사용해 정렬하려면 Comparable을 상속받아 비교 방식을 만들어야한다.
		
		// Comparator를 이용한 정렬
		Arrays.sort(arr, new Comparator<Person>() { // 익명 객체
			@Override // 비교 대상 2개 가져와서 비교
			public int compare(Person o1, Person o2) {
				// 나이 오름차순 기준 정렬 수행
				return o1.age - o2.age;
			} 	
		});
		
		// Comparator를 람다식으로 이용한 정렬
		Arrays.sort(arr, (o1, o2) -> (o1.age - o2.age));
		
		System.out.println("정렬 후 결과");
		for(var person : arr) {
			person.print();
		}
		
		//TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();

		//객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		//객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	}
}