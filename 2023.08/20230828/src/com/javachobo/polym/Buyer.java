package com.javachobo.polym;

// TV, AUDIO, COMPUTER ����� �� Ŭ������ ���پ��ϰ� �θ� Ŭ������ Product�� �̿��ϴ� �� - ������
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) { // ������ �þ�� �޼ҵ带 �� ���� �ʿ䰡 ����, Ȯ�强�� ������
		if(money < p.price) { // �ᱹ computer&audio&tv���� �����ϴ� prcie�� product���� �����ϴ� price�� �ᱹ �Ȱ���, price�� �ᱹ �θ� Ŭ������ product���� ���� ���� �����̴�.
			System.out.println("�ܾ� ����");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
	}
	
}

//package com.javachobo.polym;
//
//// TV, AUDIO, COMPUTER ����� �� Ŭ������ ���پ��ϰ� �θ� Ŭ������ Product�� �̿��ϴ� �� - ������
//public class Buyer {
//	int money = 1000;
//	int bonusPoint = 0;
//	
//	void buy(Tv t) { // �����ε��� ���� ���� ���ǵ��� buy �޼ҵ带 ���� �� ������ ��ȿ�����̴�!
//		if(money < t.price) {
//			System.out.println("�ܾ׺���");
//			return;
//		}
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer c) {
//		if(money < c.price) {
//			System.out.println("�ܾ׺���");
//			return;
//		}
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		if(money < a.price) {
//			System.out.println("�ܾ׺���");
//			return;
//		}
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//}
