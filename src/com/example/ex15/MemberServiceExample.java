package com.example.ex15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그온 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("올바르지 않습니다.");
		}
		
	}
}
