package com.javachobo.modifier;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); ������ �ȉ�
		
		Singleton s = Singleton.getInstance(); // �̷��� ������� ��ü ����
		Singleton s2 = Singleton.getInstance(); 

		s.print();
		s2.print();
		
		System.out.println(s);
		System.out.println(s2); // �޶󺸿��� �ּҰ��� ����, �̱��� ������ �ϳ��� ���� �� �̾�
	}

}
