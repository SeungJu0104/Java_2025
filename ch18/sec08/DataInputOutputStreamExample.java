package ch18.sec08;

import java.io.*;
	
public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//DataOutputStream 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);

		//기본 타입 출력
		dos.writeUTF("abcdef"); // 길이정보(1바이트) + 실제문자열(6바이트 -> 영문자는 1바이트씩) -> 총 7바이트
		dos.writeDouble(95.5); // 8바이트
		dos.writeInt(1000000); // 4바이트
		// 파일에는 UTF-8로 1바이트씩 먼저 저장하고, 그 뒤에 8바이트 단위로 저장하고, 4바이트 단위로 순차적으로 저장한다.
		dos.writeUTF("xyz");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		//DataInputStream 생성
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//기본 타입 입력
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}

		dis.close(); fis.close();
	}
}