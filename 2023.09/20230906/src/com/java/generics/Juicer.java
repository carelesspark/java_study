package com.java.generics;

public class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		// 기존에 클래스 메소드의 매개변수는 제네릭스 적용이 불가능하다고 배웠는데 <T>아닌 위와 같이 제한을 걸어둔 경우는 적용이 가능함
		// 매개변수에 타입 제한을 걸어서 box의 경우 3개 중의 하나의 타입이 들어옴(Fruit, Apple, Grape)
		// 매개변수의 타입에 제한을 걸 때 와일드 카드를 사용함
		
		String tmp = "";
		for(Fruit f : box.getList()) {	// 3개 중 뭐가 넘어올 지 모르기에 부모 타입인 Fruit을 작성
			tmp += f + "";
		}

		return new Juice(tmp);
	}
}
