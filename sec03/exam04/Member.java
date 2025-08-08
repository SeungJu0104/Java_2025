package ch12.sec03.exam04;

public record Member(String id, String name, int age) { // () 안에 사용할 필드 나열
	// 접근할 때는 객체.필드명() 형태로 접근
}