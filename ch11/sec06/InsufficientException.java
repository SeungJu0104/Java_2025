package ch11.sec06;

public class InsufficientException extends Exception { // 사용자 정의 예외. Exception 클래스의 자식 클래스. 
	//RuntimeException의 자식 클래스로 만들면 컴파일러가 예외 처리 검사 안해준다.
	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}
}