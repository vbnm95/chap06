package com.example.ex15;

public class MemberService {
	boolean login(String id, String passwd) {
		if(id.equals("hong") && passwd.equals("12345"))
			return true;
		
		return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
