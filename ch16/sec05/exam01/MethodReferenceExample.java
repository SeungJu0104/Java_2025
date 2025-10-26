package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//정적 메소드일 경우
		//람다식
		person.action((x, y) -> x+y); // 일반 메소드(리턴 생략)
		person.action((x, y) -> Computer.staticMethod(x, y));	// Computer의 정적 메소드 호출(리턴 생략)
		//메소드 참조
		person.action(Computer :: staticMethod); 
		// 추상 메소드의 매개변수 개수와 타입이 일치하면 람다식의 매개변수까지 생략해서 사용할 수 있다.
		// person.action((x, y) -> Computer.staticMethod(x, y)); 와 동일
		// 내부적으로는 주소가 매핑되어 처리 속도가 매우 빠르다.
		// 클래스명 :: 메소드명
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		//람다식
		//person.action((x, y) -> com.instanceMethod(x, y));		
		//메소드 참조
		person.action(com :: instanceMethod);
		// 추상 메소드의 매개변수 개수와 타입이 일치하면 람다식의 매개변수까지 생략해서 사용할 수 있다.
		// 정적 메소드가 아닌 인스턴스 메소드도 참조해 사용할 수 있다.
		// //person.action((x, y) -> com.instanceMethod(x, y));	와 동일
		// 객체명 :: 메소드명
	}
}