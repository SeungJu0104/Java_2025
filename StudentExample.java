package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		// Student 클래스 활용해 객체 생성 과정 확인하기

		Student s1 = new Student(); 
		// Student 클래스의 s1 이라는 객체(인스턴스) 생성
		// s1은 참조변수이고, new 연산자를 이용해 Heap 영역에 객체가 생성됐다.
		// 스택 영역에 만들어진 참조변수 s1은 Heap 영역에 생성된 객체의 주소 값을 저장한다. 
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		
		// s1 = s2; 
		// s2의 객체 주소값이 s1에 대입된다.
		// 기존 s1 객체와의 연결이 끊어진다.
		// 그럼 Heap 영역에 있던 s1의 객체는 Garbage Collector에 의해 정리된다.(refCount = 0)
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}