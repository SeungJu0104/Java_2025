package ch18.sec07.exam01;

import java.io.*;
	
	public class BufferExample {
		public static void main(String[] args) throws Exception {
			//입출력 스트림 생성
			String originalFilePath1 = // 리플렉션
					BufferExample.class.getResource("originalFile1.jpg").getPath(); // 현재 클래스에 기준 경로를 받아 파일을 가져온다. 리플렉션
			String targetFilePath1 = "C:/Temp/targetFile1.jpg";
			FileInputStream fis = new FileInputStream(originalFilePath1);
			FileOutputStream fos = new FileOutputStream(targetFilePath1);
			
			//입출력 스트림 + 버퍼 스트림 생성
			String originalFilePath2 =
					BufferExample.class.getResource("originalFile2.jpg").getPath();
			String targetFilePath2 = "C:/Temp/targetFile2.jpg";
			FileInputStream fis2 = new FileInputStream(originalFilePath2);
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
			BufferedInputStream bis = new BufferedInputStream(fis2); // 버퍼 보조스트림을 사용한다. -> 속도 향상
			BufferedOutputStream bos = new BufferedOutputStream(fos2); // 버퍼 보조스트림을 사용한다. -> 속도 향상
			
			//버퍼를 사용하지 않고 복사
			long nonBufferTime = copy(fis, fos);
			System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
			
			//버퍼를 사용하고 복사
			long bufferTime = copy(bis, bos);
			System.out.println("버퍼 사용:\t" + bufferTime + " ns");
			// 약 10배정도 속도차이 발생
			fis.close();
			fos.close();
			bis.close();
			bos.close();
		}
		
		public static long copy(InputStream is, OutputStream os) throws Exception {
			//시작 시간 저장
			long start = System.nanoTime();
			//1 바이트를 읽고 1 바이트를 출력
			while(true) {
				int data = is.read();
				if(data == -1) break;
				os.write(data);
			}
			os.flush();
			//끝 시간 저장
			long end = System.nanoTime();
			//복사 시간 리턴
			return (end-start);
		}
		
		public static long bufferCopy(InputStream is, OutputStream os) throws Exception {
			//시작 시간 저장
			long start = System.nanoTime();
			byte [] arr = new byte [4096];
			//1 바이트를 읽고 1 바이트를 출력
			while(true) {
				int data = is.read(arr);
				if(data == -1) break;
				os.write(data);
			}
			os.flush();
			//끝 시간 저장
			long end = System.nanoTime();
			//복사 시간 리턴
			return (end-start);
		}
	}	