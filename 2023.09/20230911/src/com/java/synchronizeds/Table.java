package com.java.synchronizeds;

import java.util.ArrayList;

public class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<String>();

	public synchronized void add(String dish) { // ArrayList�� ������ ������ MAX_FOOD������ 6�̶�� ũ�� ������ �־���, �̸� Ȱ���ؾ���

		// while���� ������ �̹� 6�� ������ ��,
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " �� ���� is waiting");

			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		// ������ ������ �� ��
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

	public void remove(String dishName) { // �� synchronized�� ����ص� �ǰ� �̷��� ����� ����ص� ��, ��� ������ ���� �޶���
		synchronized (this) {
			String name = Thread.currentThread().getName();
			// while���� ������ �ϳ��� ���� ��
			while (dishes.size() == 0) {

				System.out.println(name + " ���ÿ� ������ ��� is waiting ");
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}

			// for���� ������ �ϳ��� ���� ��
			while (true) {

				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}
				}

				try { // ���� ���� ������ ���� ��,
					System.out.println(name + " ���� ������ ���� is waiting");
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}

			}
		}
	}

	// wait�� notify�� synchronized ���� Ǯ���ִ� ����?

	public int dishSize() {
		return dishNames.length;
	}
}
