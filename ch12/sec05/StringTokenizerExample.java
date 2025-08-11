package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,"); // 문자열을 & | , 마다 끊어 문자열 배열로 생성해준다. 전부 다 잘라야하면 split이 유리
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();

		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/"); // 문자열을 /  단위로 자른다. 일부만 사용할 경우는 StringTokenizer가 유리하다.
		//while (st.hasMoreTokens()) {
			String name1 = st.nextToken();
			String name2 = st.nextToken();
			String token = st.nextToken();
			System.out.println(token);
		//}
	}
}