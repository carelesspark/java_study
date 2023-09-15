package com.javachobo.modifier;

public class Singleton {
	// �̱��� ����
	// �����ڰ� private�� Ŭ����
	// �ܺο��� ������ �ȵǰԲ� ����
	
	// �̱��� ���� �⺻ �ڵ�, �׳� �ܿ��
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return s;
	}
	
	public static void print() {
		System.out.println("Singleton Print");
	}
	
	
}
