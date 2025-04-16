package ch06.checkquiz;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		String choice = null, name = null, accNumber = null;
		int money = 0, cnt = 0;
		AccountRe [] accArray = new AccountRe [100];
		
		exit:
		while(run) {
			
			AccountRe account = new AccountRe();
			
			System.out.println("------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택 >");
			
			choice = scn.nextLine();
			
			switch(choice) {
				case "1" -> {
					System.out.println("------------------------------------");
					System.out.println("계좌 생성");
					System.out.println("------------------------------------");
					
					System.out.print("계좌 번호 : ");
					accNumber = scn.nextLine();
					System.out.print("계좌주 : ");
					name = scn.nextLine();
					System.out.print("초기입금액 : ");
					money = Integer.parseInt(scn.nextLine());
					account.create(accNumber, name, money);
					accArray[cnt] = account;
					cnt ++;
				}
				
				case "2" -> {
					account.accList(accArray, cnt);
				}
				
				case "3" -> {
					System.out.println("------------------------------------");
					System.out.println("예금");
					System.out.println("------------------------------------");
					System.out.print("계좌번호 : ");
					accNumber = scn.nextLine();
					System.out.print("예금액 : ");
					money = Integer.parseInt(scn.nextLine());
					accArray = account.deposit(accArray, accNumber, money, cnt);
				}
				
				case "4" -> {
					System.out.println("------------------------------------");
					System.out.println("출금");
					System.out.println("------------------------------------");
					System.out.print("계좌번호 : ");
					accNumber = scn.nextLine();
					System.out.print("출금액 : ");
					money = Integer.parseInt(scn.nextLine());
					accArray = account.withdraw(accArray, accNumber, money, cnt);
				}
				
				case "5" -> {
					System.out.println("프로그램 종료");
					break exit;
					}
			}
		}
	}
}
