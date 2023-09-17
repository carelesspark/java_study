package com.java.collections;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// Hash와 Tree 차이점 알아보기
		// 아마 정렬의 차이???
		
		TreeSet set = new TreeSet();
		set.add(1);		// Integer(1)의 형태로 오토박싱 됌
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(3);
		
		System.out.println(set);
		// 데이터를 정렬해준다. (오름차순) -> Integer 클래스 내의 
		// Comparable 인터페이스 상속(?)을 통해 값을 무작위로 집어넣어도 오름차순으로 정렬
		// 데이터 타입(참조형)안에 정렬에 대한 정의가 되어있다.
		// TreeSet은 값으로 사용하는 객체에 반드시 정렬과 관련된 
		// 인터페이스 오버 라이딩이 되어있어야한다.
		
		
		
		for(Object obj : set) {	// 향상된 for문
			int i = (Integer)obj;
		
			System.out.println(i);
		}
		
		
	}

}
