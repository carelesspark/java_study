package com.java.enums;

public class EnumTest {

	public static void main(String[] args) {
		// ������ Ÿ��
//		Week today;
//		today = Week.FRIDAY;
//		
//		System.out.println(today);
		
//		// name()
//		System.out.println(today.name());
//		
//		
//		// Ordinal()
//		System.out.println(Week.MONDAY.ordinal());
//		System.out.println(Week.FRIDAY.ordinal());
//		
//		
//		// compareTo
//		System.out.println(Week.MONDAY.compareTo(Week.SATURDAY));
//		
//		
//		// valueOf
//		Week yesterday = Week.valueOf("WEDNESDAY");
//		System.out.println(yesterday);
//		
//		System.out.println("============================");
//		
//		// values
//		Week[] days = Week.values();
//		for(Week day : days) {
//			System.out.println(day);
//		}
		
//		Week[] days = Week.values();
//		for(Week day : days) {
//			System.out.println(day.korean + "(" + day.chinese + ")");
//		}
//		
////		// ��������� private�ϰ� �ٲٸ� ������ �߻�
//		System.out.println(Week.SATURDAY.korean);
//		Week.SATURDAY.korean = "�ٲ� ������ �մϴ�.";
//		System.out.println(Week.SATURDAY.korean);
//		
		System.out.println(Week.SATURDAY.getKorean());
		System.out.println(Week.SATURDAY.getChinese());
//		
		
	}

}
