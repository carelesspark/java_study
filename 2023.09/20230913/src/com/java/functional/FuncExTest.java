package com.java.functional;

import java.util.ArrayList;

public class FuncExTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		
		FuncEx.<Integer>printArr(list);
		// <Integer>�� FuncEx Ŭ���� ���� static <T> void printArr �� <T>�� ���� ��
		// <Integer>�� ������ ���̴°� ����������, Ÿ�� ���߰� ������ ��� ������ �����ϴ�.
	}

}
