package checkquiz.q08;

public class Example {
	public static void action(A a) {
		a.method();
		if(a instanceof C c) { // 자바 12이상
			c.method2();
		}
		
//		if(a instanceof C) {
//			C c = (C) a;
//			c.method2();
//		}
	}
	
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

}
