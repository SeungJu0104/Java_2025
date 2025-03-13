package ch03.sec07;

public class LogicalOperatorExample {
	static boolean isUppercase(int charCode) {
        return ('A'<=charCode) & (charCode<='Z');
    }
	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';

		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요.");
		}
		// (65<=charCode) 결과와 상관없이 (charCode<=90)을 수행한다.
		// &&의 단점을 보완한 형태
			
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자이군요.");
		}
		// (97<=charCode)이 0(F)면 (charCode<=122)는 수행하지 않는다.
		// 그래서 &&는 사용할 때 주의가 필요하다.

		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//----------------------------------------------------------

		int value = 6;
		//int value = 7;
			
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}

		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
	
//	 public static void main(String[] args) {
//	        int charCode = 'A';
//	        //int charCode = 'a';
//	        //int charCode = '5';
//	        //boolean a = false;
//
////	        if( (65<=charCode) & (charCode<=90) ) {
////	            System.out.println("대문자이군요.");
////	        }
//	        if( isUppercase(charCode) ) {
//	            System.out.println("대문자이군요.");
//	        }
//
//	        /*
//	         
//	op1  &&  op2    result 
//	0        0        0
//	0        1        0
//	1        0        0
//	1        1        1
//	*/
//	if( (97<=charCode) && (charCode<=122) ) {
//	  System.out.println("소문자이군요.");}
//
//	        if( (48<=charCode) && (charCode<=57) ) {
//	            System.out.println("0~9 숫자이군요.");
//	        }
//
//	        //----------------------------------------------------------
//
//	        int value = 6;
//	        //int value = 7;
//
//	        if( (value%2==0) | (value%3==0) ) {
//	            System.out.println("2 또는 3의 배수이군요.");
//	        }
//
//	        boolean result = (value%2==0) || (value%3==0);
//	        if( !result ) {
//	            System.out.println("2 또는 3의 배수가 아니군요.");
//	        }
//	    }
}