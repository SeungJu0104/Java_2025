package ch18.sec07.exam02;

import java.io.*;

// Buffered 보조 스트림의 가장 큰 특징은 ReadLine, Lines 함수가 있다는 것이다.
// 줄(라인) 단위로 읽고 쓸 수 있다.
public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
		);
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		br.close();
	}
}