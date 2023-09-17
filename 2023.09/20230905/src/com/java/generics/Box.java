package com.java.generics;

import java.util.ArrayList;

public class Box<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	
	// 기본형은 제네릭 타입으로 바꿀 수 없음
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
