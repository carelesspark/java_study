package com.java.exception;

import java.util.Scanner;

public class LoginExceptionTest {

	public static void main(String[] args) {
		String id = "test123";
		String pwd = "1234";
		
		Scanner sc = new Scanner(System.in);	// �����ϰ� import �ϴ� ��: ctrl + shift + o ���� ��ĳ�� import ���� 

		System.out.println("���̵� �Է��ϼ���.");
		String input_id = sc.nextLine();
		System.out.println("�н����带 �Է��ϼ���.");
		String input_pwd = sc.nextLine();
		
		try {
			if(!(id.equals(input_id) && pwd.equals(input_pwd))) {
				throw new LoginException("���̵� �н����� ����ġ"); // ���� ���� �߻���Ŵ
			} else {				
				System.out.println("�α��� ����");
			}
		} catch(LoginException e) {
			System.out.println(e.getMessage());
			System.out.println("���̵� �н����带 �ٽ� �Է����ּ���.");
		}
		
	}

}
