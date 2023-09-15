package com.java.interfaces;

public class Apt2 implements Info{
	@Override
	public void price() {
		System.out.println("가격은 50 만원 입니다.");
	}
	@Override
	public void size() {
		System.out.println("평수는20평 입니다.");
	}
}
