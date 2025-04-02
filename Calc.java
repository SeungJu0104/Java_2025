package ch06.sec06.exam02;

	public class Calc {
		
		//멤버 변수(필드) 선언
		int a;
		int b;
	
		int add(int a, int b) {
			return (a+b);
		}
		
		int sub(int tmp, int tmp2) {
			return (tmp - tmp2);
		}
		
		void print() {
			System.out.println("출력 ....");
			for(int i = 0; i < 10; i++) {
				if(i > 5) {
					return ;
				}
				System.out.println("i = " + i);
			}
		}
		
		// 생성자 함수 (객체 생성 시 호출되는 함수)
		Calc(){
			System.out.println("객체 생성과 함께 생성자 함수 실행"); // 기본 생성자
			System.out.println("a = " + a); // 매개변수 없으므로 컴파일시 this.a로 자동 변환해 수행
			System.out.println("b = " + b); // 매개변수 없으므로 컴파일시 this.b로 자동 변환해 수행
			System.out.println("this.a = " + this.a);
			System.out.println("this.b = " + this.b);
			// 동일한 값을 출력한다.
		}
		
		Calc(int a, int b){
			this.a = a; // 매개변수로 받은 a를 멤버 변수(필드) a에 대입해 초기화
			this.b = b; // 매개변수로 받은 b를 멤버 변수(필드) b에 대입해 초기화
			System.out.println("매개변수 있는 생성자 함수 실행");
		}
		/*
		 * add 함수를 10번 실행한다 가정했을 때
		 * 멤버변수에 값을 담지 않고, 매개변수로 인자 넘겨 실행하면
		 * 매번 대입하는 과정이 필요하지만
		 * 멤버변수에 값을 담아 실행하면 한번만 대입하면 되기 때문에 성능, 시간 우위
		 */
	
}
	

