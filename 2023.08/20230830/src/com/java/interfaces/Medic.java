package com.java.interfaces;


public class Medic extends GroundUnit implements Healable{
	Medic(){
		super(35);
		hitPoint = MAX_HP;
	}
	
	void heal(Healable h) {		// �޼ҵ� ���� �ٽ� ���캸��
		if(h instanceof Unit) {
			Unit u = (Unit)h;
			
			while(hitPoint != MAX_HP) {
				u.hitPoint++;
			}
			
			System.out.println("���� �� �Ϸ�");
		}
	}
}
