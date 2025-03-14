package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// Math는 수학 관련 기능 클래스
		// Math 클래스 내에 random 함수가 존재.(난수(0.0 <= n < 1.0)를 생성)
		// Random 클래스의 random 함수는 시간을 기반으로 난수 생성.
		/*
		 * 0.9 * 6 = 5.4 -> 강제 형변환 -> 5
		 * 0.0 * 6 = 0.0 -> 강제 형변환 -> 0
		 * 0.99999 * 6 = 5.999999.. -> 강제 형변환 -> 5
		 * 결국 강제 형변환한 (Math.random()*6)의 결과는 0 - 5까지이므로 + 1을 해서 1 - 6이라는 결과 나오도록 만든다.
		 */
		
		/*
		 * 주사위 놀이
		 */
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {	
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}