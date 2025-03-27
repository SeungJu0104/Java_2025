package ch05.sec09;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		int [] arr1 = {20,40,60};
		int [] arr2 = null;
		
		arr2 = new int [5];
		
		// for문을 사용한 배열 복사
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		// 복사한 배열 출력
		for(int tmp : arr2) {
			System.out.println(tmp);
		}
		
		// 시스템에서 제공하는 배열 복사 (반복문보다 속도 우위)
		// System.arraycopy(원본 배열명, 시작 인덱스, 복사할 배열명, 복사 배열의 시작 인덱스, 복사할 길이);
		System.arraycopy(arr1, 0, arr2, 2, arr1.length);
		
		//길이 3인 배열 
		int[] oldIntArray = { 1, 2, 3 };
		//길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		//배열 항목 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열 항목 출력
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}