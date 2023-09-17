package com.java.synchronizeds;

public class CustomerTest {

	public static void main(String[] args) {
		Runnable r = new Customer();
		new Thread(r).start();
		new Thread(r).start();

	}

}
