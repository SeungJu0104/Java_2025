package ch06.sec11.exam02;

public class Earth {
	//상수 선언 및 초기화
	// static이므로 클래스 로딩과 함께 메모리에 상주
	static final double EARTH_RADIUS = 6400;

	//상수 선언
	// static이므로 클래스 로딩과 함께 메모리에 상주
	static final double EARTH_SURFACE_AREA;
	
	//정적 블록에서 상수 초기화
	// 여러줄 코딩 필요할 때 정적 블록 사용
	// 정적 블록에서 객체 메소드 호출하려면 객체 선언해 참조변수 만들고 접근해야한다.
	// 클래스 로딩과 함께 메모리에 상주
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}