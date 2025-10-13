package ch15.sec04.exam03;

import java.util.Properties;
	
public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		//Properties 컬렉션 생성
		Properties properties = new Properties();

		//PropertiesExample.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties")); // 리플렉션 이용

		//주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver"); // getProperty 함수는 강제로 String 형변환까지 수행해준다. 단순 get하면 Obect 타입으로 갖고 온다.
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");

		//값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
	}
}