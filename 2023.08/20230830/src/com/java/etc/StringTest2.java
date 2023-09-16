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
//		str = (String)sb; // 형변환 x, 형변환은 상속관계에서만 가능
		
		str = sb.toString(); // new String(toStringCache), 캐스팅의 역할로 사용할 수 있음
		
		System.out.println(str);
//		
		
		
		
	}

}
