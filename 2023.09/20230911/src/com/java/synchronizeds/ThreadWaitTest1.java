package com.java.synchronizeds;

public class ThreadWaitTest1 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cheif(table), "COOK1").start();
		new Thread(new Buyer(table, "donut"), "CUST1").start();
		new Thread(new Buyer(table, "burger"), "CUST2").start();

		Thread.sleep(100);
		System.exit(0); // ���α׷� ��������

		// ���� ������ �߻��ϴµ�, Cheif�� �丮�� ArrayList�� ������ add�Ϸ��� ��, ���ÿ� Buyer�� ArrayList�� ������
		// remove�Ϸ� �ؼ� ����ȭ���� �ʾ�
		// ������ �߻��ϰ� ��, �̸� �ذ��ϱ� ���� add�� remove �޼ҵ忡 synchronized Ű���带 ����ؼ� ���� ȿ���� ����� ������
		// �ذ���

	}

}
