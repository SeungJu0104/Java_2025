package ch03.sec04;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number; 
		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		// 정수 이용해 연산 수행하고 출력만 실수화 시키는 것이 가장 좋다.
		// 결과 값은 0.3(상대적으로 정밀도가 높다.)
	}
}