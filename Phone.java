package ch07.sec02;

class A {
	int field1;
	
	A(){ // A의 기본 생성자를 명시적으로 작성. 매개변수를 가진 별도의 생성자 함수가 없다면 컴파일러가 묵시적으로 자동 생성.
		System.out.println("A() 생성자 함수 호출");
	}
	A(int field1){
		this.field1 = field1;
	}
	void method1() {}
}

class C {
	int field3;
	void method3() {}
}

class B extends A { // A가 부모 클래스, B가 자식 클래스. 부모 클래스는 1개. 자식 클래스는 다중 가능
	int field2;
	B(){
		// super(); // 부모의 기본 생성자를 명시적으로 호출. 부모 기본 생성자가 없다면 부모 먼저 만들고 생성한다.
		// 부모 클래스가 먼저 실행되어야하므로 super 이전에는 코드 작성을 할 수 없다.
		// super(100); // 매개변수가 있는 부모의 생성자 함수를 호출.
		// 생성자 함수에서 this를 이용해 다른 생성자를 호출할 때에는 super를 쓰면 안된다.
		// this로 호출한 함수에서도 부모를 호출하므로 결과적으로 부모가 2번이나 호출되게 된다.
		this(0,0);
		System.out.println("B() 생성자 함수 호출");
	}
	
	B(int field2){
		// super(100);
		// 생성자 함수에서 this를 이용해 다른 생성자를 호출할 때에는 super를 쓰면 안된다.
		// this로 호출한 함수에서도 부모를 호출하므로 결과적으로 부모가 2번이나 호출되게 된다.
		this(100, field2);
	}
	
	B(int field1, int field2){
		// this.field2 = field2;
		// 부모 클래스가 먼저 실행되어야하므로 super 이전에는 코드 작성을 할 수 없다.
		super(field1);
		this.field2 = field2;
		System.out.println("");
	}
	void method2() {}
	
}

public class Phone {
	//필드 선언
	public String model;
	public String color;

	//메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	public static void main(String [] args) {
		B b = new B();
		b.field1 = 10;
		b.field2 = 10;
		
	}
	
}