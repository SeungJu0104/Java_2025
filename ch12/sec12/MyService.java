package ch12.sec12;

public class MyService {
	public MyService() {
		System.out.println("My서비스 기본 생성자 호출");
	}
	
	@PrintAnnotation
	public void method1() {
		//System.out.println("-----------------------");
		System.out.println("실행 내용1");
		//System.out.println("-----------------------");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		//System.out.println("***********************");
		System.out.println("실행 내용2");
		//System.out.println("***********************");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		//System.out.println("################");
		System.out.println("실행 내용3");
		//System.out.println("################");
	}
}