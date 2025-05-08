package ch07.checkquiz.q09;

public class InheritanceExample {
	
	class A {}
	class B extends A {}
	class C extends A {}
	class D extends B{}
	class E extends D{}
	
	void method(B b) {}

	public static void main(String[] args) {
		
		method(new B()); 
		method((B)new A()); // X (다운 캐스팅)
		method(new D());
		method(new E());

	}

}
