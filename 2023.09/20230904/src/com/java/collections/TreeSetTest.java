package com.java.collections;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// Hash�� Tree ������ �˾ƺ���
		// �Ƹ� ������ ����???
		
		TreeSet set = new TreeSet();
		set.add(1);		// Integer(1)�� ���·� ����ڽ� ��
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(3);
		
		System.out.println(set);
		// �����͸� �������ش�. (��������) -> Integer Ŭ���� ���� 
		// Comparable �������̽� ���(?)�� ���� ���� �������� ����־ ������������ ����
		// ������ Ÿ��(������)�ȿ� ���Ŀ� ���� ���ǰ� �Ǿ��ִ�.
		// TreeSet�� ������ ����ϴ� ��ü�� �ݵ�� ���İ� ���õ� 
		// �������̽� ���� ���̵��� �Ǿ��־���Ѵ�.
		
		
		
		for(Object obj : set) {	// ���� for��
			int i = (Integer)obj;
		
			System.out.println(i);
		}
		
		
	}

}
