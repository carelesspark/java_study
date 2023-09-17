package com.java.synchronizeds;

public class ThreadWaitTest3 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cheif(table), "COOK1").start();
		new Thread(new Buyer(table, "donut"), "CUST1").start();
		new Thread(new Buyer(table, "burger"), "CUST2").start();

		Thread.sleep(2000);
		System.exit(0); // 프로그램 강제종료
		
		// suspend, resume은 교착상태가 발생할 수 있어 wait, notify를 사용
		// 근데 wait의 경우 해당 메소드가 wait되는건데 notify의 경우 해당 메소드가 아닌 쉬고 있는 메소드 중 랜덤으로 notify 하는 것 같음
		// wait, notify에 대한 예제 한번 알아보기

	}

}
