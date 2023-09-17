package com.java.basic;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" }; // 인덱스의 경우 1~7까지 출력하기에 맨 앞에 비워두기

		Calendar date1 = Calendar.getInstance(); // 싱글톤의 경우 생성이 불가했을 것, 하나를 가지고 2개 이상 만들기 때문
		Calendar date2 = Calendar.getInstance();

		date1.set(2015, 7, 15); // Month의 경우 8월 찍고싶다면 0~11만을 출력하기에 출력부분에서 + 1을 해줄 것이다.따라서 set부분에선 -1한 7을 입력
		System.out.println("date1은 " + date1.get(Calendar.YEAR) + "년 " + (date1.get(Calendar.MONTH) + 1) + "월 "
				+ date1.get(Calendar.DATE) + "일이고, " + "이날은 " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]
				+ "요일 입니다.");

		System.out.println("date2은 " + date2.get(Calendar.YEAR) + "년 " + (date2.get(Calendar.MONTH) + 1) + "월 "
				+ date2.get(Calendar.DATE) + "일이고, " + "이날은 " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]
				+ "요일 입니다.");

		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("date1과 date2까지 " + difference + "초가 지났습니다.");
		
		System.out.println("date1과 date2까지 " + difference / (24 * 60 * 60) + "일 지났습니다.");
		System.out.println("date1과 date2까지 " + (difference / (24 * 60 * 60)) / 365 + "년 지났습니다.");
	}

}
