package com.java.basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		System.out.println(now.format(dtf));
		
//		LocalDateTime result1 = now.plusYears(1);
//		System.out.println(result1.format(dtf));
//		
//		LocalDateTime result2 = now.plusMonths(2);
//		System.out.println(result2.format(dtf));
//		
//		LocalDateTime result3 = now.plusDays(7);
//		System.out.println(result3.format(dtf));
		
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1,1,0,0,0);
		LocalDateTime endDateTime = LocalDateTime.of(2023, 12,31,0,0,0);
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("축제가 진행중이다.");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("축제가 종료됐다.");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("축제기간이 지났습니다.");
		} 
	 
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		
		System.out.println("남은 년도는 " + remainYear + "년 입니다.");
		System.out.println("남은 개월은 " + remainMonth + "개월 입니다.");
		System.out.println("남은 일자는 " + remainDay + "일 입니다.");
		
	}

}
