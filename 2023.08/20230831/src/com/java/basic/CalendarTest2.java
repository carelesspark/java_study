package com.java.basic;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {	// 년도와 달을 입력받아 달력 만들기, (+ 공백을 주었는데 이를 전달 + 다음 달의 날짜까지 추가시켜 달력 완성하기
	public static void main(String[] args) {
		
		int END_DAY = 0;
		int START_DAY_OF_WEEK = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년 입력: ");
		int year = sc.nextInt();
		
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay= Calendar.getInstance();
		
		sDay.set(year, month -1, 1);	//2015.8.1 
		eDay.set(year, month, 1);		// 2015.9.1
	
		
		
		eDay.add(Calendar.DATE, -1);  // 2015.8.31
		
		END_DAY = eDay.get(Calendar.DATE); // 31
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); //
		
		System.out.println("    " + year + "년" + month + "월");
		System.out.println(" SUN    MON    THU    WED    THU    FRI    SAT  ");
		
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {	// 1일이 시작하는 요일 전까지 공백 추가
			System.out.print("       ");
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) { // 날짜를 출력하는데 n값도 같이 증가시키면서 7일때 찍고 엔터해야되므로 나머지가 0일 때 넘기기
			System.out.printf(" %2d    ", i);
			if(n % 7 == 0) {
				System.out.println();
			}
		}	
		
	}

}
