package com.java.synchronizeds;

public class Customer implements Runnable{

	Account acc = new Account();		// �����忡 ���ǵ� �ν��Ͻ� ������ static �������� ����, ������ ������ Ŭ�������� �����Ǿ�����.

	@Override
	public void run() {
		while(acc.getBalance() > 0) {	// �ܰ� ���� 0������ ���� ���� ��ݹݺ�
			int money = (int)((Math.random() * 3) + 1) * 100;
			acc.withDraw(money);
			System.out.println("�����ִ� �� : " + acc.getBalance());
		}
		
	}
	
	
}
