package ch12.sec11.exam03;

public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1Path = clazz.getResource("photo1.jpg").getPath(); // 현재 위치 기준으로 이동 경로 설정
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath(); // 현재 위치 기준으로 이동 경로 설정

		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}