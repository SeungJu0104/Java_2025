package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();

		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		//매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
		driver.drive(bus); // 일반화(추상 메소드 또는 인터페이스 이용)
		driver.drive(taxi); // 일반화(추상 메소드 또는 인터페이스 이용)
	}
}