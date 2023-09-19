package com.java.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// Optional
		// ��ü�� ���δ� ����Ŭ����
		// ��ü�� ���� null ������ �Ǵ��ϴ� �뵵�� ���

		
//		String str = null;
//		if(str != null) {
//			
//		}	// ������ ��� �̷��� �������� ��ü�� null���� ������ �Ǵ��ߴ�.
		
//		String str = "abc";
//		
//		Optional<String> optVal = Optional.of(str);
//		System.out.println(optVal.get());	// Optional�� �̿��� ��ü �� ���
		
//		String str = null;
//		Optional<String> optVal = Optional.of(str);	// ��ü ���� null�� ��� ������ �߻�
		
		
//		String str = "abc";
//		Optional<String> optVal = Optional.of(str);
//		
//		String rstr1 = optVal.get();
//		String rstr2 = optVal.orElse("");	//	optVal�� null �̸� ""(�� ���ڿ�)�� ��ȯ
//		System.out.println(rstr1);
//		System.out.println(rstr2);
		
		// new String();
		// String str3 = new String();
//		String str3 = optVal.orElseGet(String::new);	// �Ű����� ������ Supplier������ ��Ƿ�, �Ű����� ���� ���� �����ϴ� ���� ǥ���� ����
//		String str4 = optVal.orElseThrow(NullPointerException::new);	// ��ü�� null�� �� ���� ó��
		
		String str = "123";
		
		int result = Optional.of(str)
		.filter(x -> x.length() > 0)
		.map(Integer::parseInt)	// �޼ҵ� ���� ��� ���� (���� �� : x -> Integer.parseInt(x))
		.orElse(-1);	// ���ڰ� �ƴ� ���� ��� -1�� ��ȯ, orElse�� �ѹ� �� ã�ƺ���
		System.out.println(result);
//		
//		String str = null;
//		String result2 = Optional.ofNullable(str).orElse("null ���̴�."); // str������ null���� �����ϰ� ofNullable�� üũ�ϴµ� null�� ��� orElse��
//																		  // ������ �� result2�� ����
//		System.out.println(result2);

	}

}
