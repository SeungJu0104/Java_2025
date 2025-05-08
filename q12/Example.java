package ch07.checkquiz.q12;

public class Example {
	
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) { // 자바 15 이후부터 true면 묵시적으로 형변환까지 수행해준다.
			// C c = (C)a; // 자바 15 이전에는 별도로 명시해서 형변환해야했다.
			c.method2();
		}
		else System.out.println("C 타입으로 형변환 불가능");
	}

	public static void main(String[] args) {
		
		action((new A())); // C타입으로 형변환 불가능
		action((new B())); // method of C
		action((new C())); // method2 of C

	}

}
