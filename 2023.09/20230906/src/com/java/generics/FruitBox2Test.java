package com.java.generics;

public class FruitBox2Test {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
//		FruitBox<Toy> ToyBox = new FruitBox<>(); // 오류
		
		fruitBox.add(new Fruit());	
		fruitBox.add(new Apple());	// 매개변수의 다형성
		fruitBox.add(new Grape());	// 매개변수의 다형성
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 오류
		
		System.out.println(fruitBox.toString());
		System.out.println(appleBox.toString());

	}

}
