package ch06.checkquiz;

public class ShopService {
	
	// 정적 객체 선언
	// 객체 접근 제한(private) 및 외부 객체 생성 제한(static)
	private static ShopService shopService = new ShopService();
	
	// 생성자 접근 제한
	private ShopService () {}
	
	// 함수 통해서만 객체 접근
	public static ShopService getInstance() {
		return shopService;
	}

}
