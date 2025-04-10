package ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
//다른 패키지의 클래스 사용하려면 반드시 import 해야한다.
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.hankook.Tire;
import ch06.sec12.kumho.AllSeasonTire;
// import ch06.sec12.hankook.*; // hankook 패키지 내 모든 클래스 파일 import
	
public class Car {
	//부품 필드 선언
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire(); // import 한 패키지의 풀네임을 작성해 Tire 클래스 객체 생성
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	Tire tire5 = new Tire(); // import한 패키지는 줄여쓸 수 있다.
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire(); // 작성 후 ctrl + shift + o 를 누르면 패키지 import 할 수 있다.
}