package com.java.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapGenericTest {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 	// HashMap�� ��� key�� value�� ���׸� Ÿ���� ���� �� ����
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		
		// ���׸� ���� ��
//		Iterator entrys = map.entrySet().iterator();
//		
//		while(entrys.hasNext()) {
//			Map.Entry entry = (Map.Entry)entrys.next();
//		}
		
		// ���׸� ���� ��
//		Iterator<Map.Entry<Integer, Integer>> entrys = map.entrySet().iterator();
//		
//		while(entrys.hasNext()) {
//			Map.Entry<Integer, Integer> entry = entrys.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		// ���� for���� �̿��� ���
		for(Map.Entry<Integer, Integer> entrys : map.entrySet()) {
			System.out.println(entrys.getKey());
			System.out.println(entrys.getValue());
		}
		
		map.forEach((key,value)->{
			System.out.println(key + ", " + value);
		});
	}

}
