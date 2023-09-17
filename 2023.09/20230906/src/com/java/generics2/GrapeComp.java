package com.java.generics2;

import java.util.Comparator;

public class GrapeComp implements Comparator<Grape> {

	@Override
	public int compare(Grape o1, Grape o2) {

		return o2.weight - o1.weight; // 무게를 이용한 내림차순 정렬
	}

}
