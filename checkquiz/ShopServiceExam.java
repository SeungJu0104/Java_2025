package ch06.checkquiz;

public class ShopServiceExam {

	public static void main(String [] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) System.out.println("동일 ShopService 객체"); // 일반 객체는 절대 == 비교하면 안된다. static 선언해 클래스에 1개만 존재하는 객체이므로 동일 주소 값을 갖는 것
		else System.out.println("다른 ShopService 객체");
		
	}

}
