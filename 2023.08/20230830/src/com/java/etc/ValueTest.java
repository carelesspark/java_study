package com.java.etc;

public class ValueTest {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1 == v2) {			
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
		
		if(v1.equals(v2)) {		 	// 나중에는 중복 체크에 관해 사용됨
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
		
		System.out.println(v1.hashCode()); 	// hashCode 역시 Object 클래스 내에 존재
		System.out.println(v2.hashCode());	
	}
}
