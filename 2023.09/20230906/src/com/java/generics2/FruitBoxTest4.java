package com.java.generics2;

import java.util.Collections;

public class FruitBoxTest4 {

	public static void main(String[] args) {

		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		appleBox.add(new Apple("GreenApple", 300));
		appleBox.add(new Apple("GreenApple", 100));
		appleBox.add(new Apple("GreenApple", 200));
		
		grapeBox.add(new Grape("GreenGrape", 200));
		grapeBox.add(new Grape("GreenGrape", 300));
		grapeBox.add(new Grape("GreenGrape", 400));
		
		System.out.println(appleBox);
		System.out.println("----------정렬 후----------");
		Collections.sort(appleBox.getList(), new AppleComp());	
		// 정렬 기준이 없기 때문에 정렬 기준을 잡아 준 AppleComp객체를 매개변수로 같이 주면서 정렬 가능 , sort 클래스 정의 한번 봐보기 (하한제한 등등)
		System.out.println(appleBox);
		
		System.out.println();
		
		System.out.println(grapeBox);
		System.out.println("----------정렬 후----------");
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(grapeBox);
		
		System.out.println();

		System.out.println("----------FruitComp를 이용한 정렬 후----------");
		Collections.sort(appleBox.getList(), new FruitComp());
		System.out.println(appleBox);
		
		System.out.println();

		System.out.println("----------FruitComp를 이용한 정렬 후----------");
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(grapeBox);
	
	
	
	
	}

}
