package ch13.sec02.exam03;

public class Box<T> {
	public T content; // 필드

	//Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
//		boolean result = content.equals(other.content);
//		return result;
		return content.equals(other.content); // 가능하면 변수에 담지 말고 리턴하는 것이 좋다.
	}
}