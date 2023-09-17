package com.java.synchronizeds;

import java.util.ArrayList;

public class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<String>();

	public synchronized void add(String dish) { // ArrayList는 제한이 없지만 MAX_FOOD변수로 6이라는 크기 제한을 주었음, 이를 활용해야함

		// while문은 음식이 이미 6개 수량일 때,
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " 다 만들어서 is waiting");

			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		// 음식을 만들어야 될 때
		dishes.add(dish);
		notify();
		System.out.println("Dishes : " + dishes.toString());

	}

//	public synchronized boolean remove(String dishName) {
//		
//		for(int i = 0; i < dishes.size(); i++) {
//			if(dishName.equals(dishes.get(i))) {
//				dishes.remove(i);
//				
//				return true;
//			}
//		}
//		
//		return false;
//	}

	public void remove(String dishName) { // 위 synchronized를 사용해도 되고 이러한 방식을 사용해도 됌, 사용 범위가 조금 달라짐
		synchronized (this) {
			String name = Thread.currentThread().getName();
			// while문은 음식이 하나도 없을 때
			while (dishes.size() == 0) {

				System.out.println(name + " 접시에 음식이 없어서 is waiting ");
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}

			// for문은 음식이 하나라도 있을 때
			while (true) {

				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}
				}

				try { // 내가 먹을 음식이 없을 때,
					System.out.println(name + " 내가 먹을께 없어 is waiting");
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}

			}
		}
	}

	// wait과 notify는 synchronized 락을 풀어주는 역할?

	public int dishSize() {
		return dishNames.length;
	}
}
