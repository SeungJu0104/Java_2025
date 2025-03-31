package ch05.homework2;

public class Lotto {
	// 랜덤은 반드시 6회만 실행. 
	private static int [] lottoArr = new int [45];
	private static int [] lottoNum = new int [6];
	private static int cnt = 45;
	
	public static void initializeLottoArr() { // 1 - 45까지 숫자를 배열에 대입
		for(int i = 0; i < 45; i++) {
			lottoArr[i] = i+1;
		}
	}
	
	public static void drawLotto() { // 랜덤함수로 인덱스 숫자 뽑고, lottoNum에 lottoArr의 해당 인덱스 값 대입
		for(int i = 0; i < 6; i++) {
			int index = (int)((Math.random())*cnt);
			Lotto.lottoNum[i] = Lotto.lottoArr[index];
			Lotto.changeArr(index, i);
		}
	}
	
	public static void changeArr(int index, int i) { 
	// 뽑은 숫자는 다시 뽑을 수 없도록 lottoArr 배열의 맨 뒤로 이동시킨다.
	// 그리고 drawLotto메소드의 for문 1회전 할 때마다 cnt를 1씩 감소시켜 랜덤함수의 최대값을 조절한다.
		
		int tmp = Lotto.lottoArr[index];
		Lotto.lottoArr[index] = Lotto.lottoArr[Lotto.lottoArr.length-i-1];
		Lotto.lottoArr[Lotto.lottoArr.length -i-1] = tmp;
		
		cnt--;
	}
	
	public static void getLottoNum() {// lottoNum 배열 출력문
		for(int tmp : Lotto.lottoNum) {
			System.out.print(tmp + " ");
		}
	}
	public static void main(String[] args) {
		Lotto.initializeLottoArr();
		Lotto.drawLotto();
		Lotto.getLottoNum();
	}

}
