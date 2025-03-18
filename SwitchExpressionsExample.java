package ch04.sec03;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		char grade = 'A';
		// 표현식: 화살표를 이용
		// 자바 12 이상부터 사용 가능
		switch(grade) {
			case 'A', 'a' -> {// : 대신 -> 사용. 그러면 break 따로 사용할 필요 없다.
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}						
			default -> {
				System.out.println("손님입니다.");
			}
		}

		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");						
			default -> System.out.println("손님입니다.");
		}
	}
}