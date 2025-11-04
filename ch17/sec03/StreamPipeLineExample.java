package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		// 레거시 방법
		int total = 0;
		for(int i = 0; i < list.size(); i++) {
			// 배열에서 학생 객체 얻기
			Student s = list.get(i);
			//총점 누적
			total += s.getScore();
		}
		//평균값 계산
		double legacyAvg = (double)total / list.size();
		System.out.println("평균 : " + legacyAvg);

		//방법1
		// 오리지널 스트림. 스트림 객체 생성.
 		Stream<Student> studentStream = list.stream(); // stream 함수 호출해 Student 타입만 받는 스트림 객체를 생성
 		//중간 처리(학생 객체를 점수로 매핑)
 		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore()); // 중간 스트림. 객체를 정수형 스트림 데이터로 변환. 점수만 갖고 있는 또 다른 오리지널 스트림 생성.
		//최종 처리(평균 점수)
 		double fAvg = scoreStream.average().getAsDouble(); 
		
		//방법2
		double sAvg = list.stream()// 스트림 객체 생성
				.mapToInt(student -> student.getScore()) // 변환
				.average() // 평균 계산 최종 처리
				.getAsDouble(); // 스트림을 double타입으로 바꿔준다.
		// 모든 과정을 체인으로 한문장으로 축약
		System.out.println("평균 점수: " + sAvg);
	}
}