package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
			case '1':
			case '3':
			case '5': // 2000년 이전 귀화한 남성 외국인
			case '7': // 2000년 이후 귀화한 남성 외국인
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
			case '6': // 2000년 이전 귀화한 여성 외국인
			case '8': // 2000년 이후 귀화한 여성 외국인
				System.out.println("여자입니다.");
				break;
		}
	}
}