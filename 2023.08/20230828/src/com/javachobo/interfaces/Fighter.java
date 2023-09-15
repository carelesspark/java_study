package com.javachobo.interfaces;

public class Fighter implements Fightable{ // 클래스 - 인터페이스 간 상속은 implements 인터페이스명을 붙인다.

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	} 
		
}

// 인터페이스 간 상속과 클래스-인터페이스간 상속의 특징에 대해 알아봄
// Fightable 인터페이스의 경우 Attackable과 Moveable인터페이스를 상속받으므로
// Fighter 클래스가 Fightable 인터페이스를 상속받을 때 자동적으로 인터페이스의 추상 메소드들을 오버라이딩 할 수 있게 된다.
