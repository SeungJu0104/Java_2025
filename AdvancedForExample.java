package ch05.sec10;

public class AdvancedForExample {
	public static void main(String[] args) {
		
		//배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
		//for문을 이용한 색인 배열 처리
		for(int i = 0; i < scores.length; i++) {
			int idx = i + 3;
			sum += scores[idx]; //인덱스 사용하여 접근. 여기서 idx가 배열 길이를 넘어가면 프로그램 죽음.
		}
		System.out.println("점수 총합 : " + sum);
		
		
		//배열 항목 전체 합 구하기
		for (var score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	} 
}