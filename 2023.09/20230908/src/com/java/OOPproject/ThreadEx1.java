package com.java.OOPproject;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}

}
