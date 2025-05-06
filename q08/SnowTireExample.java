package ch07.checkquiz.q08;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // Tire 타입으로 업캐스팅. Tire tire = (Tire)snowTire;
		
		snowTire.run();
		tire.run();
	}

}
/**
 * 스노우 타이어가 굴러갑니다.
 * 스노우 타이어가 굴러갑니다.
 */
