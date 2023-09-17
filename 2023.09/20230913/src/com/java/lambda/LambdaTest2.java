package com.java.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {
		// �Լ��� �������̽��� ����ȯ
		// Object�� ���� ����ȯ �Ұ�
		
//		(Object)(()->{}) // Object�� ���� ����ȯ �Ұ�
		// �Լ��� �������̽��� ����ȯ �� ObjectŸ������ ��ȯ
		
		MyFunction f = () -> {};	// MyFunction f = (MyFunction)(()->{});
//		Object obj = (Object)(MyFunction)(() -> {});	// �̷��� �Լ��� �������̽��� ����ȯ �� Object Ÿ������ ����ȯ �� 
		Object obj = (MyFunction)(() -> {});			// �㳪 ���� Object�� ���� �����ϱ⿡ �̷��� �ۼ��ص� ������
		
		String str = ((Object)(MyFunction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{});
		System.out.println((MyFunction)(()->{}));		// ���� toString ������ ��
		
	}

}
