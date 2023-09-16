package com.java.etc;

import java.util.Random;

public class WrapperTest {

	public static void main(String[] args) {
		// 래퍼클래스(기본형 개수에 맞게 8개 제공)
		// 기본형과 참조형간의 형변환을 하기 위해서
		// 오토박싱이라고 부름(박싱, 언박싱)
		
//		int x = 10;
//		String str = "adb";
//		
//		x = str; // 당연히 안됌, 타입도 다름
//		str = x;
//		
		
//		boolean -> Boolean
//		int -> Integer
//		byte -> Byte
		
		int i = 10;
//		Integer it = new Integer(i); // Integer라는 클래스 타입으로 변환, 박싱
		Integer it = i;

		
		int i2 = 20;
		Integer it2 = (Integer)i2;	// 캐스팅 연산자는 생략 가능하다
		
		int i3;
		Integer it3 = new Integer(30);
		i3 = (int)it3; // 언박싱

		
		System.out.println(it + it3);	
		
		
		Object obj = i; // 오토박싱 -> Integer(i)
		
//		i = obj; // x
		
//		String.valueOf(100);	// 숫자를 문자열로
//		Integer.parseInt("100"); // 문자열을 숫자로
		
		
		// Random클래스
		Random ran = new Random();
		int rand = ran.nextInt(10);	// 0 ~ 9 사이의 난수 생성
		double rand2 = ran.nextDouble(); 	// 0.0 <=  x  < 1.0 사이의 난수 
		
		System.out.println(rand);
		System.out.println(rand2);
 		
	}

}
