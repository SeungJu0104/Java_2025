package ch18.sec07.exam02;

import java.io.*;

// Buffered 보조 스트림의 가장 큰 특징은 ReadLine, Lines 함수가 있다는 것이다.
// 줄(라인) 단위로 읽고 쓸 수 있다.
public class ReadLineExample2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new FileReader("c:\\temp\\book.txt")
		);
		
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			String [] arr = str.split(",");
			for(int i = 0; i < arr.length; i++) {
				System.out.print("[" + arr[i].trim() + "]");
			}
			System.out.println();
		}
		
		br.close();
	}
}