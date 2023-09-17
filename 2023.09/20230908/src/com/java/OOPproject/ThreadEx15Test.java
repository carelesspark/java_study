package com.java.OOPproject;

public class ThreadEx15Test {

	public static void main(String[] args) {
		Runnable r = new Runnable15();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		
		th1.start();
		th2.start();
		th3.start();
		// ���� ����, ������ �����־�� ��
		
		
		try {
			Thread.sleep(3000);		// ���� ������ ����, �� ������ 3���� ���ư�
			th1.suspend();			// �Ͻ� ����
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();			// �簳
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
		
		// ������ ������ �߻��� ���� �ִ�.
		// stop�� ������� �� �ٷ� ����Ǵ� ���� �ƴ� suspend�Ǿ��ִ� ���¿��� �ٽ� �ҷ��� �� ����Ǳ⿡, ������ ����� �ǰ� ���ᰡ �� ���� �ִ�.
	}

}
