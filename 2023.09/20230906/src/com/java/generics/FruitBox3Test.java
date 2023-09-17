package com.java.generics;

public class FruitBox3Test {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		Juice fruitJuice = Juicer.makeJuice(fruitBox);
	
		System.out.println(fruitJuice);
		
		Juice appleJuice = Juicer.makeJuice(appleBox);
		
		System.out.println(appleJuice);

	}
}
