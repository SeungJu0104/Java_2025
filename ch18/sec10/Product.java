package ch18.sec10;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -621812868470078544L; // 동일 클래스라는걸 검증하는 필드
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() { return name + ": " + price; }
}