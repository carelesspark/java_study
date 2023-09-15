package com.javachobo.polym;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){		// 생성자는 상속의 대상x, 상속은 멤버 변수&메소드만 가능
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
