package com.java.interfaces;


public class Medic extends GroundUnit implements Healable{
	Medic(){
		super(35);
		hitPoint = MAX_HP;
	}
	
	void heal(Healable h) {		// 메소드 구성 다시 살펴보기
		if(h instanceof Unit) {
			Unit u = (Unit)h;
			
			while(hitPoint != MAX_HP) {
				u.hitPoint++;
			}
			
			System.out.println("유닛 힐 완료");
		}
	}
}
