package com.java.interfaces;


public class Marine extends GroundUnit implements Healable {
	Marine(){
		super(50);
		hitPoint = MAX_HP;		// ������ ü���� MAX_HP�� �����
	}
}
