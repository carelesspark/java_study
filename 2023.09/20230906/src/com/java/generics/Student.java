//package com.java.generics;
//
//import lombok.AllArgsConstructor;
//import lombok.ToString;
//
//@AllArgsConstructor
//@ToString
//public class Student implements Comparable<Student>{
//	String name;
//	int ban;
//	int no;
//	int kor, eng, math;
//	
//	int getTotal() {
//		return kor + eng + math;
//	}
//	
//	float getAvg() {
//		return getTotal() / 3.0f;
//	}
//	
//	@Override
//	public int compareTo(Student s) {	
//		// �������� ���׸����� ������� �ʾұ⿡ �Ű������� Object o�� �ް� Ÿ�� üũ�� �����ؼ� ���� ���ϱ� ���� ĳ������
//		// ���������� ���� Comparable�� ���׸����� ��������ν� �Ű������� StudentŸ�Ը��� �޾� Ÿ�� üũ �� ĳ������ �� �ʿ䰡 ��������.
//		
//		// Comparable�� �ܿ��� Comparator��� �� �������̽��� �ִµ� Comparable�� ����ϰ� ���׸����� �ۼ� ������
//		// Comparable�� �Ű������� �ϳ� �ް�, Comparator�� �Ű������� �� �� �޴� �ٴ� �� �̿ܿ��� ���ӻ��� ����ϴ�.
//			return this.no - s.no
//		}
//		return 0;
//	}
//}

//package com.java.generics;
//
//import lombok.AllArgsConstructor;
//import lombok.ToString;
//
//@AllArgsConstructor
//@ToString
//public class Student implements Comparator<Student>{
//	String name;
//	int ban;
//	int no;
//	int kor, eng, math;
//	
//	int getTotal() {
//		return kor + eng + math;
//	}
//	
//	float getAvg() {
//		return getTotal() / 3.0f;
//	}
//	
//	@Override
//	public int compare(Student s1, Student s2) {	
//		// �������� ���׸����� ������� �ʾұ⿡ �Ű������� Object o�� �ް� Ÿ�� üũ�� �����ؼ� ���� ���ϱ� ���� ĳ������
//		// ���������� ���� Comparable�� ���׸����� ��������ν� �Ű������� StudentŸ�Ը��� �޾� Ÿ�� üũ �� ĳ������ �� �ʿ䰡 ��������.
//		
//		// Comparable�� �ܿ��� Comparator��� �� �������̽��� �ִµ� Comparable�� ����ϰ� ���׸����� �ۼ� ������
//		// Comparable�� �Ű������� �ϳ� �ް�, Comparator�� �Ű������� �� �� �޴� �ٴ� �� �̿ܿ��� ���ӻ��� ����ϴ�.
//			return s1.no - s2.no
//		}
//		return 0;
//	}
//}
