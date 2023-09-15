package com.javachobo.modifier;

public class Singleton {
	// 싱글톤 패턴
	// 생성자가 private한 클래스
	// 외부에서 생성이 안되게끔 만듦
	
	// 싱글톤 패턴 기본 코드, 그냥 외우기
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return s;
	}
	
	public static void print() {
		System.out.println("Singleton Print");
	}
	
	
}
