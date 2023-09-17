package com.java.synchronizeds;

public class Customer implements Runnable{

	Account acc = new Account();		// 스레드에 정의된 인스턴스 변수는 static 개념으로 사용됌, 변수는 스레드 클래스에서 공유되어진다.

	@Override
	public void run() {
		while(acc.getBalance() > 0) {	// 잔고에 돈이 0원보다 많을 동안 출금반복
			int money = (int)((Math.random() * 3) + 1) * 100;
			acc.withDraw(money);
			System.out.println("남아있는 돈 : " + acc.getBalance());
		}
		
	}
	
	
}
