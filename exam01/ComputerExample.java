package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator(); // 부모 클래스의 객체 생성
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer(); // 자식 클래스의 객체 생성
		System.out.println("원 면적: " + computer.areaCircle(r));
		
		calculator = computer; // 부모는 자식 클래스로 다운 캐스팅 안되지만, 자식은 부모 클래스로 업캐스팅 가능
		System.out.println("원 면적: " + calculator.areaCircle(r));
		// 출력하면 자식(Computer 클래스)에서 재정의한 areaCircle 함수가 출력된다.
	}
}