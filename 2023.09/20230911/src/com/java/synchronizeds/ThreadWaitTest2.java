package com.java.synchronizeds;

public class ThreadWaitTest2 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();

		new Thread(new Cheif(table), "COOK1").start();
		new Thread(new Buyer(table, "donut"), "CUST1").start();
		new Thread(new Buyer(table, "burger"), "CUST2").start();

		Thread.sleep(5000);
		System.exit(0); // ���α׷� ��������
		
		
		// ������ �ϳ� ����� �մ��� �Ծ��� �� �� ������ ������� �մ��� ��� ��ٸ��� �Ǵ� ���� �߻�
		// -> remove�޼ҵ忡�� synchronized ������ ��ü������ ������� ArrayList���� ������ �Ұ��� ������ �丮�簡 ����� �־ �� ������ ArrayList�� 
		// ���� �� ���� �� -> �ٸ� �մ��� ��� ��ٸ��� �Ǵ� ���� �߻�(�̸� ������ �����尡 ������ �� �ص� �ڸ��� �� ���ִ� ��Ȳ)

	}

}
