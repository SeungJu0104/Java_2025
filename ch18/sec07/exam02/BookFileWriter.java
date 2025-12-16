package ch18.sec07.exam02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Buffered 보조 스트림의 가장 큰 특징은 ReadLine, Lines 함수가 있다는 것이다.
// 줄(라인) 단위로 읽고 쓸 수 있다.
public class BookFileWriter{
	public static void main(String[] args) throws Exception {
		
		// try - catch문을 이용해 별도 close 없이 자동으로 리소스 close 한다. (AutoCloseable)
		try(Writer out = new FileWriter("C:\\Temp\\book.txt")) { // 파일 작성
			
			DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse("1995-01-01");
			
			for(int i = 1; i  < 1000; i++) {
				String str = String.format("897849%04d, 초역 니체의 말 %d, %d, 프리드리히 니체%d, %s\n", i, i, (int)((Math.random()*45)+5)*1000, i, date.format(sdf));
				out.write(str);
				date = date.plusDays(1);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}