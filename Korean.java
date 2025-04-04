package ch06.sec07.exam03;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자 선언
	public Korean(String name, String ssn) {
		this.name = name; // 변수명이 중복되기 때문에 this.를 붙여 구분해준다. 여기서 this.name은 멤버변수(필드) name
		this.ssn = ssn; // 변수명이 중복되기 때문에 this.를 붙여 구분해준다. 여기서 this.ssn은 멤버변수(필드) ssn
	}
}