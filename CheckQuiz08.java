package ch05.checkquiz;

public class CheckQuiz08 {

	public static void main(String[] args) {
		// 주어진 배열의 전체 합과 평균 출력
		int [][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int total = 0;
		int count = 0;
		double avg = 0.0;
		
		for(int i = 0; i < array.length ; i++) {
			for(int j = 0; j < array[i].length; j++) {
				count += 1;
				//System.out.println(count);
				//System.out.println(array[i][j]);
				total += array[i][j];
			}
		}
		avg = total / (double) count;
		
		System.out.println("전체 합 : " + total);
		System.out.println("배열 개수 : " + count);
		System.out.println("평균 : " + avg);
		
//		for(int i = 0; i < array.length ; i++) {
//			count += array[i].length;
//			for(int j = 0; j < array[i].length; j++) {
//				//System.out.println(count);
//				//System.out.println(array[i][j]);
//				total += array[i][j];
//			}
//		}
//		avg = total / (double) count;
		
		System.out.println("전체 합 : " + total);
		System.out.println("배열 개수 : " + count);
		System.out.println("평균 : " + avg);
		
	}

}
