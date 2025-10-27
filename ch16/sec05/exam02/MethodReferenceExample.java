package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.ordering((a,b) -> a.compareToIgnoreCase(b));
		person.ordering(String :: compareToIgnoreCase);
		// person.ordering((a, b) -> a.compareToIgnoreCase(b)); 와 동일. 매개변수의 대소문자를 무시하고 비교하는 함수
		// 매개변수 2개로 일치. 그리고 compareToIgnoreCase는 String 클래스의 메소드.
		// 그래서 매개변수 생략하고, String 클래스의 compareToIgnoreCase의 매개변수도 생략.
		// a의 멤버변수를 갖고 b의 인자를 찾아간다.
	}
}