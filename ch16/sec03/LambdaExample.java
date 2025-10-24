package ch16.sec03;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();

		//매개변수가 두 개일 경우
		person.action1((name, job) -> { // 매개변수 타입은 중요하지 않다. 개수는 중요하다.
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});
		person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));
		
		//매개변수가 한 개일 경우
		person.action2(word -> { // 매개변수가 1개이면 ()를 생략할 수 있다.
			System.out.print("\"" + word + "\"");
			System.out.println("라고 말합니다.");
		});
		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
	}
}