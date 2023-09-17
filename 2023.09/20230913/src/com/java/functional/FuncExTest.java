package com.java.functional;

import java.util.ArrayList;

public class FuncExTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		
		FuncEx.<Integer>printArr(list);
		// <Integer>가 FuncEx 클래스 내의 static <T> void printArr 중 <T>에 들어가게 됌
		// <Integer>를 보통은 붙이는게 정석이지만, 타입 유추가 가능할 경우 생략도 가능하다.
	}

}
