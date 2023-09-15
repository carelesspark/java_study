package com.java.interfaces;

public class RepairableTest {
	public static void main(String[] args) {
		Marine mr = new Marine();
		Tank t = new Tank();
		SCV scv = new SCV();
		DropShip ds = new DropShip();
		Medic m = new Medic();
		
		scv.repair(t);
		scv.repair(scv);
		scv.repair(ds);

		//scv.repair(mr);		// repair로 받을 수 있는 타입이 아니기에 오류가 발생(인터페이스로 Tank, SCV, DropShip을 묶었고 repair 메소드의 매개변수를 부모인터페이스?로 정의했기에)
		
		m.heal(mr);				// 반대로 메딕을 추가해 마린에게만 힐을 주기 위해 마린에만 관련 인터페이스를 상속시키고 heal 메소드의 매개변수를 부모인터페이스로 정의
	}

}
