package ch07.checkquiz.q06;

public class Child extends Parent{
	
	public int studentNo;
	
	public Child(String name, int studentNo) {
		// this.name = name; // 해결 2
		super(name); // 해결 2
		this.studentNo = studentNo;
	}
	
}
/**
 * 원인 : 부모 클래스의 생성자가 호출되지 않았기 때문이다.
 * 
 * 해결 1 ) 부모 클래스에 기본 생성자를 작성한다. 그러면 컴파일러가 묵시적으로 super(); 를 수행한다.
 * 해결 2) 자식 클래스에 매개변수 있는 생성자 실행문의 this.name = name; 을 지우고, super(name); 을 명시적으로 작성하면
 * 			부모 클래스의 매개변수 있는 생성자를 실행한다.
 * 
 * 해결 2 방법이 상대적으로 좋은 코드
 */
