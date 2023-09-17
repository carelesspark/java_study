package com.java.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {
		// HashMap
//		HashMap map = new HashMap();
//		map.put("myId", "1234"); // map�� ��� key�� value���� ���ÿ� ����� �� �ִ�.
//		map.put("asdf", "1111");
//		map.put("asdf", "1234"); // key���� 2��° map�� value�� 1��° map�� �����ϰ� �ۼ��غ�
		
//		System.out.println(map);
		// 1, 3��° map�� ���,, �ߺ��� ������� �ʰ�, ������ ���� ��µǴ� ���� Ȯ��
		
//		String value = (String)map.get("myId"); // �Է��� key���� ���� value���� ����
//		System.out.println(value);
		
		
//		Iterator keys = map.keySet().iterator();
//		while(keys.hasNext()) {
//			String key = (String)keys.next();
//			System.out.print("key : " + key);			
//			System.out.print(", value : " + map.get(key));
//			System.out.println();
//		}
		// Iterator�� ����ؼ� key�� value�� ���
		
//		Iterator entrySet = map.entrySet().iterator();
//		
//		while(entrySet.hasNext()) {
//			Map.Entry entry = (Map.Entry)entrySet.next();	// Map.EntryŸ���� �̿��ؼ� key�� value���� ���� �� �����ϰ� �ҷ��� �� ����.
//			
//			String key = (String)entry.getKey();
//			String value = (String)entry.getValue();
//			
//			System.out.println("key�� : " + key + ", value�� : " + value);
//		}
		
		// TreeMap
//		String[] data = {"A", "K", "A", "D", "K", "A", "K", "K", "K", "Z", "D"};
//		
//		TreeMap map = new TreeMap();
//		
//		for(int i = 0; i < data.length; i++) {
//			if(map.containsKey(data[i])) { // key�� �ߺ� üũ �� �ߺ��ϸ� value�� + 1
//				int value = (Integer)map.get(data[i]);
//				map.put(data[i], value + 1);
//			} else {
//				map.put(data[i], 1); // ����ڽ��� �Ǳ⶧���� ���� Wrapper Ŭ���� �����ص� ��
//			}
//		}	
//
//		Iterator entrySet = map.entrySet().iterator();
//		
//		while(entrySet.hasNext()) {
//			Map.Entry entry = (Map.Entry)entrySet.next();	// Map.EntryŸ���� �̿��ؼ� key�� value���� ���� �� �����ϰ� �ҷ��� �� ����.
//			
//			String key = (String)entry.getKey();
//			Integer value = (Integer)entry.getValue();
//			
//			System.out.println("key�� : " + key + ", value�� : " + value);
//		}
		
		// Properties
//		Properties prop = new Properties();
//		
//		prop.setProperty("myId", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
//		System.out.println(prop);
//		
//		System.out.println(prop.getProperty("myId"));
//		
//		Enumeration e = prop.propertyNames();	// key�� ��ü ������ == map�� keySet()�� ���� ����
//		
//		while(e.hasMoreElements()) {
//			String element =(String)e.nextElement();
//			System.out.println(element + "=" + prop.getProperty(element));
//		}
		
//		// �ؽ�Ʈ ���� ���
//		// ����ϱ� ���ؼ� ���� ó���� ���־����.
//		Properties prop = new Properties();
//
//		try {
//			prop.load(new FileInputStream("input.txt"));	// Properties�� ������ ����
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}	
//		
//		String name = prop.getProperty("name");
//		String[] data = prop.getProperty("data").split(",");
//		
//		int sum = 0;
//		for(String s : data) {
//			int num = Integer.parseInt(s);
//			sum += num;
//		}
//		
//		double avg = sum / (double)data.length;
//		
//		System.out.println(name);
//		System.out.println(sum);
//		System.out.println(avg);
		
		
		// �ؽ�Ʈ ���� ����
		// ���������� ����ϱ� ���� ����ó���� �ʿ���
// 		Properties prop = new Properties();
//		
//		prop.setProperty("name", "lee sun sin");
//		prop.setProperty("age", "10");
//		
//		
//		try {
//			prop.store(new FileOutputStream("output.txt"), "test properties");
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(88);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(23);
		list.add(15);
		
		System.out.println("list ���� ��");
		
		System.out.println(list);
		Collections.sort(list);			// TreeSet�� �Ⱦ��� ���� ����!
		System.out.println("list ���� ��");
		System.out.println(list);

		HashSet set = new HashSet(list);
		
		System.out.println(set);
		
		ArrayList list2 = new ArrayList(set);
		
		System.out.println(list2);
		// list ���� �ߺ� ���� ���ְ� ������ set���� �ٲپ��ٰ� �ٽ� list�� ��ȯ
		
		System.out.println();
		list.addAll(set);
		System.out.println(list);
		
		TreeSet tset = new TreeSet(set);
		System.out.println(tset);
		// set���� �������ֱ� ���� tset���� �ٲ�
		// ���� ���ų� ���� �ڸ����� ���� ��� �Ϲ����� HashSet�� ����� �� ������ �� ��ó�� ����, �� ó�� ���� ���� ������ ��������
		// ��
		
		Stack stack = new Stack();
		
		stack.addAll(tset);
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		// tset�� ��� ���� �������� ������ �Ǵµ� ū ���ں��� ��µǰԲ��Ϸ��� stack�� �̿��ϱ�
		
		
	}

	

}
