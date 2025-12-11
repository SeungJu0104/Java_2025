package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");

			byte[] array = { 'A', 'B', 'C', 'D', 'E'}; // 바이트 배열

			os.write(array); // write는 끝 1바이트만 기록하지만,  바이트 배열은 전체 다 기록한다.
			os.write(array, 1, 3); // 바이트 배열을 기록하고, 인덱스 1부터 3까지의 문자를 다시 기록한다.
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}