package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
	
public class FileExample {
	public static void main(String[] args) throws Exception {

		//File 객체 생성
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");

		//존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) { dir.mkdirs(); } // 폴더 생성 함수. 하위 폴더까지 경로 적어놨다면 하위폴더까지 생성한다.
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		/* 
		 * .  또는 ..을 이용한 경로 설정은 상대 경로
		 *   /를 이용한 경로는 절대 경로
		 */
		
		//Temp 폴더의 내용을 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles(); // 파일의 하위 목록들을 배열에 저장한다.

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) { // 파일의 디렉토리 여부 판단
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else if(file.isHidden()) { // 숨김 파일인지 여부 판단
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}
	}
}