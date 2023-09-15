package com.java.interfaces;

public class Unit {
	// 상속의 상속 구현, 게임 특성 상 유닛의 경우 공통적으로 HP 개념을 가지고 있음. 또한 회복 기능도 있기에 변수의 경우 최대 최력인 MAX_HP와 현재 체력인 HP 변수가 필요하다.
	
	int hitPoint;
	final int MAX_HP;	// 멤버 변수여도 상수의 경우 초기화를 해줘야 한다. 
						//	다만 이렇게 할 경우 모든 유닛의 MAX_HP가 100이 되므로, 예외적으로 상수인 멤버변수는 생성자를 사용한 초기화가 가능하다.
	
	Unit(int hp){
		MAX_HP = hp;	// 보통 생성자에서 값을 초기화 할 때 this를 붙여주는데 그 이유는 이름이 같아서다. 
						//이렇게 받아오는 값과 넣는 값의 이름이 다를 경우, this를 붙이지 않아도 된다.
	}
	
	
	
}
