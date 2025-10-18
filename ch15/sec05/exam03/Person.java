package ch15.sec05.exam03;

/*
 * 자바에서 객체 정렬 
 * -> Comparable 또는 Comparator를 무조건 하나는 정렬해야한다.
 * -> Comparable은 인터페이스, Comparator는 추상 클래스
 * 
 */
public class Person implements Comparable<Person> { 
	// Comparable을 상속받아 compareTo() 함수 오버라이딩
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name + ", " + age);
	}

	@Override // 정렬기준을 compareTo 함수에서 정의한다.
	public int compareTo(Person o) { // 여기서 Person o는 비교 대상
		// 나이 기준 오름차순 정렬 수행
		// 나보다 나이 많으면 앞으로 온다. (음수 앞으로)
		// 나 - 비교대상 = 양수 -> 양수 리턴, 음수면 음수 리턴, 0이면 0리턴
		// return (this.age - o.age);
		
		// 나이 기준 내림차순 정렬 수행
		// 나보다 나이 적으면 앞으로 온다. (음수 앞으로)
		// 0일 때만 이름 비교
		// 비교대상 - 나 = 양수 -> 양수 리턴, 음수면 음수 리턴, 0이면 0 리턴
		int res = o.age - this.age;		
		return res != 0 ? res : name.compareTo(name); // String 클래스의 compareTo를 이용해 비교
	}

//	@Override
//	public int compareTo(Person o) {
//		if(age<o.age) return -1;
//		else if(age == o.age) return 0;
//		else return 1;
//	}
}