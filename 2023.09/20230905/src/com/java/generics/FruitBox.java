package com.java.generics;

public class FruitBox<T extends Fruit & Eatable> extends Box<T> { 
	// ���⼭ T�� Fruit�� ��ӹްų� Eatable �������̽��� ��ӹ޴� �ڽĸ� ���׸� Ÿ������ ������ �� �ְԲ� �ϴ� ��
	// Ÿ���� �����ؼ� ���׸� Ÿ���� �����ϴ� ���
	// �̶� Eatable�� �������̽��� ������ implements�� ������ �̷��� ���׸� Ÿ�Կ� ���ؼ��� extends�� �����
}
