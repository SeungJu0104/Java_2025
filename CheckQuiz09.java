package ch05.checkquiz;

import java.util.Scanner;

public class CheckQuiz09 {

	public static void main(String[] args) {
		boolean run = true;
		int choice;
		int studentCnt = 0;
		int [] score = null;
		int total = 0;
		double avg = 0;
		int maxScore = 0;
		Scanner scn = new Scanner(System.in);
		
		exit:
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택 > ");
			choice = Integer.parseInt(scn.nextLine());
			
			switch(choice) {
				case 1 -> {
					System.out.println("학생 수 > ");
					studentCnt = Integer.parseInt(scn.nextLine());
				}
				case 2 -> {
					score = new int [studentCnt];
					
					for(int i = 0; i < studentCnt; i++) {
						System.out.printf("scores[%d]: ", i);
						score[i] = Integer.parseInt(scn.nextLine());
					}				
				}
				case 3 -> {
					for(int i = 0; i < studentCnt; i++) {
						System.out.printf("scores[%d]: %d \n", i, score[i]);
					}
					
//					int i = 0;
//					for(var tmp : score) {
//						System.out.printf("scores[%d]: %d \n", i, tmp);
//						i++;
//					}
//				향상 for문에서 변수 i 말고 인덱스 끌어내서 쓸 수 있는 방법 없을까?					
				}		
				case 4 -> {
					
					for(int i = 0; i < studentCnt-1; i++) {
						for(int j = 0; j < studentCnt - i - 1; j++) {
							if(score[i] < score[i+1]) { // 3<4
								int tmp = score[i + 1]; // tmp = 4
								score[i+1] = score[i]; // score[i+1] = 3
								score[i] = tmp; // score[i] = 4
							}
						}
					}
					// 버블 정렬 말고 다른 정렬은?
					maxScore = score[0];
					
					for(int tmp : score) total += tmp;
					avg = total / (double)studentCnt;
					
					System.out.println("최고점수 : " + maxScore);
					System.out.println("평균점수 : " + avg);
				}
				case 5 -> {
					System.out.println("프로그램 종료");
					break exit;
				}
				default -> System.out.println("잘못 선택하셨습니다.");
			}
			
			scn.close();
			
		}

	}

}
