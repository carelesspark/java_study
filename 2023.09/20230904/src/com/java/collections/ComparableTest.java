package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		Student s1 = new Student("hong", 1, 1, 70, 80, 80);
		Student s2 = new Student("park", 1, 2, 70, 80, 80);
		Student s3 = new Student("choi", 1, 3, 70, 80, 80);
		Student s4 = new Student("lee", 1, 4, 70, 80, 80);
		Student s5 = new Student("kim", 1, 5, 70, 80, 80);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		System.out.println(list);

		Collections.sort(list); // ������ ������ ã�� �� ���� ������ �߻� 
		// -> Student Ŭ������ implements Comparable�� Ŭ���� ���� �ٿ� �������̵����� �ڵ� ����

		System.out.println("=================================================");
		
		System.out.println(list);

	}

}
