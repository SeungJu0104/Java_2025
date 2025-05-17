package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();

		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); (x) 
		// checkFare()라는 함수가 vehicle 인터페이스에 없으므로 실행 불가능. 
		// 컴파일러는 일단 Vehicle 인터페이스에 해당 함수가 있는지 없는지 체크하기때문에 에러 발생.

		//강제 타입 변환후 호출
		Bus bus = (Bus) vehicle; 
		bus.run();
		bus.checkFare(); // Bus 클래스에는 있으므로 가능.
	}
}