package ch13.sec02.exam02;
	
public class CarAgency implements Rentable<Car>{ // Car 타입으로 제한
	@Override
	public Car rent() {
		return new Car();
	}
}