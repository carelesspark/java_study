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
		
		System.out.println(today.get(Calendar.YEAR));	// ���� ���� �⵵
		System.out.println(today.get(Calendar.MONTH) + 1); // 0 ~ 11
		System.out.println(today.get(Calendar.WEEK_OF_YEAR)); // ������ 1�� ���� �������ΰ�?
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)); // ������ �� �� ���� �������ΰ�?

		System.out.println(today.get(Calendar.DAY_OF_MONTH)); // ������ �� �� ���� ���� ������?
		System.out.println(today.get(Calendar.DATE));	// ����
		System.out.println(today.get(Calendar.DAY_OF_YEAR));	// ������ 1�� ���� ���� ������?
		System.out.println(today.get(Calendar.DAY_OF_WEEK));	// 1~7 1:�Ͽ���

		
		System.out.println(today.get(Calendar.HOUR));	// ���� ����ΰ�? (12�ð� ����)
		System.out.println(today.get(Calendar.HOUR_OF_DAY));	// �Ϸ� ���� �� �ð��� ������? (24�ð� ����)
		System.out.println(today.get(Calendar.MINUTE));	// ���� ����ΰ�?
		System.out.println(today.get(Calendar.SECOND));	// ���� �����ΰ�?
		
		System.out.println(today.getActualMaximum(Calendar.DATE)); // �� ���� ������ ��
		
		
		// ������ �ð��� LocalDateTimeTet�� �ϴٰ� �Ѿ��
		Date day = today.getTime();
		
		System.out.println(day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String s = sdf.format(day);
		
		System.out.println(s);
	}

}
