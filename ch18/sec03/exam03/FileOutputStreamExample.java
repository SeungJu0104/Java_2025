package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {
	// 바이트 기반 데이터 입출력(모든 종류 데이터 처리 가능)
	public static void fileCopy(String sourceFile, String targetFile) {
		
		try {
			InputStream in = new FileInputStream(sourceFile);
			OutputStream out = new FileOutputStream(targetFile);
			
			byte [] buffer = new byte [4096]; // 버퍼
			
			while(true) {
				int data = in.read(buffer); // 버퍼 크기만큼 버퍼에 데이터를 읽어들여 data에 저장한다.
				if(data == -1) break; // 읽어들인 데이터가 -1이면 반복문 종료. -> -1이면 더이상 읽을 바이트가 없다는 의미.
				out.write(buffer, 0, data); // 버퍼에 읽어들인 데이터 크기만큼 작성한다.
			}
			in.close();
			out.flush(); // 버퍼에 남은 데이터 내보내기
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
		long start = System.nanoTime();
		try {
			InputStream is = new FileInputStream("C:/Temp/아이유.webp");
			OutputStream os = new FileOutputStream("C:/Temp/아이유2.webp");

			while(true) {
				int data = is.read();
				if(data == -1) break;
				os.write(data);
			}
			
			is.close();
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long time = System.nanoTime() - start;
		System.out.println("실행시간 1 = " + time);

		
		//블럭(배열)으로 읽고 쓰기  
		start = System.nanoTime();
		try {
			InputStream is = new FileInputStream("C:/Temp/아이유.webp");
			OutputStream os = new FileOutputStream("C:/Temp/아이유2.webp");
			byte [] arr = new byte[4096]; // 버퍼
			
			while(true) {
				int len = is.read(arr);
				if(len == -1) break;
				os.write(arr, 0, len);
			}
			
			is.close();
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		time = System.nanoTime() - start;
		System.out.println("실행시간 2 = " + time); // 버퍼가 있는 스트림의 실행시간이 없는 스트림보다 약 100배정도 빠르다.
		
		// 별도로 파일 복사 함수를 작성한 후 실행
		fileCopy("C:/Temp/아이유.webp", "C:/Temp/아이유2.webp") ;
		
		
//		String originalFileName = "C:/Temp/test.jpg";
//		String targetFileName = "C:/Temp/test2.jpg";
//		
//		InputStream is = new FileInputStream(originalFileName);
//		OutputStream os = new FileOutputStream(targetFileName);
//		
//		byte[] data = new byte[1024]; // 바이트 스트림
//		while(true) {
//			int num = is.read(data);
//			if(num == -1) break;
//			os.write(data, 0, num);
//		}
//			
//		os.flush();
//		os.close();
//		is.close();
//		
//		System.out.println("복사가 잘 되었습니다.");
	}
}