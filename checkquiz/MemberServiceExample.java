package ch06.checkquiz;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		if(memberService.login("hong", "12345")) System.out.println("로그인 성공");
		else System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
	}

}
