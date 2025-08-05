package ch12.sec03.exam01;

import java.util.Objects;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소 비교
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) 
			// 클래스명(타입) 비교. 클래스는 설계도 -> 서로 다른 설계도(서로 다른 타입)로 만든 객체는 다르다.
			// 단, Object는 모든 클래스의 상위 클래스이므로 Object로 업캐스팅해 비교하면 같다고 판단하고 넘어간다.
			return false;
		Member other = (Member) obj; // 강제 형변환 수행
		return Objects.equals(id, other.id); // 정확히 여기 equals는 String의 equals를 쓴다. String의 equals는 변수 내 값까지 비교한다.
		// Object 클래스의 equals는 번지 수 비교
	}
	

//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member target) {
//			if(id.equals(target.id)) {
//				return true;
//			}
//		}
//		return false;
//	}
}