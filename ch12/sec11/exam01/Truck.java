package ch12.sec11.exam01;

public class Truck extends Vehicle {
	public Truck() {
		System.out.println("기본 생성자 Truck 호출");
	}
	
	@Override
	public void run() {
		System.out.println("트럭이 달린다.");
	}
	
	public int add(int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b= " + b);
		return a + b;
	}
	
	//마이너스 함수 작성해보기
	public int minus(int a, int b) {
		int c = 0;
		System.out.println("a = " + a);
		System.out.println("b= " + b);
		if(a > b) {
			c = a-b;
		}
		return c;
	}

}
