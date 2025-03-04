package ch01.sec06;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hel1o, Java1"); // 줄 바꿈
		System.out.print("Hello, Java2"); // 줄 변화 없음
		System.out.print("Hello, Java3"); // 줄 변화 없음
		System.out.printf
		("Hello, Java4"); // 줄 변화 없음
		
		System.out.println();
		
		int age = 10;
		age += 10; // age = age + 10;
		System.out.println("age = " + age);
		
		 char ch = 'A'; // char ch = 65;
		// 아스키코드에서 10진수 65는 대문자 A로 치환된다.
		// 문자 리터럴을 쓰면 사람이 판단하기 편하다.(논리적인 의미)
		System.out.println("ch = " + ch); // 문자 A 출력
		 
		 ch = (char)(ch + 1); // 정수는 char형으로 자동 변환되지 않는다.
		 System.out.println("ch = " + ch);
		 
		 float f = 123.4567f;
		 System.out.println("f = " + f);
		 
		 double d = 123.4567f;
		 System.out.println("d = " + d);
		 
		 boolean stop = true;
		 // stop = false;
		 System.out.println("stop = " + stop);
		 
		 int x = 10; // 변수 선언 및 초기화
		 boolean res = (x == 20); // x의 값은 20이다.
		 System.out.println("res = " + res);
		 
		 res = (x != 20); // x의 값은 20이 아니다.
		 System.out.println("res = " + res);
		 
		 // boolean res = (x != 20); -> 에러 발생 -> res라는 이름의 변수를 다시 선언했기 때문이다.(동일 이름의 로컬변수는 1개만)
		         
		 String str = "HelloWorld";
		 System.out.println(str);
		 
		 char c = 65;
		 System.out.println(c);
		 
		 System.out.println("         오늘\r");
		 
		 
	}

}
