package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		x = x+1; // 단순 연산식. 실제 연산 수행.
		x++; //CPU 내에 1씩 증가하는 명령어를 이용.(속도 우위)
		++x;
		System.out.println("x=" + x);		

		System.out.println("-----------------------");		
		y--;
		--y;
		System.out.println("y=" + y);		

		System.out.println("-----------------------");		
		z = x++; // 후위형 증가 연산자 : 연산 수행 후 증가 발생
		// z = 10, x = 11 (z에 주소값 넘긴 후 연산 수행)
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x; // 전위형 증가 연산자 : 현재 위치에서 증가 발생
		// z = 11, x = 11
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		// z = 21, x = 11, y = 10
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y); // z에 대입 후 후위 연산 수행하므로 11
	}
}