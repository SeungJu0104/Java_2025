package ch13.sec02.exam02;

public class GenericExample {
	public static void main(String[] args) {
		
//		HomeAgency homeAgency = new HomeAgency();
//		Home home = homeAgency.rent();
//		home.turnOnLight();
//
//		CarAgency carAgency = new CarAgency();
//		Car car = carAgency.rent();
//		car.run();
		
		Rentable<?> [] arr = {new HomeAgency(), new CarAgency()}; // 일반화. 와일드카드 타입 파라미터.
		
		for(var agency : arr) {
			var obj = agency.rent();
			if(obj instanceof Home home) { // 특별화시킨 코드
				home.turnOnLight();
			}else if(obj instanceof Car car) { // 특별화시킨 코드
				car.run();
			}
		}
	}
}