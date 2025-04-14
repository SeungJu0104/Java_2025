package ch06.sec15;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SingletonExample {
	public static void main(String[] args) {
		
		// 정적 메소드를 호출해서 싱글톤 객체 얻음
		Car car1 = Car.getCar();
		
		/*
 		Singleton obj1 = new Singleton(); //컴파일 에러
 		Singleton obj2 = new Singleton(); //컴파일 에러
		 */
		
		//정적 메소드를 호출해서 싱글톤 객체 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		//동일한 객체를 참조하는지 확인
		if(obj1 == obj2) { // 싱글톤 객체는 1개이기 때문에 == 로 비교 가능
										// 일반적인 클래스 객체를 == 로 비교하면 안된다. 일반적인 인스턴스는 서로 다른 주소 값을 가진다. (== 는 주소 값 비교)
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(sdf.format(now.getTime()));
		
	}
}