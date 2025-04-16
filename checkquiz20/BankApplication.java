package ch06.checkquiz20;

import java.util.Scanner;

public class BankApplication {
	
	private static int cnt = 0;
	private static String selectNo = null;
	
	private static Account [] accArray = new Account [100];
	private static Scanner scn = new Scanner(System.in);
	
	BankApplication () {}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		BankApplication.cnt = cnt;
	}

	public static String getSelectNo() {
		return selectNo;
	}

	public static void setSelectNo(String selectNo) {
		BankApplication.selectNo = selectNo;
	}

	public static Account[] getAccArray() {
		return accArray;
	}

	public static void setAccArray(Account[] accArray) {
		BankApplication.accArray = accArray;
	}

	public static Scanner getScn() {
		return scn;
	}

	public static void setScn(Scanner scn) {
		BankApplication.scn = scn;
	}

	public static void main(String[] args) {
		
		boolean run = true;
		
		program:
			while(run) {
				System.out.println("-----------------------------------------------------");
				System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
				System.out.println("-----------------------------------------------------");
				System.out.print("선택 > ");
				
				selectNo = scn.nextLine();
				BankApplication.checkSelectNo(BankApplication.getSelectNo());
				
				switch(selectNo) {
				case "1" -> {
					BankApplication.createAcc();
				}
				
				case "2" -> {
					BankApplication.accList();
				}
				
				case "3" -> {
					BankApplication.accDeposit();
				}
				
				case "4" -> {
					BankApplication.accWithdraw();
				}
				
				case "5" -> {
					System.out.println("프로그램 종료");
					break program;
				}
				
				}
			}	

	}
	
	public static void checkSelectNo (String selectNo) {
		if(!("").equals(selectNo) & selectNo != null) {
			selectNo.trim();
		}
	}
	
	public static void createAcc() {
		
		String accNum = null, accOwner = null;
		int balance = 0;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------------------------------------------");
		System.out.print("계좌 번호 : ");
		accNum = scn.nextLine();
		System.out.print("계좌주 : ");
		accOwner = scn.nextLine();
		System.out.print("초기입금액 : ");
		balance = Integer.parseInt((scn.nextLine()).trim());
		
		Account ac = new Account(accNum, accOwner, balance);
		
		for(int i = 0; i < BankApplication.accArray.length; i++) {
			if(BankApplication.accArray[i] == null) {
				BankApplication.accArray[i] = ac;
				BankApplication.cnt++;
				System.out.println("결과 : 계좌가 생성됐습니다.");
				break;
			}
		}
	}
	
	public static void accList() {
		
		Account ac;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("계좌목록");
		System.out.println("-----------------------------------------------------");
		
		for(int i = 0 ; i < BankApplication.cnt; i++) {
			ac = BankApplication.accArray[i];
			System.out.printf("%s \t %s \t %d \n", ac.getAno(), ac.getOwner(), ac.getBalance());
		}
		
	}
	
	public static void accDeposit() {
		String accNum = null;
		int money = 0;
		Account ac;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("예금");
		System.out.println("-----------------------------------------------------");
		System.out.print("계좌번호 : ");
		accNum = (scn.nextLine()).trim();
		System.out.print("예금액 : ");
		money = Integer.parseInt((scn.nextLine()).trim());
		
		BankApplication.checkSelectNo(accNum);
		
		for(int i = 0; i < BankApplication.cnt; i++) {
			ac = BankApplication.accArray[i];
			
			if((ac.getAno()).equals(accNum) & money > 0) {
				ac.setBalance(ac.getBalance() + money);
				System.out.println("결과 : 예금 완료");
			}
		}
		
	}
	
	public static void accWithdraw() {
		String accNum = null;
		int money = 0;
		Account ac;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("출금");
		System.out.println("-----------------------------------------------------");
		System.out.print("계좌번호 : ");
		accNum = (scn.nextLine()).trim();
		System.out.print("출금액 : ");
		money = Integer.parseInt((scn.nextLine()).trim());
		
		for(int i = 0; i < cnt; i++) {
			ac = BankApplication.accArray[i];
			
			if((ac.getAno()).equals(accNum) & money > 0 & (ac.getBalance() > money)) {
				ac.setBalance((ac.getBalance()) - money);
				System.out.println("결과: 출금 완료");
			}
		}
	}
	


}
