package com.java.generics;

public class FruitBoxTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 만들어서 해당 데이터를 받아서 처리할 수 있는지 확인하는 코드
		// 상속관계에 따른 다형성을 구현해 볼 수 있음
		
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Apple());	// 상속 관계, 다형성 적용o
		fruitBox.add(new Grape());	// 상속 관계, 다형성 적용o
		
		toyBox.add(new Toy());
		
//		fruitBox.add(new Toy()); // 다형성 적용x 
//		
//		toyBox.add(new Apple()); // 다형성 적용x
		
		System.out.println(fruitBox);
		System.out.println(toyBox);
	}

}
