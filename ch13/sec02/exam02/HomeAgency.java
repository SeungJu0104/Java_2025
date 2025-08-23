package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> { // Home 타입으로 제한
	@Override
	public Home rent() {
		return new Home();
	}
}