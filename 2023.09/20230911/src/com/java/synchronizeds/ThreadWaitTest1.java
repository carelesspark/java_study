package com.java.synchronizeds;

public class ThreadWaitTest1 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cheif(table), "COOK1").start();
		new Thread(new Buyer(table, "donut"), "CUST1").start();
		new Thread(new Buyer(table, "burger"), "CUST2").start();

		Thread.sleep(100);
		System.exit(0); // 프로그램 강제종료

		// 가끔 오류가 발생하는데, Cheif가 요리를 ArrayList에 음식을 add하려할 때, 동시에 Buyer가 ArrayList의 음식을
		// remove하려 해서 동기화되지 않아
		// 오류가 발생하게 됌, 이를 해결하기 위해 add와 remove 메소드에 synchronized 키워드를 사용해서 선점 효과를 만들어 오류를
		// 해결함

	}

}
