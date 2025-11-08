package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
	public static void main(String[] args) {
		//문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList< >();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream().
		flatMap(data -> Arrays.stream(data.split(" "))) // 공백기준으로 문자열을 자르고 배열 스트림 객체 생성
		.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream()
		.flatMapToInt(data -> { // int로 변환
			String[] strArr = data.split(","); // 문자열 나누기
			int[] intArr = new int[strArr.length]; // int 배열 생성
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim()); // int로 변환해 배열에 대입
			}
			return Arrays.stream(intArr); // 배열 스트림 객체 생성해 리턴
		})
		.forEach(number -> System.out.println(number));
	}
}	