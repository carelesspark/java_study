package com.java.synchronizeds;

public class ThreadWaitTest2 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cheif(table), "COOK1").start();
		new Thread(new Buyer(table, "donut"), "CUST1").start();
		new Thread(new Buyer(table, "burger"), "CUST2").start();

		Thread.sleep(5000);
		System.exit(0); // 프로그램 강제종료
		
		
		// 음식을 하나 만들고 손님이 먹었을 때 더 음식을 못만들고 손님이 계속 기다리게 되는 현상 발생
		// -> remove메소드에서 synchronized 범위를 전체적으로 적용시켜 ArrayList에도 접근이 불가해 음식을 요리사가 만들고 있어도 그 음식을 ArrayList에 
		// 넣을 수 없게 됌 -> 다른 손님은 계속 기다리게 되는 현상 발생(미리 선점한 스레드가 역할을 다 해도 자리를 안 내주는 상황)

	}

}
