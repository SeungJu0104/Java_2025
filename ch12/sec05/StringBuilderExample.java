package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		
		long start = System.nanoTime();
		
		for(int i = 0; i < 100000; i++) {
			str += i; // String은 읽기 전용 문자열. 1회 반복할 때마다 새로 생성해야하니 오래 걸린다. 문자열이 자주 변경된다.
		}
		
		long end = System.nanoTime();
		System.out.println(end - start + " 실행 시간"); // 실행 시간
		System.out.println(str.length());
		
		//String Builer
		// 내부 버퍼에 문자열 저장해, 빠른 속도로 잦은 문자열 변경 수행 가능
		StringBuilder str2 = new StringBuilder();
		
		start = System.nanoTime();
		
		for(int i = 0; i < 100000; i++) {
			str2.append(i); // StringBuilder를 이용하면 문자열 변경을 좀 더 빠르게 사용할 수 있다.
		}
		
		end = System.nanoTime();
		System.out.println(end - start + " 실행 시간"); // 실행 시간
		System.out.println(str2.length());
		
		String data = 
				new StringBuilder().append("DEF").insert(0, "ABC").delete(0,1).replace(1,2,"G").toString();
//		String data = new StringBuilder()
//				.append("DEF")
//				.insert(0, "ABC")
//				.delete(3, 4)
//				.toString();
		System.out.println(data);
	}
}