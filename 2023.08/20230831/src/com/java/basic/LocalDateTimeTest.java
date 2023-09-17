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
			System.out.println("������ �������̴�.");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("������ ����ƴ�.");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("�����Ⱓ�� �������ϴ�.");
		} 
	 
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		
		System.out.println("���� �⵵�� " + remainYear + "�� �Դϴ�.");
		System.out.println("���� ������ " + remainMonth + "���� �Դϴ�.");
		System.out.println("���� ���ڴ� " + remainDay + "�� �Դϴ�.");
		
	}

}
