package com.java.basic;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {	// �⵵�� ���� �Է¹޾� �޷� �����, (+ ������ �־��µ� �̸� ���� + ���� ���� ��¥���� �߰����� �޷� �ϼ��ϱ�
	public static void main(String[] args) {
		
		int END_DAY = 0;
		int START_DAY_OF_WEEK = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�: ");
		int year = sc.nextInt();
		
		System.out.println("�� �Է�: ");
		int month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay= Calendar.getInstance();
		
		sDay.set(year, month -1, 1);	//2015.8.1 
		eDay.set(year, month, 1);		// 2015.9.1
	
		
		
		eDay.add(Calendar.DATE, -1);  // 2015.8.31
		
		END_DAY = eDay.get(Calendar.DATE); // 31
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); //
		
		System.out.println("    " + year + "��" + month + "��");
		System.out.println(" SUN    MON    THU    WED    THU    FRI    SAT  ");
		
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {	// 1���� �����ϴ� ���� ������ ���� �߰�
			System.out.print("       ");
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) { // ��¥�� ����ϴµ� n���� ���� ������Ű�鼭 7�϶� ��� �����ؾߵǹǷ� �������� 0�� �� �ѱ��
			System.out.printf(" %2d    ", i);
			if(n % 7 == 0) {
				System.out.println();
			}
		}	
		
	}

}
