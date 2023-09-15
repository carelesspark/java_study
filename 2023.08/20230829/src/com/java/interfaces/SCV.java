package com.java.interfaces;

public class SCV extends GroundUnit implements Repairable{ // �������̽��� �̿��Ͽ� ġ�� ����� ������ �� ����
	SCV(){
		super(50);
		hitPoint = MAX_HP;
	}
	
	
	void repair(Repairable r) {		// instanceof�� �̿��� ������ ���� ������ Ÿ�� üũ! -> Ÿ���� �ٸ��� �ش� Ŭ������ �޼ҵ带 ��� �Ұ��ϱ� ����
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			} 
			
			
			System.out.println("���� ġ�� �Ϸ�");
		}
	}
	
//	void repair(Unit u) {	// ���� ��� �������� ����! �ٸ� �̷����̸� ������ ġ�ᰡ ���q�ϰԉ�, �̷� �� ����ϴ°�(SCV, Tank, DropShip�� ���� ����) �������̽���! 
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
