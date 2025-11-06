package ch17.sec04.exam04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		// 레거시 방법
//		BufferedReader in = new BufferedReader(new FileReader(path.toFile()));
//		String line = "";
//		while((line = in.readLine()) != null) {
//			System.out.println(line);
//		}
//		in.close();
		
		// 스트림 방법
		Stream<String> stream = Files.lines(path, Charset.defaultCharset()); // Charset.defaultCharset -> 시스템의 기본 인코더로 문자 인코딩
		stream.forEach(line1 -> System.out.println(line1) );
		stream.close();
	}
}