package ch08.sec09;

public class InterfaceCImpl implements InterfaceC { // 내용 구현(실체화)해야하니 클래스 선언
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
		System.out.println("배 운전");
	}

	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
		System.out.println("육지에서 차 운전");
	}

	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
		System.out.println("대포 발사");
	}
}