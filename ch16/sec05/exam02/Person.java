package ch16.sec05.exam02;

public class Person {
	public void ordering(Comparable comparable) { // 인터페이스 등록. 익명 객체
		String a = "홍길동";
		String b = "김길동";

		int result = comparable.compare(a, b); // 추상 메소드 호출.(이벤트 핸들러 호출)

		if(result < 0) {
			System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
		} else if(result == 0) {
			System.out.println(a + "은 " + b + "과 같습니다.");
		} else {
			System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
		}
	}
}