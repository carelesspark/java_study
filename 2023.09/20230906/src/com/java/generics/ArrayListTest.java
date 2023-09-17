package com.java.generics;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// 제네릭스
		// 만약 <> 사이에 아무 것도 사용하지 않는다면 Object가 들어감
		// <>사이에 어떤 타입이 들어가는지에 따라 메소드의 타입이 <>와 같은 타입으로 바뀜
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		// list.add("4"); // String타입이므로 오류 발생
		
		int i = list.get(2);	// 따라서 캐스팅 없이 값을 저장할 수 있음
		System.out.println(i);
		
		
		for(int num : list) { // 향상된 for문을 사용하기가 편하다.
			System.out.println(num);
		}

		
		
		
		
		
	}

}
