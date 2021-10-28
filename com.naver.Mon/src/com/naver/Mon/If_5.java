package com.naver.Mon;

public class If_5 {
	public static void main(String[] args) {

		String id = "jhj774";
		String pw = "1234";
		
		//id와 pw가 같으면 로그인 성공
		//id맞고 pw틀리면 비밀번호 틀림
		//id틀리면 없는 아이디
		//나중에 id와 pw는 입력화면에서 읽어오고 데이터를 데이터베이스와
		//비교하면 실제 로그인을 만들 수 있다.
		if(id == "jhj774") {
			if(pw == "1234") {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 틀림");
				}
			}else {
				System.out.println("없는 아이디");
			}
	}
}
