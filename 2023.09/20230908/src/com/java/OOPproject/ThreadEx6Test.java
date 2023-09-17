package com.java.OOPproject;

import javax.swing.JOptionPane;

public class ThreadEx6Test {

	public static void main(String[] args) {
		
		ThreadEx7 th1 = new ThreadEx7();
		th1.start();
		
		String input = JOptionPane.showInputDialog("값 입력: ");	
		System.out.println("입력값은 " + input + "입니다.");
		
		// 이 경우 숫자가 10에서 천천히 1씩 감소되는 출력과 입력을 받는 input이 동시에 발생함
		// 즉 쓰레드를 분리해서 사용하는 중
		
	}

}

//package com.java.OOPproject;
//
//import javax.swing.JOptionPane;
//
//public class ThreadEx6Test {
//
//	public static void main(String[] args) {
//		String input = JOptionPane.showInputDialog("값 입력: ");
//		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		// 위와 같은 경우 값 입력을 받아야지만 10에서 천천히 1씩 감소 됌, 즉 쓰레드가 분리되어있지 않고 하나만을 사용하는 중
//		// 한번 쓰레드 분리를 해보려고 함
//
//	}
//
//}
