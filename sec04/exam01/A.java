package ch09.sec04.exam01;

public class A {
	//생성자
	A() {
		//로컬 클래스 선언
		class B { } // 지역변수처럼 사용

		//로컬 객체 생성
		B b = new B();
	}

	//메소드
	void method() { // 메소드별로 A$1B.class, A$2B.class, ... 파일 형태로 저장된다.
		//로컬 클래스 선언
		class B { } // 지역변수처럼 사용

		//로컬 객체 생성
		B b = new B();
	}
}