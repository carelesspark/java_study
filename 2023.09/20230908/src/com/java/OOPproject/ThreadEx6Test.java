package com.java.OOPproject;

import javax.swing.JOptionPane;

public class ThreadEx6Test {

	public static void main(String[] args) {
		
		ThreadEx7 th1 = new ThreadEx7();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�� �Է�: ");	
		System.out.println("�Է°��� " + input + "�Դϴ�.");
		
		// �� ��� ���ڰ� 10���� õõ�� 1�� ���ҵǴ� ��°� �Է��� �޴� input�� ���ÿ� �߻���
		// �� �����带 �и��ؼ� ����ϴ� ��
		
	}

}

//package com.java.OOPproject;
//
//import javax.swing.JOptionPane;
//
//public class ThreadEx6Test {
//
//	public static void main(String[] args) {
//		String input = JOptionPane.showInputDialog("�� �Է�: ");
//		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		// ���� ���� ��� �� �Է��� �޾ƾ����� 10���� õõ�� 1�� ���� ��, �� �����尡 �и��Ǿ����� �ʰ� �ϳ����� ����ϴ� ��
//		// �ѹ� ������ �и��� �غ����� ��
//
//	}
//
//}
