package com.javachobo.polym;

public class CarTest {

	public static void main(String[] args) {
		
//		Car car = null;
//		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe;	// 객체에서의 자동 형변환, 다형성은  타입이 달라도 상속 관계일 경우 사용할 수 있다.
//		// 다형성 -> 멤버의 사용 갯수가 바뀐다.
//		car.water(); 5개 -> 4개, 사용불가
//		fe2 = (FireEngine)car; // 객체에서의 강제 형변환
//		
//		fe2.water();
	
		// 다형성은 메소드의 매개변수에도 많이 사용됌
	
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		// 캐스팅의 경우 부모-자식 관계만 가능, 형제는 불가능(FireEngine<->Ambulance 캐스팅 불가능)
		
		
		dowork(fe);
		dowork(ab); // 둘다 c의 자식이기에 매개변수로 집어넣는데 문제 없음
	
	
	}
	
	static void dowork(Car c) { // 매개변수가 부모클래스로 정의 ( 매개변수의 다형성 )
		
		if(c instanceof FireEngine) {	// if문을 통해 아래 문단 오류 해결	
			FireEngine fe = (FireEngine)c;
			fe.water();
		} 
		
		if(c instanceof Ambulance) {	// instanceof는 참조변수의 타입을 체크하기 위해 사용		
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
////		car = fe;	// 객체에서의 자동 형변환, 다형성은  타입이 달라도 상속 관계일 경우 사용할 수 있다.
////		// 다형성 -> 멤버의 사용 갯수가 바뀐다.
////		car.water(); 5개 -> 4개, 사용불가
////		fe2 = (FireEngine)car; // 객체에서의 강제 형변환
////		
////		fe2.water();
//	
//		// 다형성은 메소드의 매개변수에도 많이 사용됌
//	
//		
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
//		// 캐스팅의 경우 부모-자식 관계만 가능, 형제는 불가능(FireEngine<->Ambulance 캐스팅 불가능)
//		
//		
////		dowork(fe);
//		dowork(ab); // 둘다 c의 자식이기에 매개변수로 집어넣는데 문제 없음
//	
//	
//	}
//	
//	static void dowork(Car c) { // 매개변수가 부모클래스로 정의 ( 매개변수의 다형성 )
////		FireEngine fe = (FireEngine)c;
////		fe.water();
//		
//		Ambulance ab = (Ambulance)c;
//		ab.siren();
//	}
//
//}
