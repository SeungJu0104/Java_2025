package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		// id 인자를 사용해 Member 객체를 생성해 리턴한다. (생성자)
		Member me = person.getMember1(id -> new Member(id));
		Member m1 = person.getMember1( Member :: new ); // 인자의 개수가 id 1개로 동일하니 매개변수 생략 가능
		System.out.println(m1);
		System.out.println();
		
		Member me2 = person.getMember2((id, name) -> new Member(id, name));
		Member m2 = person.getMember2( Member :: new ); // 인자의 개수가 id, name 2개로 동일하니 매개변수 생략 가능
		System.out.println(m2);
	}
}