package com.java.etc;

public class ValueTest {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1 == v2) {			
			System.out.println("���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü �Դϴ�.");
		}
		
		if(v1.equals(v2)) {		 	// ���߿��� �ߺ� üũ�� ���� ����
			System.out.println("���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü �Դϴ�.");
		}
		
		System.out.println(v1.hashCode()); 	// hashCode ���� Object Ŭ���� ���� ����
		System.out.println(v2.hashCode());	
	}
}
