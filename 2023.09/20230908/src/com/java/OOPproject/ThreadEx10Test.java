package com.java.OOPproject;

public class ThreadEx10Test implements Runnable{
	
	static boolean autoSave = false;

	// 주 스레드
	public static void main(String[] args) {
		// 데몬 스레드는 주 스레드에 기생하는 쓰레드로 스레드가 종료되면 작업을 하고 있더라도 강제 종료됌
		
		Thread daemon = new Thread(new ThreadEx10Test());
		daemon.setDaemon(true); // setDaemon을 실행하는 위치가 주인, 메인스레드가 주 스레드
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
		
		System.out.println("프로그램이 종료됨");
	}
	
	// 데몬 스레드
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
		System.out.println("작업 파일이 저장되었습니다.");
	}
	
	
	// 현재 지금 2개의 스레드가 같이 돌아 가는 중
}
