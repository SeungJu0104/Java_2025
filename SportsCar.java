package ch06.sec03;

class Human{ // 라이브러리 클래스(Main이 없는 클래스)
	int age;
	String name;
	
	public void eat() {
		System.out.println(name + "가 음식을 먹는다.");
	}
	
}

public class SportsCar {
	public static void main(String [] args) {
		int a = 10;
		System.out.println("a = " + a);
		
		// Human 클래스의 객체 생성
		Human hong = new Human();
		Human lee = new Human();
		
		// 속성 값을 직접 대입해 초기화(비추천)
		hong.name = "홍길동";
		lee.name = "이름";
		
		// 동작(함수) 이용
		hong.eat();
		lee.eat();
	}
}

class Tire { // 라이브러리 클래스(Main이 없는 클래스)
}