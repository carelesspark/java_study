package com.java.synchronizeds;

public class Account {

	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withDraw(int money) { // �� �����尡 ����ϰ� ���� ��(�����ϰ� ���� ��), �� ����� �� ���� �ٸ� ��������� ��� �Ұ�
		if(balance >= money) {					   // synchronized �ϳ� �������ν� ����� ������ �ٲ�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			balance -= money;
		}
		// �������� ���� ������ ���̳ʽ� ������ �� �� ����. �����尡 ���� ���� ������ �¾����� �̹� ������ �� ��� balance�� ���� ���̳ʽ� ���� �� �� ����
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
//		// �������� ���� ������ ���̳ʽ� ������ �� �� ����. �����尡 ���� ���� ������ �¾����� �̹� ������ �� ��� balance�� ���� ���̳ʽ� ���� �� �� ����
//	}
//	
//}
