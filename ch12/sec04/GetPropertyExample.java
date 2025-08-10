package ch12.sec04;

import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class GetPropertyExample {
	
   
    
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		// 변화량
		int a = 10; //10 => 값(고정),   a => 변수명(고정), 변수값(
        int b = 20; //20 => 값(고정),   b => 변수명(고정)

//        int sum = 0;
//        sum = 10 + 20;
//
//        a = Integer.parseInt(scanner.nextLine());
//        b = Integer.parseInt(scanner.nextLine());
        a = Integer.parseInt(System.getenv("ENV_A")); 
        // PC의 시스템에 있는 환경변수 ENV_A를 갖고 온다. 값을 갖고 올때 ENV_A라는 이름은 고정.
        b = Integer.parseInt(System.getenv("ENV_B")); 
        // PC의 시스템에 있는 환경변수 ENV_B를 갖고 온다. 값을 갖고 올때 ENV_B라는 이름은 고정.
        int sum = a + b; //실행중, a => 변수명(고정), a의 변수값
        System.out.println(sum);

        
		//운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name"); // OS 종류
		String userName = System.getProperty("user.name"); // 사용자 계정
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
//
//		//전체 키와 값을 출력
//		System.out.println("---------------------------------");
//		System.out.println(" key: value");
//		System.out.println("---------------------------------");
//		Properties props = System.getProperties();
//		Set keys = props.keySet();
//		for(Object objKey : keys) {
//			String key = (String) objKey;
//			String value = System.getProperty(key);
//			System.out.printf("%-40s: %s\n", key, value);
//		}
	}
}