package com.java.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
//		Date day = new Date();
//		System.out.println(day);
		
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		System.out.println(today.get(Calendar.YEAR));	// 오늘 기준 년도
		System.out.println(today.get(Calendar.MONTH) + 1); // 0 ~ 11
		System.out.println(today.get(Calendar.WEEK_OF_YEAR)); // 오늘이 1년 기준 몇주차인가?
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)); // 오늘이 한 달 기준 몇주차인가?

		System.out.println(today.get(Calendar.DAY_OF_MONTH)); // 오늘이 한 달 기준 몇일 지났나?
		System.out.println(today.get(Calendar.DATE));	// 일자
		System.out.println(today.get(Calendar.DAY_OF_YEAR));	// 오늘이 1년 기준 몇일 지났나?
		System.out.println(today.get(Calendar.DAY_OF_WEEK));	// 1~7 1:일요일

		
		System.out.println(today.get(Calendar.HOUR));	// 지금 몇시인가? (12시간 단위)
		System.out.println(today.get(Calendar.HOUR_OF_DAY));	// 하루 기준 몇 시간이 지났나? (24시간 단위)
		System.out.println(today.get(Calendar.MINUTE));	// 지금 몇분인가?
		System.out.println(today.get(Calendar.SECOND));	// 지금 몇초인가?
		
		System.out.println(today.getActualMaximum(Calendar.DATE)); // 이 달의 마지막 날
		
		
		// 마지막 시간에 LocalDateTimeTet를 하다가 넘어옴
		Date day = today.getTime();
		
		System.out.println(day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String s = sdf.format(day);
		
		System.out.println(s);
	}

}
