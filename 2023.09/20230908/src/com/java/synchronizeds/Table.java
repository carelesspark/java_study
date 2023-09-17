package com.java.synchronizeds;

import java.util.ArrayList;

public class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public void add(String dish) {		// ArrayList�� ������ ������ MAX_FOOD������ 6�̶�� ũ�� ������ �־���, �̸� Ȱ���ؾ���
		if(dishes.size() >= MAX_FOOD) {
			return;
		} else {
			dishes.add(dish);
			System.out.println("Dishes : " + dishes.toString());
		}
	}
	
	public boolean remove(String dishName) {
		
		for(int i = 0; i < dishes.size(); i++) {
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				
				return true;
			}
		}
		
		return false;
	}
	
	public int dishSize() {
		return dishNames.length;
	}
}
