package com.java.interfaces;

public class Apt1 implements Info{

	@Override
	public void price() {
		System.out.println("가격은 100 만원 입니다.");
	}
	@Override
	public void size() {
		System.out.println("평수는 30평 입니다.");
	}

}
