package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1; // 조각 단위
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}
	//실수보다 정수가 정밀도, 수치 모두 우위에 있다.
	// 실수 연산 결과값은 0.29999999999999993가 나온다. (정수에 비해 정밀도가 낮다.)
	// 가능하면 정수 연산 추천
}