package com.java.OOPproject;

public class ThreadTest {

	public static void main(String[] args) {
		// Thread
		// Thread 만드는 법 2가지 방법

		// Thread클래스 또는 Runnable인터페이스 사용

		ThreadEx1 th1 = new ThreadEx1();

		Runnable r = new ThreadEx2();
		Thread th2 = new Thread(r);
		
		
		// run 메소드를 사용해도 실행이 안됌. start메소드를 사용해야함
		th1.start();
		th2.start();
	}

}
