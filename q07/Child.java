package ch07.checkquiz.q07;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() Call");
	}
	
	public Child(String name) {
		// super(); // 생략. 컴파일러가 묵시적으로 작성 후 실행.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
