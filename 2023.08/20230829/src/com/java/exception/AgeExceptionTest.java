package com.java.exception;

import java.util.Scanner;

public class AgeExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신은 몇살입니까? ");
		int age = sc.nextInt();
		
		try {
			if(age >= 0 && age < 20) {
				throw new AgeException("당신은 미셩년자입니다.");
			} else {
				System.out.println("당신은 성인입니다.");
			}
		} catch(AgeException e) {
			System.out.println(e.getMessage());
			System.out.println("당신은 성인이 되기까지 " + (20 - age) + "년 남았습니다.");
		}

	}

}
