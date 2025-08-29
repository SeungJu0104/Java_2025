package ch13.sec04;

public class GenericExample {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) { // Number 하위 모든 타입 사용 가능
		//T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " +
				t2.getClass().getSimpleName() + ")");

		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		return (v1 == v2); //부동소수점 문제때문에 실수는 ==으로 비교하면 안된다. 하려면 자리수 같은 제한을 명확하게해야한다.
	}

	public static void main(String[] args) {
		//제네릭 메소드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();

		//제네릭 메소드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
		boolean result3 = compare("4.5", "4.5"); // 비교 불가하니 구문 오류
		System.out.println(result3);
		
		boolean result4 = compare(4.5, 4); // 숫자이기때문에 비교한다. 4.5와 4.0으로 비교한다.
		System.out.println(result4);
	}
}