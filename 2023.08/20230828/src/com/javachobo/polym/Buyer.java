package com.javachobo.polym;

// TV, AUDIO, COMPUTER 사려고 세 클래스에 접근안하고 부모 클래스인 Product를 이용하는 것 - 다형성
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) { // 물건이 늘어나도 메소드를 더 만들 필요가 없음, 확장성이 좋아짐
		if(money < p.price) { // 결국 computer&audio&tv에서 접근하는 prcie나 product에서 접근하는 price나 결국 똑같음, price는 결국 부모 클래스인 product에서 가져 오기 때문이다.
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
	}
	
}

//package com.javachobo.polym;
//
//// TV, AUDIO, COMPUTER 사려고 세 클래스에 접근안하고 부모 클래스인 Product를 이용하는 것 - 다형성
//public class Buyer {
//	int money = 1000;
//	int bonusPoint = 0;
//	
//	void buy(Tv t) { // 오버로딩을 통해 여러 물건들의 buy 메소드를 만들 수 있지만 비효율적이다!
//		if(money < t.price) {
//			System.out.println("잔액부족");
//			return;
//		}
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer c) {
//		if(money < c.price) {
//			System.out.println("잔액부족");
//			return;
//		}
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		if(money < a.price) {
//			System.out.println("잔액부족");
//			return;
//		}
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//}
