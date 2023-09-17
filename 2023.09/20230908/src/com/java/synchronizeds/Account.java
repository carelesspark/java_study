package com.java.synchronizeds;

public class Account {

	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withDraw(int money) { // 한 스레드가 사용하고 있을 때(선점하고 있을 때), 다 사용할 때 까지 다른 스레드들은 사용 불가
		if(balance >= money) {					   // synchronized 하나 붙임으로써 결과가 완전히 바뀜
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			balance -= money;
		}
		// 스레드의 경합 때문에 마이너스 통장이 될 수 있음. 스레드가 들어올 때는 조건이 맞았지만 이미 실행이 된 경우 balance의 값이 마이너스 값이 될 수 있음
	}
	
}

//package com.java.synchronizeds;
//
//public class Account {
//
//	private int balance = 1000;
//	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public  void withDraw(int money) {
//		if(balance >= money) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//			balance -= money;
//		}
//		// 스레드의 경합 때문에 마이너스 통장이 될 수 있음. 스레드가 들어올 때는 조건이 맞았지만 이미 실행이 된 경우 balance의 값이 마이너스 값이 될 수 있음
//	}
//	
//}
