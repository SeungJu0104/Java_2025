package ch09.sec05.exam02;

public class A {
	
	int age;
	String name;
	
	A(){}
	
	public A(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//A 인스턴스 필드
	String field = "A-field";
	
	//A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B {
		//B 인스턴스 필드
		String field = "B-field";
	
		//B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
	
		//B 인스턴스 메소드
		void print() {
			//B 객체의 필드와 메소드 사용
			System.out.println(this.field); // this. 생략해도 묵시적으로 B 객체의 field를 참조한다.
			this.method();
	
			//A 객체의 필드와 메소드 사용
			System.out.println(A.this.field); // 바깥 클래스의 필드에 접근하려면 바깥 클래스명.this.field 사용.
			A.this.method();
		}
	}
	
	//A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}