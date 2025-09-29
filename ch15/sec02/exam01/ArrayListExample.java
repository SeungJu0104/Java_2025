package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

/*
 * Data 관리
 * 저장공간 : 메모리 < 파일 < DB
 * 속도: 메모리 > 파일 > DB
 * 관리법 (DML) : 
 * 추가 -> 무조건 뒤에 추가 or 무조건 앞에 추가 or 특정 위치에 추가 or 배열을 앞, 뒤, 특정위치 중에 추가
 * 삭제 -> 무조건 뒤에 삭제 or 무조건 앞에 삭제 or 특정 위치에 삭제
 * 검색 -> 무조건 뒤부터 얻기 or 무조건 앞부터 얻기 or 특정 위치 얻기 or 값 기준으로 위치 찾기 or 값 기준으로 존재여부 확인
 * 수정 -> 특정 위치 값 변경
 * 기타 -> 전체 데이터 수
 */
	
public class ArrayListExample {
	public static void main(String[] args) {
		Board [] array = {
				new Board("제목1", "내용1", "글쓴이1"),
				new Board("제목2", "내용2", "글쓴이2"),
				new Board("제목3", "내용3", "글쓴이3"),
				new Board("제목4", "내용4", "글쓴이4"),
				new Board("제목5", "내용5", "글쓴이5")
		}; 
		// 일반 배열로도 생성할 수 있지만 추가, 삭제, 수정 등이 어렵다.
		
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList< >();
		
		//객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1")); // ArrayList 객체에 데이터 추가
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		//저장된 총 객체 수 얻기
		final int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
				
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		board.print();
//		System.out.println(board.getSubject() 
//											+ "\t" + board.getContent() 
//											+ "\t" + board.getWriter());
		System.out.println();
			
		//모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			b.print();
//			System.out.println(b.getSubject() 
//												+ "\t" + b.getContent() 
//												+"\t" + b.getWriter());
		}
		System.out.println();
			
		//객체 삭제
		list.remove(2); // 인덱스 2 위치 데이터 삭제
		list.remove(2); // 변경된 배열에서 인덱스 2 위치 데이터 삭제
			
		//향상된 for문으로 모든 객체를 하나씩 가져오기
		for(Board b : list) {
			b.print();
//			System.out.println(
//					b.getSubject() 
//					+ "\t" + b.getContent() 
//					+"\t" + b.getWriter());
		}
	}
}