package ch07.sec07.exam02;

public class Child extends Parent {
	//메소드 오버라이딩
	// 부모에서 구현된 기능을 자식에서 재정의
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}

	//메소드 선언
	// 자식 클래스에서 선언한 새로운 메소드
	public void method3() { 
		System.out.println("Child-method3()");
	}
}