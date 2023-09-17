package com.java.OOPproject;

public class ThreadEx10Test implements Runnable{
	
	static boolean autoSave = false;

	// �� ������
	public static void main(String[] args) {
		// ���� ������� �� �����忡 ����ϴ� ������� �����尡 ����Ǹ� �۾��� �ϰ� �ִ��� ���� �����
		
		Thread daemon = new Thread(new ThreadEx10Test());
		daemon.setDaemon(true); // setDaemon�� �����ϴ� ��ġ�� ����, ���ν����尡 �� ������
		daemon.start();
		
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i == 5) {
				autoSave = true;
			}
		}
		
		System.out.println("���α׷��� �����");
	}
	
	// ���� ������
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				if(autoSave == true) {
					autoSave();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	public void autoSave() {
		System.out.println("�۾� ������ ����Ǿ����ϴ�.");
	}
	
	
	// ���� ���� 2���� �����尡 ���� ���� ���� ��
}
