package ch12.sec03.exam02;

import java.util.Objects;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() { return no; }
	public String getName() { return name; }

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode(); // String은 리터럴이 동일하면 객체 여러개 안만들고 하나의 객체만 참조하도록 처리한다. 그래서 같은 해시코드 출력.
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) { // Obj가 Student 타입인지 확인하고, 맞으면 target에 강제 형변환해서 대입.
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

}