package com.java.synchronizeds;

public class ThreadWaitTest3 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cheif(table), "COOK1").start();
		new Thread(new Buyer(table, "donut"), "CUST1").start();
		new Thread(new Buyer(table, "burger"), "CUST2").start();

		Thread.sleep(2000);
		System.exit(0); // ���α׷� ��������
		
		// suspend, resume�� �������°� �߻��� �� �־� wait, notify�� ���
		// �ٵ� wait�� ��� �ش� �޼ҵ尡 wait�Ǵ°ǵ� notify�� ��� �ش� �޼ҵ尡 �ƴ� ���� �ִ� �޼ҵ� �� �������� notify �ϴ� �� ����
		// wait, notify�� ���� ���� �ѹ� �˾ƺ���

	}

}
