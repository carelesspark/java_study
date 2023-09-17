package com.java.generics2;

import java.util.Comparator;

public class AppleComp implements Comparator<Apple> {

	@Override
	public int compare(Apple o1, Apple o2) {

		return o1.weight - o2.weight; // 무게를 이용한 오름차순 정렬
	}

}
