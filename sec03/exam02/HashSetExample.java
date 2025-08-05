package ch12.sec03.exam02;

import java.util.HashSet;
	
public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet(); // 중복없는 집합 -> HashSet
		
		hashSet.add(1);
		hashSet.add(2);
		System.out.println(hashSet.size());
		hashSet.add(3);
		System.out.println(hashSet.size());
		hashSet.add(3); // 중복값 안받으므로 추가되지 않는다. 이미 3이 존재한다.
		System.out.println(hashSet.size());

		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1); // Student 객체 1개 저장
		System.out.println("저장된 객체 수: " + hashSet.size());

		Student s2 = new Student(1, "홍길동"); // 서로 다른 객체이지만 동일한 해시코드를 가진다.(Student 클래스에 hashCode 오버라이딩했기때문이다.) 
		hashSet.add(s2); // 중복값 안받으니 저장 안된다.
		System.out.println("저장된 객체 수: " + hashSet.size());

//		Student s3 = new Student(2, "홍길동");
//		hashSet.add(s3);
//		System.out.println("저장된 객체 수: " + hashSet.size());
	}
}