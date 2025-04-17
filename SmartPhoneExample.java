package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		//Phone(부모클래스)으로부터 상속받은 필드 읽기
		// 자식 클래스 객체로 부모 클래스 필드에 접근할 수 있다.
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);

		//Phone(부모클래스)으로부터 상속받은 메소드 호출
		// 자식 클래스 객체로 부모 클래스 메소드에 접근할 수 있다.
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
}