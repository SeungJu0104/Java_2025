package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) { // 메인도 하나의 스레드
		//Vector 컬렉션 생성
		// 동기화
		List<Board> list = new Vector<>();
		
		// List<Board> list = new ArrayList<Board>();
		// 스레드 2개를 동시에 실행하는데 점유를 선언하지 않아 제대로 처리가 안된다.
		// 화장실 1칸을 2명이 동시에 사용할 수 없다. 문을 잠그는 행위(점유)
		// 비동기화에 따른 문제
		
		//작업 스레드 객체 생성(선언)
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 생성(선언)
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		Long start = System.nanoTime();
		// 실제 실행 시간을 구하기위해 실행 직전에 타임 체크
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게함
		try {
			threadA.join(); // 종료 후 연결해 다음 작업 실행
			threadB.join(); // 종료 후 연결해 다음 작업 실행
		} catch(Exception e) {
		}
		
		Long end = System.nanoTime();
		// 실제 실행 시간을 구하기위해 실행 후 타임 체크
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);		
		System.out.println("총 실행 시간 : " + (end - start));
		System.out.println();		
	}
}