package com.java.generics;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// ���׸���
		// ���� <> ���̿� �ƹ� �͵� ������� �ʴ´ٸ� Object�� ��
		// <>���̿� � Ÿ���� �������� ���� �޼ҵ��� Ÿ���� <>�� ���� Ÿ������ �ٲ�
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		// list.add("4"); // StringŸ���̹Ƿ� ���� �߻�
		
		int i = list.get(2);	// ���� ĳ���� ���� ���� ������ �� ����
		System.out.println(i);
		
		
		for(int num : list) { // ���� for���� ����ϱⰡ ���ϴ�.
			System.out.println(num);
		}

		
		
		
		
		
	}

}
