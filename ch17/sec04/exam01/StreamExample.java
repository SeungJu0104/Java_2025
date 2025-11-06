package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// 레거시 방법
		//List 컬렉션 생성
		List<Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			Product product = new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random()));
			list.add(product);
		}
		
		for(Product p : list) {
			System.out.println(p); // 묵시적으로 p.toString()이 동작.
		}
		
		// 스트림 방법
		//객체 스트림 얻기
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p)); // p는 Product 클래스의 객체. 묵시적으로 p.toString()이 동작.
	}
}