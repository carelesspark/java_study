package com.java.generics2;

import java.util.ArrayList;

public class Box<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	
	// �⺻���� ���׸� Ÿ������ �ٲ� �� ����
	T get(int i) {
		return list.get(i);		
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}

}