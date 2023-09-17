package com.java.generics;

public class FruitBoxTest {

	public static void main(String[] args) {
		// ���׸� Ŭ������ ���� �ش� �����͸� �޾Ƽ� ó���� �� �ִ��� Ȯ���ϴ� �ڵ�
		// ��Ӱ��迡 ���� �������� ������ �� �� ����
		
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Apple());	// ��� ����, ������ ����o
		fruitBox.add(new Grape());	// ��� ����, ������ ����o
		
		toyBox.add(new Toy());
		
//		fruitBox.add(new Toy()); // ������ ����x 
//		
//		toyBox.add(new Apple()); // ������ ����x
		
		System.out.println(fruitBox);
		System.out.println(toyBox);
	}

}
