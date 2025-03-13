package ch03.sec11;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		/*
		 * 성적이 91점 이상이면 A, 81-90은 B, 그 외는 C 출력한다.
		 */
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' ); // 삼항연산자(조건식? T일 때 수행문 : F일 때 수행문)
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		/* if - else 문 이용한 처리
		if(score >= 90) {
			grade = 'A';
		}
		else {
			if(score > 80) {
				grade = 'B';
			}else {
				grade = 'C';
			}
		}
		*/
	}
}

