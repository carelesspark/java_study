package com.java.collections;

import java.util.HashSet;

public class HashSetText {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		Person p1 = new Person("hong", 10);
		Person p2 = new Person("hong", 10);
		Person p3 = new Person("hong", 20);
		Person p4 = new Person("hong", 30);
		
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
		
	}

}
