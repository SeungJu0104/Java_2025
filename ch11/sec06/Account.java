package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() { }
	
	// 현재 통장 잔고 리턴
	public long getBalance() {
		return balance;
	}
	
	// 예금 : balance + money
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 : balance - money
	public void withdraw(int money) throws InsufficientException { // throws로 예외 처리할 클래스 지정
		if(balance < money) {
			throw new InsufficientException("잔고 부족: "+(money-balance)+" 모자람"); // throw로 지정한 클래스로 예외를 던진다.
		}
		balance -= money;
	}
}