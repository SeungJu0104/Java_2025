package ch07.sec07.exam02;

class 고양이 extends Animal{
	public void 울다() {
		System.out.println("야옹");
	}
	
}
class 강아지 extends Animal{
	public void 울다() {
		System.out.println("멍멍");
	}
}

public class Animal { // 추상만드려면 public 대신 abstract 붙인다. 근데 main 있으니까 abstract 못쓴다. 함수에도 abstract 붙인다.
	
	public void 울다() {}

	public static void main(String[] args) {
		
		Animal 야옹이 = new 고양이();
		Animal 강아지 = new 강아지();
		
		강아지.울다();
		
		
		if(야옹이 instanceof 고양이) {
			고양이 미미 = (고양이) 야옹이;
			System.out.println("고양이로 강제 형변환");
		}
		else System.out.println("고양이로 강제 형변환 실패");
		
		if(야옹이 instanceof 강아지) {
			강아지 멍멍이 = (강아지)야옹이;
			System.out.println("강아지로 강제 형변환");
		}
		else System.out.println("강아지로 강제 형변환 실패");
		
		if(야옹이 instanceof 고양이 cat) {
			System.out.println("고양이로 강제 형변환");
		}
		else System.out.println("고양이로 강제 형변환 실패");

	}

}
