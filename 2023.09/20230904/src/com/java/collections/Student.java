package com.java.collections;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student other = (Student)o;
			//return this.name.compareTo(other.name);	// 1, 0, -1
			// return this.no - other.no;	// ��ȣ�� ������ �� ��������
			return other.no - this.no;	// ��ȣ�� ������ �� ��������
		}
		return 0;
	}
}
