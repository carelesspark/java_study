package com.java.OOPproject;

public class ThreadTest {

	public static void main(String[] args) {
		// Thread
		// Thread ����� �� 2���� ���

		// ThreadŬ���� �Ǵ� Runnable�������̽� ���

		ThreadEx1 th1 = new ThreadEx1();

		Runnable r = new ThreadEx2();
		Thread th2 = new Thread(r);
		
		
		// run �޼ҵ带 ����ص� ������ �ȉ�. start�޼ҵ带 ����ؾ���
		th1.start();
		th2.start();
	}

}
