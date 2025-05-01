package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
	//메소드 선언
	public void method() {
		//A a = new A();		//x -> protected 접근 제한자로 동일 패키지, 자식 객체만 접근 가능.
		//a.field = "value"; 		//x ->
		//a.method(); 			//x ->
	}
}