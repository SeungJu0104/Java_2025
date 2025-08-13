package ch12.sec06;

public class ValueCompareExample {
	public static void main(String[] args) {
		//-128~127 초과값일 경우
		// 범위 내에서는 객체가 미리 만들어져 있어 동일 번지, 동일 값을 가지지만
		// 범위 외에서는 객체가 새로 생성되어 다른 번지 값을 가진다.
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==: " + (obj1 == obj2)); // 번지 비교
		System.out.println("equals(): " + obj1.equals(obj2)); // 값 비교
		System.out.println();

		//-128~127 범위값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==: " + (obj3 == obj4)); // 번지 비교
		System.out.println("equals: " + obj3.equals(obj4)); // 값 비교
	}
}