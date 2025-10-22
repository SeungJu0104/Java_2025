package ch16.sec01;

@FunctionalInterface // 람다식 사용가능한 인터페이스 선언 -> 컴파일러가 구문 오류 체크해준다.(없어도 람다식 사용 가능하다.)
public interface Calculable {
	//추상 메소드
	int calculate(int x, int y);
}