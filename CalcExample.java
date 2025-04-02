package ch06.sec06.exam02;

public class CalcExample {
	
	public static void main(String [] args) {
		int res;
		
		// 객체 obj 생성
		Calc obj = new Calc();
		
		res = obj.add(10, 20);
		System.out.println("10 + 20 = " + res);
		
		res = obj.sub(20, 10);
		System.out.println("20 - 10 = " + res);
		
		obj.print();
		
		Calc obj2 = new Calc();
		System.out.println("10 + 10 = " + obj.add(10, 10));
	}

}
