package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11 이전 문법
		int score1 = 0;
		switch(grade) {
		    case "A":
		    	score1 = 100;
		    	break;
		    case "B":
		    	int result = 100 - 20;
		    	score1 = result;
		    	break;
		    default:
		    	score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		//Switch Expression
		//Java 12부터 변수에 대입 가능하다.(단, 해당 중괄호 끝에 반드시 ;을 붙여야한다. default는 생략 불가능.)
		//Java 12부터 가능
//        int score2 = switch(grade) {
//            case "A" -> 100;
//            case "B" -> int result = 100 - 20;
//            default -> 60;
//        };
        // switch 표현식은 반드시 값을 반환해야한다.
        // 여기서는 반환할 값이 없기 때문에 에러 발생
        // case 문의 {}내에서는 yield를 이용해 반환해야한다.
        
      //  System.out.println("score2: " + score2);
		
        //자바 13부터 리턴도 가능하다.
		int score3 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;// 임시변수 result
				yield result; //Java 13부터 임시변수(yield)를 리턴 줄 수 있다.
			}
			default -> 60; // Expression에서는 default 생략 불가능
		};
		System.out.println("score3: " + score3);
	}
}