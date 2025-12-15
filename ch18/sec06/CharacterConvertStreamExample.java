package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "EUC-KR"); // EUC-KR 형식의 텍스트 파일을 작성한다.
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	/*
	 * [UTF-8]
	 * 영문자, 숫자, 특수 문자 -> 1 byte
	 * 한글 -> 3 byte
	 */
	
	public static String read() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		// 'UTF-8 형식으로 읽겠다.'는 의미. 별도의 문자 형식 설정안하면 기본은 UTF-8이다.
		// 단, EUC-KR 등 다른 형식의 파일이면 깨질 수 있다.
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num); // String 객체 생성
		return str;
	}
}