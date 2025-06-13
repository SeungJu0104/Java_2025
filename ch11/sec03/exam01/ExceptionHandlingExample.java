package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		


		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); 
				// "loo"는 영문자이기 때문에 int로 변환 불가능. NumberFormatException 발생.
				// 배열 범위 초과하는 ArrayIndexOutOfBoundsException 발생.
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) { // 해당 예외 처리
				e.printStackTrace();
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) { // 해당 예외 처리
			System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			} catch(RuntimeException e) { 
				// ArrayIndexOutOfBoundsException과 NumberFormatException은 둘 다 RuntimeException을 부모로 갖고 있으므로,
				// 상속 -> 자동 형변환 -> 다형성에 의해 부모 클래스 하나로 처리 가능하다.
				// 단, 부모 클래스를 이용해 예외 처리를 하는데 자식 클래스 예외처리를 반드시 작성해야한다면 자식 클래스의 예외 처리를 부모보다 앞에 작성해줘야한다.
				// 해당 구문에서는 앞에 예외처리를 지우고 RuntimeException 예외 처리만 남기고 동작시켜도 문제 없다.
				// catch문에 | & 등 연산자 사용 가능하다.
				e.printStackTrace();
			}
			
		}
	}
}