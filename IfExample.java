package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		/*
		 * 점수가 90점 이상이면 A, 이외에는 B등급 출력하시오.
		 */
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 작습니다."); // 중괄호 없이도 조건식이 T면 여기까지 실행.
			System.out.println("등급은 B입니다.");
	}
}