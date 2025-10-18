package ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		//비교자를 제공한 TreeSet 컬렉션 생성
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		TreeSet<Fruit> treeSet2 = new TreeSet<Fruit>(new Comparator<Fruit>() { // 인터페이스 Comparator를 익명 객체로 생성
				@Override
				public int compare(Fruit o1, Fruit o2) {
					if(o1.price < o2.price) return -1;
					else if(o1.price == o2.price) return 0;
					else return 1;
				}
		});
		TreeSet<Fruit> treeSet3 = new TreeSet<Fruit>((o1, o2) -> o1.price - o2.price); // 인터페이스 Comparator를 람다식으로 익명 개체 생성
			
		//객체 저장
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		//객체를 하나씩 가져오기
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}