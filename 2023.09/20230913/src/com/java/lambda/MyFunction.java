package com.java.lambda;

@FunctionalInterface
public interface MyFunction {	// �Լ��� �������̽�
	void run();		// ���ٸ� ����� �� �߻�޼ҵ尡 �ϳ��� �־����?
	//void MyMethod();
	
//	���� ���ٽ��� ���� �� ����� ��� �Լ��� �������̽� ������ �߻�޼ҵ� �ϳ��� �ۼ��ؾ� �ǹǷ� �ϳ��ϳ� �Լ��� �������̽��� ����⿣  �ʹ� �����ϴ�.
//	�̶� �ڹٿ��� ����� ������ �̸� ������ = java.util.function ��Ű�� ���� �����ص�
	// Supplier, Consumer, Function, Predicate, BiConsumer, BiFunction Ŭ������ �����ϸ� � �������� �� �� ����
	// Ư�� Runnable, Supplier, Consumer, Funtion Ŭ������ �˾Ƶδ� ���� ����!
}
