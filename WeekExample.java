package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	
	static Week getWeek(Calendar cal) {
		//		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case 1: return Week.SUNDAY ;
			case 2: return Week.MONDAY ;
			case 3: return Week.TUESDAY ;
			case 4: return Week.WEDNESDAY ;
			case 5: return Week.THURSDAY ;
			case 6: return Week.FRIDAY ;
			case 7: return Week.SATURDAY ;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		//Week 열거 타입 변수 선언
		Week today = null;
 
		//Calendar 얻기
		Calendar cal = Calendar.getInstance(); // Calendar 객체 생성은 getInstance 함수 사용
		
		//연월일 시분초 요일
		System.out.println("년도 = " + cal.get(Calendar.YEAR));
		System.out.println("달 = " + cal.get(Calendar.MONTH));
		System.out.println("날 = " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 = " + cal.get(Calendar.DAY_OF_YEAR));
		
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);

		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1: today = Week.SUNDAY ; break;
			case 2: today = Week.MONDAY ; break;
			case 3: today = Week.TUESDAY ; break;
			case 4: today = Week.WEDNESDAY ; break;
			case 5: today = Week.THURSDAY ; break;
			case 6: today = Week.FRIDAY ; break;
			case 7: today = Week.SATURDAY ; break;
		}
		
		//열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}