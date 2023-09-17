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
//		// 기존에는 제네릭스를 사용하지 않았기에 매개변수로 Object o로 받고 타입 체크를 진행해서 값을 비교하기 위해 캐스팅을
//		// 진행했지만 이젠 Comparable에 제네릭스를 사용함으로써 매개변수를 Student타입만을 받아 타입 체크 및 캐스팅을 할 필요가 없어진다.
//		
//		// Comparable이 외에도 Comparator라는 비교 인터페이스가 있는데 Comparable과 비슷하게 제네릭스로 작성 가능함
//		// Comparable은 매개변수를 하나 받고, Comparator는 매개변수를 두 개 받는 다는 점 이외에는 쓰임새가 비슷하다.
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
//		// 기존에는 제네릭스를 사용하지 않았기에 매개변수로 Object o로 받고 타입 체크를 진행해서 값을 비교하기 위해 캐스팅을
//		// 진행했지만 이젠 Comparable에 제네릭스를 사용함으로써 매개변수를 Student타입만을 받아 타입 체크 및 캐스팅을 할 필요가 없어진다.
//		
//		// Comparable이 외에도 Comparator라는 비교 인터페이스가 있는데 Comparable과 비슷하게 제네릭스로 작성 가능함
//		// Comparable은 매개변수를 하나 받고, Comparator는 매개변수를 두 개 받는 다는 점 이외에는 쓰임새가 비슷하다.
//			return s1.no - s2.no
//		}
//		return 0;
//	}
//}
