package ch06.checkquiz;

public class AccountRe {
	
	private String accNum, name;
	private int balance;
	
	public AccountRe() {
		this.balance = 0;
		this.accNum = null;
		this.name = null;
	}
	
	public int getBalance () {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void create(String accNum, String name, int deposit) {
		if(deposit > 0 & !accNum.equals("") & !name.equals("")) {
			this.setBalance(deposit);
			this.setAccNum(accNum);
			this.setName(name);
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
		else System.out.println("결과 : 다시 확인해주세요.");
	}
	
	public void accList(AccountRe [] acc, int cnt) {
		System.out.println("------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------------------");
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%s \t %s \t %d \n", acc[i].accNum, acc[i].name, acc[i].balance);
		}
	}
	
	public AccountRe [] deposit(AccountRe [] acc, String accNum, int money, int cnt) {
		
		AccountRe ar;
		
		for(int i = 0; i< cnt; i++) {
			if((acc[i].accNum).equals(accNum) & money > 0) {
				acc[i].setBalance(acc[i].balance + money);
				break;
			}
		}
		
		return acc;
		
	}
	
	public AccountRe [] withdraw(AccountRe [] acc, String accNum, int money, int cnt) {
		for(int i = 0; i< cnt; i++) {
			if((acc[i].accNum).equals(accNum) & money > 0 & (acc[i].balance - money) > 0) {
				acc[i].setBalance(acc[i].balance + money);
				break;
			}
		}
		System.out.println("출금에 성공했습니다.");
		return acc;
		
	}
	
	

}
