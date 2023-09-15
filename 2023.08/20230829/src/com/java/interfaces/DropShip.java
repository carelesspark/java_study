package com.java.interfaces;

public class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(250);
		hitPoint = MAX_HP;
	}
}
