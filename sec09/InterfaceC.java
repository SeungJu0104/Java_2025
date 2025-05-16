package ch08.sec09;

public interface InterfaceC extends InterfaceA, InterfaceB { // 포를 쏘는 기능 가정. 다중 상속이므로 차 운전(A)과 배 운전(B)의 필드와 메소드를 상속받는다.
	//추상 메소드
	void methodC(); // 포 발사 함수 가정
}