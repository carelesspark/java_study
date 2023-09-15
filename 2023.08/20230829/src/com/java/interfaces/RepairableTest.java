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

		//scv.repair(mr);		// repair�� ���� �� �ִ� Ÿ���� �ƴϱ⿡ ������ �߻�(�������̽��� Tank, SCV, DropShip�� ������ repair �޼ҵ��� �Ű������� �θ��������̽�?�� �����߱⿡)
		
		m.heal(mr);				// �ݴ�� �޵��� �߰��� �������Ը� ���� �ֱ� ���� �������� ���� �������̽��� ��ӽ�Ű�� heal �޼ҵ��� �Ű������� �θ��������̽��� ����
	}

}
