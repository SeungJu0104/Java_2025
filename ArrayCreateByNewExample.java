package ch05.sec06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		//배열 변수 선언, 초기화와 배열 생성
		int[] arr1 = new int[3];
		//배열 항목의 초기값 출력
		
		//명시적
		int [] arr = new int [] {10,20,30}; // 직접 new 연산자 이용해 heap영역에 명확히 공간 생성하도록 코드 작성
		// 암시적
		int [] arrEx = {10,20,30}; // new 연산자는 생략되었지만 자동으로 heap영역에 공간 생성하도록 코드 작성
		
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//배열 항목의 변경 값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
		for(var i : arr1) {
			System.out.println();
			System.out.println(i);
		}

		//배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		//배열 항목의 변경 값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");

		//배열 변수 선언과 배열 생성
		String[] arr3 = new String[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		//배열 항목의 변경값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
	}
}