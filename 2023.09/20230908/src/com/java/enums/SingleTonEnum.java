package com.java.enums;

public enum SingleTonEnum {
	INSTANCE;	// singletonEnum�� ����ؼ� ���, �갡 ������ 
	
	int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;	
	}
}
