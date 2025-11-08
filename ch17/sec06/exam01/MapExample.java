package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		// studentList.stream().forEach(s -> s.getScore());
		
		//Student를 score 스트림으로 변환
		studentList.stream()
			.mapToInt(s -> s.getScore()) // 제네릭 T를 int로 변환
			.forEach(score -> System.out.println(score));
		// 람다식에서 변수명은 중요하지 않다.
		
		studentList.stream().map(s -> s.getName()).forEach(s -> System.out.println(s));
	}
}