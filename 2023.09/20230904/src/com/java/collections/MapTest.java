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
//		map.put("myId", "1234"); // map의 경우 key와 value값을 동시에 사용할 수 있다.
//		map.put("asdf", "1111");
//		map.put("asdf", "1234"); // key값은 2번째 map과 value는 1번째 map과 동일하게 작성해봄
		
//		System.out.println(map);
		// 1, 3번째 map이 출력됌,, 중복을 허용하지 않고, 마지막 값이 출력되는 것을 확인
		
//		String value = (String)map.get("myId"); // 입력한 key값에 따른 value값을 제공
//		System.out.println(value);
		
		
//		Iterator keys = map.keySet().iterator();
//		while(keys.hasNext()) {
//			String key = (String)keys.next();
//			System.out.print("key : " + key);			
//			System.out.print(", value : " + map.get(key));
//			System.out.println();
//		}
		// Iterator을 사용해서 key와 value값 출력
		
//		Iterator entrySet = map.entrySet().iterator();
//		
//		while(entrySet.hasNext()) {
//			Map.Entry entry = (Map.Entry)entrySet.next();	// Map.Entry타입을 이용해서 key와 value값을 조금 더 간편하게 불러올 수 있음.
//			
//			String key = (String)entry.getKey();
//			String value = (String)entry.getValue();
//			
//			System.out.println("key값 : " + key + ", value값 : " + value);
//		}
		
		// TreeMap
//		String[] data = {"A", "K", "A", "D", "K", "A", "K", "K", "K", "Z", "D"};
//		
//		TreeMap map = new TreeMap();
//		
//		for(int i = 0; i < data.length; i++) {
//			if(map.containsKey(data[i])) { // key값 중복 체크 후 중복하면 value값 + 1
//				int value = (Integer)map.get(data[i]);
//				map.put(data[i], value + 1);
//			} else {
//				map.put(data[i], 1); // 오토박싱이 되기때문에 굳이 Wrapper 클래스 사용안해도 댐
//			}
//		}	
//
//		Iterator entrySet = map.entrySet().iterator();
//		
//		while(entrySet.hasNext()) {
//			Map.Entry entry = (Map.Entry)entrySet.next();	// Map.Entry타입을 이용해서 key와 value값을 조금 더 간편하게 불러올 수 있음.
//			
//			String key = (String)entry.getKey();
//			Integer value = (Integer)entry.getValue();
//			
//			System.out.println("key값 : " + key + ", value값 : " + value);
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
//		Enumeration e = prop.propertyNames();	// key값 전체 가져옴 == map의 keySet()과 같은 역할
//		
//		while(e.hasMoreElements()) {
//			String element =(String)e.nextElement();
//			System.out.println(element + "=" + prop.getProperty(element));
//		}
		
//		// 텍스트 파일 사용
//		// 사용하기 위해서 예외 처리를 해주어야함.
//		Properties prop = new Properties();
//
//		try {
//			prop.load(new FileInputStream("input.txt"));	// Properties에 데이터 삽입
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
		
		
		// 텍스트 파일 생성
		// 마찬가지로 사용하기 위해 예외처리가 필요함
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
		
		System.out.println("list 정렬 전");
		
		System.out.println(list);
		Collections.sort(list);			// TreeSet을 안쓰고도 정렬 가능!
		System.out.println("list 정렬 후");
		System.out.println(list);

		HashSet set = new HashSet(list);
		
		System.out.println(set);
		
		ArrayList list2 = new ArrayList(set);
		
		System.out.println(list2);
		// list 내의 중복 값을 없애고 싶으면 set으로 바꾸었다가 다시 list로 변환
		
		System.out.println();
		list.addAll(set);
		System.out.println(list);
		
		TreeSet tset = new TreeSet(set);
		System.out.println(tset);
		// set값을 정렬해주기 위해 tset으로 바꿈
		// 값이 적거나 일의 자리수가 많을 경우 일반적인 HashSet을 출력할 때 정렬이 된 것처럼 보임, 위 처럼 높은 값을 찍으면 랜덤으로
		// 들어감
		
		Stack stack = new Stack();
		
		stack.addAll(tset);
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		// tset의 경우 오름 차순으로 정렬이 되는데 큰 숫자부터 출력되게끔하려면 stack을 이용하기
		
		
	}

	

}
