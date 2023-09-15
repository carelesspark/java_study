package com.java.exception;

import java.util.Scanner;

public class LoginExceptionTest {

	public static void main(String[] args) {
		String id = "test123";
		String pwd = "1234";
		
		Scanner sc = new Scanner(System.in);	// 간편하게 import 하는 법: ctrl + shift + o 쉽게 스캐너 import 가능 

		System.out.println("아이디를 입력하세요.");
		String input_id = sc.nextLine();
		System.out.println("패스워드를 입력하세요.");
		String input_pwd = sc.nextLine();
		
		try {
			if(!(id.equals(input_id) && pwd.equals(input_pwd))) {
				throw new LoginException("아이디 패스워드 불일치"); // 직접 오류 발생시킴
			} else {				
				System.out.println("로그인 성공");
			}
		} catch(LoginException e) {
			System.out.println(e.getMessage());
			System.out.println("아이디 패스워드를 다시 입력해주세요.");
		}
		
	}

}
