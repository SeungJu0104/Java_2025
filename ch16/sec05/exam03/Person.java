package ch16.sec05.exam03;

public class Person {
	public Member getMember1(Creatable1 creatable) { // 인터페이스 등록. 익명 객체
		String id = "winter";
		Member member = creatable.create(id); 
		return member;
	}

	public Member getMember2(Creatable2 creatable) { // 인터페이스 등록. 익명 객체
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}
}