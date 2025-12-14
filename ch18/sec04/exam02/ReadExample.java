package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
// 입출력 스트림 사용할 때는 반드시 예외처리 필요
public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = null;

			//1 문자씩 읽기
			reader = new FileReader("C:/Temp/test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break; // -1이면 더이상 읽을 데이터가 없다.
				System.out.print((char)data);
			}
			reader.close();
			System.out.println();

			//문자 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100]; // 버퍼
			while(true) {
				int num = reader.read(data);
				if(num == -1) break; // -1이면 더이상 읽을 데이터가 없다.
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
			// 예를 들어, 파일을 읽거나 쓰는 도중에 물리적인 저장 장치가 고장나거나 공간이 없을 경우에는 해당 예외들이 발생할 수 있다.
		} catch (FileNotFoundException e) { // 파일이 없을 경우 발생하는 예외
			e.printStackTrace();
		} catch (IOException e) { // 입출력 중 발생하는 예외
			e.printStackTrace();
		}
	}
	
}