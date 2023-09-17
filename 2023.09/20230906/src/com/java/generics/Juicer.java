package com.java.generics;

public class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		// ������ Ŭ���� �޼ҵ��� �Ű������� ���׸��� ������ �Ұ����ϴٰ� ����µ� <T>�ƴ� ���� ���� ������ �ɾ�� ���� ������ ������
		// �Ű������� Ÿ�� ������ �ɾ box�� ��� 3�� ���� �ϳ��� Ÿ���� ����(Fruit, Apple, Grape)
		// �Ű������� Ÿ�Կ� ������ �� �� ���ϵ� ī�带 �����
		
		String tmp = "";
		for(Fruit f : box.getList()) {	// 3�� �� ���� �Ѿ�� �� �𸣱⿡ �θ� Ÿ���� Fruit�� �ۼ�
			tmp += f + "";
		}

		return new Juice(tmp);
	}
}
