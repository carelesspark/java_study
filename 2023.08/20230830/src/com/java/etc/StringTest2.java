package com.java.etc;

public class StringTest2 {

	public static void main(String[] args) {
//		String fileName = "Hello.java"; // asdfewf.jsp, efesfs.tx
//		
//		int idx = fileName.indexOf('.');
//		
//		
//		String fn = fileName.substring(0, idx);
//		String ext = fileName.substring(idx + 1);
//		System.out.println(fn);
//		System.out.println(ext);
//		
//		
//		String str = "ababaccaaa";
//		int count = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(c == 'a') {
//				count++;
//			}
//		}
//
//		System.out.println(count);
		
		
		// StringBuffer , StringBuilder
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("111");
		System.out.println(sb);
		
		String str;
//		str = (String)sb; // ����ȯ x, ����ȯ�� ��Ӱ��迡���� ����
		
		str = sb.toString(); // new String(toStringCache), ĳ������ ���ҷ� ����� �� ����
		
		System.out.println(str);
//		
		
		
		
	}

}
