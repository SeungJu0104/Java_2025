package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl(); // 객체 생성

		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); // 상속 관계도 아니고 InterfaceA에는 methodB가 선언되지 않았으므로 에러 발생.
		System.out.println();

		InterfaceB ib = impl;
		//ib.methodA(); // 상속 관계도 아니고 InterfaceB에는 methodA가 선언되지 않았으므로 에러 발생.
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		// ic = ia;
		if(ia instanceof InterfaceC) {
			ic = (InterfaceC) ia;
			ic.methodA();
			ic.methodB();
			ic.methodC();
		}
		
		if(ia instanceof InterfaceC c) { // ic = (InterfaceC) ia; 가 포함.
			c.methodA();
			c.methodB();
			c.methodC();
		}
	}
}