package ch07.checkquiz.q10;

public abstract class Machine {
	
	public void powerOn() {
		System.out.println("전원 On");
	}
	public void powerOff() {
		System.out.println("전원 Off");
	}
	public abstract void work();

}
