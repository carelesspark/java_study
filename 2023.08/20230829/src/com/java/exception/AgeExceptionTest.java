package com.java.exception;

import java.util.Scanner;

public class AgeExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ����Դϱ�? ");
		int age = sc.nextInt();
		
		try {
			if(age >= 0 && age < 20) {
				throw new AgeException("����� �̼ͳ����Դϴ�.");
			} else {
				System.out.println("����� �����Դϴ�.");
			}
		} catch(AgeException e) {
			System.out.println(e.getMessage());
			System.out.println("����� ������ �Ǳ���� " + (20 - age) + "�� ���ҽ��ϴ�.");
		}

	}

}
