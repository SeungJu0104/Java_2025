package ch18.sec10;

import java.io.Serializable;
	
public class Member implements Serializable { // Serializable은 '객체를 파일로 저장하고 복원할 수 있다.' 는 의미
	private static final long serialVersionUID = -622284561026719240L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
		
	@Override
	public String toString() { return id + ": " + name; }
}