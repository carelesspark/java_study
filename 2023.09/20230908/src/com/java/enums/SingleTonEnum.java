package com.java.enums;

public enum SingleTonEnum {
	INSTANCE;	// singletonEnum을 대신해서 사용, 얘가 없으면 
	
	int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;	
	}
}
