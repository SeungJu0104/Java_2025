                       package ch06.sec11.exam01;

public class Korean {
	//인스턴스 final 필드 선언
	// 인스턴스 멤버 변수(= 인스턴스 변수, 멤버 변수)
	// final 선언 후 한번 초기화하면 해당 값은 변경 불가능
	// 코딩할 때 변경될 변수 제외하고 final을 써주면 불필요한 에러를 방지할 수 있어 추천한다.
	final String nation = "대한민국";
	final String ssn; // 상수는 필드 선언과 함께 대입해 초기화하거나 생성자에서 대입해 초기화만 가능
	
	//인스턴스 필드 선언
	String name;

	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	void setSsn(String ssn) {
		this.ssn = ssn; // ssn이 final 선언된 상수이므로 값 변경이 불가능하다.
		// final 선언되지 않은 변수는 값 변경이 가능하다.
	}
}