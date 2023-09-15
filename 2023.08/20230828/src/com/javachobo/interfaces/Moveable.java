package com.javachobo.interfaces;

public interface Moveable {
	// 생성 불가
	// 일반적인 멤버는 정의 불가
	// 인터페이스간 상속이 가능, 인터페이스는 다중 상속 가능
	// 클래스에 상속(구현)해야 한다 -> 클래스에 상속할 때 오버라이딩 필수 -> 인터페이스간 상속에는 오버라이딩을 굳이 안해도 된다.
	// [public static final] 상수명; []는 생략의 의미
	// [public abstract] 리턴값 메소드명; []는 생략의 의미
	
	void move();	// public abstract가 생략되어 있음
	
}
