package com.javachobo.polym;

public class CarTest {

	public static void main(String[] args) {
		
//		Car car = null;
//		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe;	// ��ü������ �ڵ� ����ȯ, ��������  Ÿ���� �޶� ��� ������ ��� ����� �� �ִ�.
//		// ������ -> ����� ��� ������ �ٲ��.
//		car.water(); 5�� -> 4��, ���Ұ�
//		fe2 = (FireEngine)car; // ��ü������ ���� ����ȯ
//		
//		fe2.water();
	
		// �������� �޼ҵ��� �Ű��������� ���� ����
	
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		// ĳ������ ��� �θ�-�ڽ� ���踸 ����, ������ �Ұ���(FireEngine<->Ambulance ĳ���� �Ұ���)
		
		
		dowork(fe);
		dowork(ab); // �Ѵ� c�� �ڽ��̱⿡ �Ű������� ����ִµ� ���� ����
	
	
	}
	
	static void dowork(Car c) { // �Ű������� �θ�Ŭ������ ���� ( �Ű������� ������ )
		
		if(c instanceof FireEngine) {	// if���� ���� �Ʒ� ���� ���� �ذ�	
			FireEngine fe = (FireEngine)c;
			fe.water();
		} 
		
		if(c instanceof Ambulance) {	// instanceof�� ���������� Ÿ���� üũ�ϱ� ���� ���		
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
	}

}


//package com.javachobo.polym;
//
//public class CarTest {
//
//	public static void main(String[] args) {
//		
////		Car car = null;
////		
////		FireEngine fe = new FireEngine();
////		FireEngine fe2 = null;
////		
////		fe.water();
////		car = fe;	// ��ü������ �ڵ� ����ȯ, ��������  Ÿ���� �޶� ��� ������ ��� ����� �� �ִ�.
////		// ������ -> ����� ��� ������ �ٲ��.
////		car.water(); 5�� -> 4��, ���Ұ�
////		fe2 = (FireEngine)car; // ��ü������ ���� ����ȯ
////		
////		fe2.water();
//	
//		// �������� �޼ҵ��� �Ű��������� ���� ����
//	
//		
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
//		// ĳ������ ��� �θ�-�ڽ� ���踸 ����, ������ �Ұ���(FireEngine<->Ambulance ĳ���� �Ұ���)
//		
//		
////		dowork(fe);
//		dowork(ab); // �Ѵ� c�� �ڽ��̱⿡ �Ű������� ����ִµ� ���� ����
//	
//	
//	}
//	
//	static void dowork(Car c) { // �Ű������� �θ�Ŭ������ ���� ( �Ű������� ������ )
////		FireEngine fe = (FireEngine)c;
////		fe.water();
//		
//		Ambulance ab = (Ambulance)c;
//		ab.siren();
//	}
//
//}
