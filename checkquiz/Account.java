package ch06.checkquiz;

public class Account {
	
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	
	public Account () {
		this.balance = 0;
	}
	
	public int getBalance () {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE & balance <= MAX_BALANCE) this.balance = balance;
		else System.out.println("처리에 실패하였습니다.");
	}
	
	public int getMIN_BALANCE() {
		return MIN_BALANCE;
	}
	
	public int getMAX_BALANCE() {
		return MAX_BALANCE;
	}
	
	

}
