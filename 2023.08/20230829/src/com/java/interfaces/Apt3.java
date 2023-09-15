package com.java.interfaces;

public class Apt3 implements Info {
	@Override
	public void price() {
		System.out.println("가격은 10 만원 입니다.");		
	}
	@Override
	public void size() {
		System.out.println("평수는 15평 입니다.");
	}
}
