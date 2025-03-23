package checkquiz02;

public class Grade {
	private static  String grade = "B";
	private static int score = 0;
	
	public static void main(String [] args) {
		switch(grade) {
		case "A" -> score = 100;
		case "B" -> {
			int res = 100 - 20;
			score = res;
		}
		default -> score = 60;
		}
	}

}
