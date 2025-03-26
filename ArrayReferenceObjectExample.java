package ch05.sec08;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {		
		String[] strArray = new String[3];
		strArray[0] = "Java"; // 암시적으로 heap 영역에 생성
		strArray[1] = "Java"; // 암시적으로 heap 영역에 생성
		// strArray[0]와 strArray[1]은 동일한 객체 참조(String은 특이하게 동일 데이터면 하나만 참조하도록 만든다.)
		strArray[2] = new String("Java");
		// new 연산자를 사용해 명시적으로 기존 "Java"와는 다른 "Java"라는 객체를 생성.
		
		// 암시적 배열 객체 선언 및 초기화
		String [] strArrayN = {"Java", "Java", new String("Java")};
		
		// 명시적으로 배열 객체 선언 및 초기화 실습
		String [] strArrayRe = new String [] {"Java", "Java", "Java"};
		
		// 명시적 암시적 배열 객체 선언 및 초기화

		System.out.println( strArray[0] == strArray[1] );		//true: 같은 객체 참조
		System.out.println( strArray[0] == strArray[2] );    	//false: 다른 객체를 참조
		System.out.println( strArray[0].equals(strArray[2]) );	//true: 문자열이 동일
	} 
}