package ch16.sec02.exam01;

@FunctionalInterface // 없어도 람다식 사용 문제 없다. 컴파일러에게 명시해서 구문 오류 체크하도록 해준다.
public interface Workable {
	void work(); // 매개변수 없고, 리턴타입이 void인 추상 클래스
}