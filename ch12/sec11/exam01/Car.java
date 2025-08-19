package ch12.sec11.exam01;
/*
 * 우리가 코딩에 사용하는 단어들은 사전에 동작이 정의된 "예약어"
 */
public class Car {
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public String toString() {
		return "Car [speed = " + speed + " ]";
	}
	
	
}