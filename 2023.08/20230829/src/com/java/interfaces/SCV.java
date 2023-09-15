package com.java.interfaces;

public class SCV extends GroundUnit implements Repairable{ // 인터페이스를 이용하여 치료 대상을 구분할 수 있음
	SCV(){
		super(50);
		hitPoint = MAX_HP;
	}
	
	
	void repair(Repairable r) {		// instanceof를 이용해 들어오는 참조 변수의 타입 체크! -> 타입이 다르면 해당 클래스의 메소드를 사용 불가하기 때문
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			} 
			
			
			System.out.println("유닛 치료 완료");
		}
	}
	
//	void repair(Unit u) {	// 어제 배운 다형성의 예시! 다만 이런식이면 마린도 치료가 가늫하게됌, 이럴 때 사용하는게(SCV, Tank, DropShip을 묶는 역할) 인터페이스다! 
//		
//	}
//	void repair(Tank t) {
//		
//	}
//	
//	void repair(DropShip ds) {
//		
//	}
//
//
//	void repair(SCV s) {
//		
//	}
}
