package com.java.generics;

public class FruitBox2Test {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
//		FruitBox<Toy> ToyBox = new FruitBox<>(); // ����
		
		fruitBox.add(new Fruit());	
		fruitBox.add(new Apple());	// �Ű������� ������
		fruitBox.add(new Grape());	// �Ű������� ������
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // ����
		
		System.out.println(fruitBox.toString());
		System.out.println(appleBox.toString());

	}

}
