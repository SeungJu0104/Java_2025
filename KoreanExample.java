 package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		
		/*
		 * 범위에 따른 변수 종류
		 * 지역변수, 인스턴스 변수(멤버 변수), 정적 변수(전역 변수)
		 * final은 3종류의 변수에 모두 사용 가능하다.
		 */
		
		final int [] arr = {10,20,30};
		arr = null; // final 선언해 상수로 만들었기 때문에 값 변경 불가
		final int length = arr.length;
		
		for(int i = 0; i < arr.length; i++) { // 매 반복문이 돌 때마다 arr배열에 접근하고, 길이 값을 받는 2가지 과정이 실행된다.
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<length; i++) { // 변수 length에 arr.length의 값을 한번만 담으면, 변수 length로 바로 접근하는 1가지 과정만 실행하면 된다. 좀 더 효율적인 코드
			System.out.println(arr[i]);
			length++; // length변수에 final 쓰지 않았을 때, 이런 코드가 있다면 계속 값이 수정되면서 프로그램이 무한 반복된다. 시스템이 죽을 수 있다. 
			// -> 변경 못하도록 상수(final)를 쓰면 이런 코드가 있어도 예방할 수 있다.(논리 오류를 구문 오류로 바꿔주어 시간과 노력을 절감할 수 있다.)
		}
		
		//객체 생성 시 주민등록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "감자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		//Final 필드는 값을 변경할 수 없음
		//k1.nation = "USA";
		//k1.ssn = "123-12-1234";

		//비 final 필드는 값 변경 가능
		k1.name = "김자바";
	}
}