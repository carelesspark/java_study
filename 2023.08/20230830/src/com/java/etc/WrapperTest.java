package com.java.etc;

import java.util.Random;

public class WrapperTest {

	public static void main(String[] args) {
		// ����Ŭ����(�⺻�� ������ �°� 8�� ����)
		// �⺻���� ���������� ����ȯ�� �ϱ� ���ؼ�
		// ����ڽ��̶�� �θ�(�ڽ�, ��ڽ�)
		
//		int x = 10;
//		String str = "adb";
//		
//		x = str; // �翬�� �ȉ�, Ÿ�Ե� �ٸ�
//		str = x;
//		
		
//		boolean -> Boolean
//		int -> Integer
//		byte -> Byte
		
		int i = 10;
//		Integer it = new Integer(i); // Integer��� Ŭ���� Ÿ������ ��ȯ, �ڽ�
		Integer it = i;

		
		int i2 = 20;
		Integer it2 = (Integer)i2;	// ĳ���� �����ڴ� ���� �����ϴ�
		
		int i3;
		Integer it3 = new Integer(30);
		i3 = (int)it3; // ��ڽ�

		
		System.out.println(it + it3);	
		
		
		Object obj = i; // ����ڽ� -> Integer(i)
		
//		i = obj; // x
		
//		String.valueOf(100);	// ���ڸ� ���ڿ���
//		Integer.parseInt("100"); // ���ڿ��� ���ڷ�
		
		
		// RandomŬ����
		Random ran = new Random();
		int rand = ran.nextInt(10);	// 0 ~ 9 ������ ���� ����
		double rand2 = ran.nextDouble(); 	// 0.0 <=  x  < 1.0 ������ ���� 
		
		System.out.println(rand);
		System.out.println(rand2);
 		
	}

}
