package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		//Stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기
		coinBox.push(new Coin(100)); // 스택에 Coin 객체를 생성해 넣는다.
		coinBox.push(new Coin(50)); // 스택에 Coin 객체를 생성해 넣는다.
		coinBox.push(new Coin(500)); // 스택에 Coin 객체를 생성해 넣는다.
		coinBox.push(new Coin(10)); // 스택에 Coin 객체를 생성해 넣는다.

		//동전을 하나씩 꺼내기
		// 코테 자료구조로 많이 사용한다.
		while(!coinBox.isEmpty()) { // Coin 객체가 있다면(비어있지 않다면)
			Coin coin = coinBox.pop(); // Coin 객체를 뺀다.
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}