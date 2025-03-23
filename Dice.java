package checkquiz04;

public class Dice {

	public static void main(String[] args) {
		program:
		while(true) {
			int diceRes1 = ((int)((Math.random() * 6) + 1));
			int diceRes2 = ((int)((Math.random() * 6) + 1));
			
			if((diceRes1 + diceRes2) == 5) {
				System.out.printf("(%d, %d) \n", diceRes1, diceRes2);
				break program;
			}
			else continue;
			
//			switch(diceRes1 + diceRes2) {
//			case 5 -> {
//				System.out.printf("( %d, %d) \n", diceRes1, diceRes2);
//				break program;
//			}
//			}
		}

	}

}
