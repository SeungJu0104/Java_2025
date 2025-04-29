package ch07.sec04.exam01;

public class Calculator { // 부모 클래스
	//원의 면적을 계산하는 메소드 선언
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
	public void foo() {
		System.out.println("Calculator 객체의 foo() 실행");
	}
}