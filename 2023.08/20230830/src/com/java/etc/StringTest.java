package com.java.etc;

public class StringTest {

	public static void main(String[] args) {
//		String str = "a";
//		String str2 = new String("a");

		String str = "abcdefg";
		//			  0123456
		// String Ŭ�������� ����� �޼ҵ��? �˾ƺ���
		
		char c =  str.charAt(3);
		System.out.println(c);
		
		int idx = str.indexOf('d');
		System.out.println(idx);
	
		int len = str.length();
		System.out.println(len);
		
		String repl = str.replace('c',  'C');
		System.out.println(repl);
		
		String animals = "dog,cat,bear";		// split�� ��ȯ Ÿ���� ����, ���� ������ ���� ��ȯŸ������ �ٲ۴�.
		String[] ani = animals.split(",");
		
		for(String s: ani) {
			System.out.println(s);
		}
		
		
//		str.startsWith("dog");		// dog�� ��ȯŸ���� boolean�̹Ƿ� �޴� ������ boolean����!
//		boolean b = str.startsWith("dog");
//		
		if(animals.startsWith("dog")) {
			System.out.println("dog�� �����ϴ� ���ڿ� �Դϴ�.");
		} else {
			System.out.println("dog�� �����ϴ� ���ڿ� �ƴϴ�.");
		}
		
		// endsWith()
		
		String str2 = "java.cho.com, dsfsdlfdfsjlkdf";
//		str2.substring(beginIndex, endIndex)
		
		String s = str2.substring(5, 10);
		System.out.println(s);
		
		s = str2.substring(5);
		System.out.println(s);
		
		int i = 100;
		String iv = String.valueOf(i);
		System.out.println(iv);		// 10 + ""
		
		String s1 = "Hello";
		System.out.println(s1);
		System.out.println(s1.toString());		// to.String�� �������̵� �Ǿ��� ������ ���� ������ �ȴ�.
		
		
		String ss1 = "Hello";
		String ss2 = "Hello";
		
		if(ss1.equals(ss2)) { // ���ڿ��� �� �񱳽� �ݵ�� .equals ���, ==�� �ּҰ��� ���ϱ⿡ false�� ����
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		
		
		
	}

}
