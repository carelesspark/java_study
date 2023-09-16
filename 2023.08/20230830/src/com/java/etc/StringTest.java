package com.java.etc;

public class StringTest {

	public static void main(String[] args) {
//		String str = "a";
//		String str2 = new String("a");

		String str = "abcdefg";
		//			  0123456
		// String 클래스에서 사용한 메소드들? 알아보기
		
		char c =  str.charAt(3);
		System.out.println(c);
		
		int idx = str.indexOf('d');
		System.out.println(idx);
	
		int len = str.length();
		System.out.println(len);
		
		String repl = str.replace('c',  'C');
		System.out.println(repl);
		
		String animals = "dog,cat,bear";		// split의 반환 타입을 보고, 받을 변수도 같은 반환타입으로 바꾼다.
		String[] ani = animals.split(",");
		
		for(String s: ani) {
			System.out.println(s);
		}
		
		
//		str.startsWith("dog");		// dog의 반환타입은 boolean이므로 받는 변수도 boolean으로!
//		boolean b = str.startsWith("dog");
//		
		if(animals.startsWith("dog")) {
			System.out.println("dog로 시작하는 문자열 입니다.");
		} else {
			System.out.println("dog로 시작하는 문자열 아니다.");
		}
		
		// endsWith()
		
		String str2 = "java.cho.com, dsfsdlfdfsjlkdf";
//		str2.substring(beginIndex, endIndex)
		
		String s = str2.substring(5, 10);
		System.out.println(s);
		
		s = str2.substring(5);
		System.out.println(s);
		
		int i = 100;
		String iv = String.valueOf(i);
		System.out.println(iv);		// 10 + ""
		
		String s1 = "Hello";
		System.out.println(s1);
		System.out.println(s1.toString());		// to.String이 오버라이딩 되었기 때문에 값이 나오게 된다.
		
		
		String ss1 = "Hello";
		String ss2 = "Hello";
		
		if(ss1.equals(ss2)) { // 문자열의 값 비교시 반드시 .equals 사용, ==는 주소값을 비교하기에 false가 나옴
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		
		
	}

}
