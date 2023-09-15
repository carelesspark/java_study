package com.java.interfaces;

public class Apt4 implements Info{
	@Override
	public void price() {
		System.out.println("가격은 1000 만원 입니다.");	
	}
	@Override
	public void size() {
		System.out.println("평수는 200평 입니다.");
	}
}
