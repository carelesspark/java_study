package com.java.basic;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = { "", "��", "��", "ȭ", "��", "��", "��", "��" }; // �ε����� ��� 1~7���� ����ϱ⿡ �� �տ� ����α�

		Calendar date1 = Calendar.getInstance(); // �̱����� ��� ������ �Ұ����� ��, �ϳ��� ������ 2�� �̻� ����� ����
		Calendar date2 = Calendar.getInstance();

		date1.set(2015, 7, 15); // Month�� ��� 8�� ���ʹٸ� 0~11���� ����ϱ⿡ ��ºκп��� + 1�� ���� ���̴�.���� set�κп��� -1�� 7�� �Է�
		System.out.println("date1�� " + date1.get(Calendar.YEAR) + "�� " + (date1.get(Calendar.MONTH) + 1) + "�� "
				+ date1.get(Calendar.DATE) + "���̰�, " + "�̳��� " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]
				+ "���� �Դϴ�.");

		System.out.println("date2�� " + date2.get(Calendar.YEAR) + "�� " + (date2.get(Calendar.MONTH) + 1) + "�� "
				+ date2.get(Calendar.DATE) + "���̰�, " + "�̳��� " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]
				+ "���� �Դϴ�.");

		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("date1�� date2���� " + difference + "�ʰ� �������ϴ�.");
		
		System.out.println("date1�� date2���� " + difference / (24 * 60 * 60) + "�� �������ϴ�.");
		System.out.println("date1�� date2���� " + (difference / (24 * 60 * 60)) / 365 + "�� �������ϴ�.");
	}

}
