package ch16.sec01;

public class LambdaExample {
	public static void main(String[] args) {
//		action((x, y) -> {
//			int result = x + y;
//			System.out.println("result: " + result);
//		});
//
//		action((x, y) -> {
//			int result = x - y;
//			System.out.println("result: " + result);
//		});
		//action(new calcAdd()); // 레거시 방식 -> 소유권을 함수에게 넘겨서 처리한다.
		action(new Calculable(){ // 익명 객체
			public int calculate(int x, int y) {
				return x + y;
			}
		});
	
		// 람다식 -> 실제 실행 처리를 내가 정의한다.
	action((x,y) -> {return x + y;});
	action((x, y) -> x+y);
	action((x, y) -> x-y);
	}
	static class calcAdd implements Calculable{
		public int calculate(int x, int y) {
			return x + y;
		}
	}
	
	public static void action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		int res = calculable.calculate(x, y);
		System.out.println("계산 결과 : " + res);
	}
}