package ch05.sec11;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		int a, b, res;
		Scanner sc = new Scanner(System.in);
		
		//프로그램 실행 중 문자열 수치를 입력 받아 처리하는 방법
		System.out.println("a = ");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("b = ");
		b = Integer.parseInt(sc.nextLine());
		
		res = a + b;
		
		System.out.printf("%d + %d = %d", a,b,res);
		
		sc.close();
	}

}
