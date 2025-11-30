package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
	
public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList< >();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		//남학생만 묶어 List 생성
		List<Student> maleList = totalList.stream() // 컬렉션 스트림 객체 생성
		 		.filter(s->s.getSex().equals("남")) // 중간 스트림. 남자만 필터링.
		 		.collect(Collectors.toList()); // Collectors.toList() 함수 이용해 배열로 리턴
			
		List<Student> maleList1 = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList(); // toList() 하면 .collect(Collectors.toList()); 와 동일한 동작 수행한다. 자바 11이상 부터 가능
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(), //Student 객체에서 키가 될 부분 리턴
						s -> s.getScore() //Student 객체에서 값이 될 부분 리턴
					)
			);
			
		System.out.println(map);
	}
}