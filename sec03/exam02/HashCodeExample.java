package ch12.sec03.exam02;

public class HashCodeExample {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println("s1.해시코드 : " + s1.hashCode());
		System.out.println("s2.해시코드 : " + s2.hashCode());

		if(s1.hashCode() == s2.hashCode()) { // 해시코드는 객체마다 다른 값을 가진다. 객체의 메모리 주소 값을 기반으로 해시코드 생성.
			if(s1.equals(s2)) {
				System.out.println("동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
	}
}