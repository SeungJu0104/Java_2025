package ch11.sec04;

public class TryWithResourceExample {
	
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")) { // try () 안에 auto close할 객체 써야한다. 아니면 안한다.
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		} 
		
		System.out.println(); // syso의 out은 System 클래스의 static final 객체
		
		try (MyResource res = new MyResource("A")) {  // try () 안에 auto close할 객체 써야한다. 아니면 안한다.
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		/*try (
			MyResource res1 = new MyResource("A"); 
			MyResource res2 = new MyResource("B")
		) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}*/
		
		MyResource res1 = new MyResource("A"); 
		MyResource res2 = new MyResource("B");
		try (res1; res2) { // try()에서 ()안에 auto close할 객체들을 명시해야 auto close가 수행된다.
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}