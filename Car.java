package ch06.sec07.exam04;

/*
 * SOLID
 * S : 단일 책임의 원칙. 1개의 클래스에서 1개의 기능만 수행. 함수에도 적용.
 * O : 
 * L : 
 * I : 
 * D : 
 */

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본 생성자 선언
	Car() {}
	
//	Car(String model) { // SOLID의 S에 위반되는 배드 코드
//		this.model = model; 
//	}
	
//	Car(String model, String color) { // SOLID의 S에 위반되는 배드 코드
//		this.model = model;
//		this.color = color;
//	}
	
//	Car(String model, String color, int maxSpeed) {  // SOLID의 S에 위반되는 배드 코드
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
	
	// 다른 생성자 호출	
	Car(String model){
		// int a = 0; //-> 에러 발생
		this(model, null, 0); 
		// this(매개변수들)를 사용하면 그 이전 부분에는 코드를 작성하면 안된다. 밑에는 작성해도 된다.
		// int b = 0; // 정상적으로 동작
	}
	
	Car(String model, String color){
		// int a = 0; //-> 에러 발생
		this(model, color, 0);
		// this(매개변수들)를 사용하면 그 이전 부분에는 코드를 작성하면 안된다. 밑에는 작성해도 된다.
		// int b = 0; // 정상적으로 동작
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		// 공통 코드를 한 생성자에만 집중적으로 작성하고, this(매개변수들)을 이용해 호출해서 코드 중복을 줄인 효율적인 코드 작성
		// SOLID의 S에 부합하는 코드
	}
	
	public void print(String name) {
		System.out.println(name + " company : " + this.company);
		System.out.println(name + " model : " + this.model);
		System.out.println(name + " color : " + this.color);
		System.out.println(name + " MaxSpeed : " + this.maxSpeed);
	}
}