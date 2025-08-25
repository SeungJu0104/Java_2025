package ch13.sec02.exam03;

public class GenericExample {
	public static void main(String[] args) {
		Box box1 = new Box(); // 제네릭 명시안하면 Object 타입으로 묵시적으로 받는다.
		box1.content = "100";

		Box box2 = new Box(); // 제네릭 명시안하면 Object 타입으로 묵시적으로 받는다.
		box2.content = "100";
		
		Box box3 = new Box(); // 제네릭 명시안하면 Object 타입으로 묵시적으로 받는다.
		box3.content = 100;

		boolean result1 = box1.compare(box2); // String은 동일 리터럴이면 하나의 객체로 사용.
		System.out.println("result1: " + result1);

		boolean result2 = box1.compare(box3); // String과 int는 다른 타입이고 주소도 다르다.
		System.out.println("result2: " + result2);
	}
}