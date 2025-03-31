package ch05.checkquiz;

public class CheckQuiz07 {

	public static void main(String[] args) {
		// 주어진 배열을 최대값부터 내림차순으로 정렬
		int [] array = {1, 5, 8, 3, 2};
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] < array[j+1]) { // 3 < 4
					int tmp = array[j]; //tmp = 3
					array[j] = array[j+1]; // array[i] =  4
					array[j+1] = tmp; // array[i+1] = 3
				}
			}
		}
		System.out.println("최대값 : " + array[0]);
		// 버블정렬 말고 다른 정렬 없을까?
		// 강사님께 정렬 설명 부탁드리자
		
		System.out.println("--------------------------------------------------------------");
		//최대값만 뽑자
		int max = 0;
		for(int tmp : array) {
			if(tmp > max) max = tmp;
		}
		System.out.println("최대값 : " + max);
	}

}
