package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {
	public static void main(String[] args) {
		// 읽기 전용 컬렉션(추가, 변경, 삭제 불가능)
		
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C"); // 3개의 데이터를 가진 불변 리스트 생성.
		//immutableList1.add("D"); (x) // add함수를 사용하면 구문 오류는 나지 않지만 논리 오류 발생.
		//immutableList1.remove(1); (x)// remove함수 사용하면 구문 오류는 나지 않지만 논리 오류 발생.
		
		//변경 가능한 List 생성
		List<String> list1 = new ArrayList<>();
		list1.add("안녕하세요.");
		list1.add("안녕하세요.");
		list1.add("안녕하세요.");
		list1.add("안녕하세요.");
		list1.remove(0);

		//Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		//immutableSet1.remove("A"); (x)

		//Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		//immutableMap1.put(4, "D"); (x)
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList< >(); // 변경 가능한 ArrayList 생성
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list); // list를 복사한 불변 List 생성
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set= new HashSet< >(); // 변경 가능한 HashSet 생성
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set); // set을 복사한 불변 Set 생성
			
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap< >(); // 변경 가능한 HashMap 생성.
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map); // map을 복사한 불변 Map 생성.
		
		//배열로부터 List 불변 컬렉션 생성
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr); // 배열을 불변 List로 변경.
		
		List <String> immutableList4 = Arrays.asList(new String [] {"A", "B", "C"}); // 불변 List 생성.
	}
}