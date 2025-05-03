package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Parent newParent = new Parent();
		//자식 객체 생성
		Child child = new Child();
		
		newParent.method1();
		newParent.method2();
		
		//자동 타입 변환
		// 자식 객체는 부모로 자동 형변환 가능
		// 고양이는 동물이다. (O)
		Parent parent = null;
		parent = child; // 업캐스팅

		//메소드 호출
		parent.method1();
		parent.method2(); 
		// method2는 자식 클래스에서 오버라이딩 -> 부모 객체로 호출해도 자식 클래스에 오버라이딩한 메소드 출력 
		//parent.method3(); (호출 불가능)
		
		Parent [] arr = {new Parent(), new Parent(), new Parent(), new Child(),  new Child(),  new Child(), new Parent(), new Child()};
		
		for(Parent obj : arr) {
			obj.method2();
		}
		
		// 강제 형변환
		Child child2 = (Child)newParent;
		child2.method3();
		
	}
}