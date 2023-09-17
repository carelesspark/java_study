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
		// 무한 루프, 언젠가 멈춰주어야 함
		
		
		try {
			Thread.sleep(3000);		// 메인 스레드 멈춤, 위 스레드 3개는 돌아감
			th1.suspend();			// 일시 멈춤
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();			// 재개
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		// 가끔씩 오류가 발생할 때가 있다.
		// stop을 사용했을 때 바로 종료되는 것이 아닌 suspend되어있는 상태에서 다시 불러내 곧 종료되기에, 가끔씩 출력이 되고 종료가 될 때가 있다.
	}

}
