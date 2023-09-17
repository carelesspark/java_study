package com.java.enums;

public class SingleTonEnumTest {

	public static void main(String[] args) {
		
		SingleTonEnum singleton = SingleTonEnum.INSTANCE;
		System.out.println(singleton.getValue());
		singleton.setValue(10);
		System.out.println(singleton.getValue());
	}

}
