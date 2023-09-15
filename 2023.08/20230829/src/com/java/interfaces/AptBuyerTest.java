package com.java.interfaces;

public class AptBuyerTest {

	public static void main(String[] args) {
		
			Apt1 a1 = new Apt1();
			Apt2 a2 = new Apt2();
			Apt3 a3 = new Apt3();
			Apt4 a4 = new Apt4();
		
			AptBuyer user = new AptBuyer();
			user.setAptinfo(a4);
			user.aptInfo();
	}

}
