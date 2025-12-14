package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
// 스트림은 순차적으로 읽어들이고, 내보내는 작업을 수행한다.
public class WriteExample {
	public static void main(String[] args) {
		try {
			//문자 기반 출력 스트림 생성
			Writer writer = new FileWriter("C:/Temp/test.txt");

			//1 문자씩 출력
			// 순차적으로 write 수행.
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			// AB

			//char 배열 출력
			char[] arr = { 'C', 'D', 'E' };
			writer.write(arr);

			//문자열 출력
			writer.write("FGH");
			
			//버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			writer.flush();
			
			//출력 스트림을 닫고 메모리 해제
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}