package com.java.interfaces;


public class Marine extends GroundUnit implements Healable {
	Marine(){
		super(50);
		hitPoint = MAX_HP;		// 최초의 체력이 MAX_HP로 적용됌
	}
}
