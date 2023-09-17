package com.java.enums;

public class EnumTest {

	public static void main(String[] args) {
		// 열거형 타입
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
////		// 멤버변수를 private하게 바꾸면 오류가 발생
//		System.out.println(Week.SATURDAY.korean);
//		Week.SATURDAY.korean = "바꿔 보려고 합니다.";
//		System.out.println(Week.SATURDAY.korean);
//		
		System.out.println(Week.SATURDAY.getKorean());
		System.out.println(Week.SATURDAY.getChinese());
//		
		
	}

}
