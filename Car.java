package ch06.sec07.exam05;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
		//20라인 생성자 호출
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		//20라인 생성자 호출
		this(model, color, 250);
	}
	
	// 생성자 오버로딩 시 서로 다른 변수의 순서 차이가 있다면 가능하다.
	// 동일 변수의 순서차이는 불가능하다.
	Car(String color, int maxSpeed){
		this(null, color, maxSpeed);
	}
	
	Car(int maxSpeed, String color){
		this(null, color, maxSpeed);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}