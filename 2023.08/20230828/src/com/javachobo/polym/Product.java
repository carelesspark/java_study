package com.javachobo.polym;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){		// �����ڴ� ����� ���x, ����� ��� ����&�޼ҵ常 ����
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
