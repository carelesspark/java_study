package com.java.interfaces;

										// 어제 배운 내용
public class AirUnit extends Unit {		// 부모 클래스에서 기본 생성자 함수 아닌 생성자 함수를 사용했기에 빨간 줄이 발생,
										// 생성자함수를 만들고 부모클래스를 호출하는 super함수 사용
	AirUnit(int hp){
		super(hp);
	}
}
