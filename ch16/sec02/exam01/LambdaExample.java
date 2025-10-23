package ch16.sec02.exam01;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();

		//실행문이 두 개 이상인 경우 중괄호 필요
		person.action(() -> { // 익명의 구현 객체를 만든다.
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다."); // 1문장 이상이면 중괄호 사용
		});

		//실행문이 한 개일 경우 중괄호 생략 가능
		person.action(() -> System.out.println("퇴근합니다."));
	}
}