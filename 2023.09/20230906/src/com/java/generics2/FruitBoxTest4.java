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
		System.out.println("----------���� ��----------");
		Collections.sort(appleBox.getList(), new AppleComp());	
		// ���� ������ ���� ������ ���� ������ ��� �� AppleComp��ü�� �Ű������� ���� �ָ鼭 ���� ���� , sort Ŭ���� ���� �ѹ� ������ (�������� ���)
		System.out.println(appleBox);
		
		System.out.println();
		
		System.out.println(grapeBox);
		System.out.println("----------���� ��----------");
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(grapeBox);
		
		System.out.println();

		System.out.println("----------FruitComp�� �̿��� ���� ��----------");
		Collections.sort(appleBox.getList(), new FruitComp());
		System.out.println(appleBox);
		
		System.out.println();

		System.out.println("----------FruitComp�� �̿��� ���� ��----------");
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(grapeBox);
	
	
	
	
	}

}
