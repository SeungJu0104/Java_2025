package ch08.sec07;

public interface Service {
	//디폴트 메소드(일반 메소드의 일종)(인터페이스의 생략시 기본 접근제한자는 public)
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}

	//private 메소드(private 이므로 외부에서 접근 불가능.)
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}

	//정적 메소드(정적 필드, 정적 메소드만 호출 가능. 생략됐지만 접근제한자가 public 이므로 클래스 명으로 외부에서 호출 가능.)
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon(); // 묵시적 동작. 명시적으로 Service.staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
	}

	//private 정적 메소드(정적 메소드의 일종이므로 정적 메소드에 사용 가능. private 이므로 클래스 명으로 외부에서 호출 불가능.)
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}