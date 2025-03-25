package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		//String은 동일한 데이터면 하나로 합쳐서 참조한다.
		//heap 영역 내 "홍길동"데이터의 refCount는 1에서 2로 늘어난다. (strVar1, strVar2가 참조 중)

		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		//단, new를 사용해 만들면 String인 동일 데이터이더라도 합치지 않고 별개로 관리한다.
		//strVar3, strVar4의 "홍길동"이라는 데이터는 heap 영역 내에 별개의 주소를 갖는다.
	}
}