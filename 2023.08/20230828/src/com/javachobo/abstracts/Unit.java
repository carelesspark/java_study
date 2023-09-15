package com.javachobo.abstracts;

// 일반 클래스 or 추상 클래스 고를 수 있겠지만, 현재 자식 클래스들을 보면
// 오버라이딩을 하게끔 함. 즉, 추상화를 강제함
public abstract class Unit { // 기존 public class Unit에 abstract 추가,
	int x;
	int y;

	abstract void move(); // 오버라이딩 할 메소드의 리턴타입 앞에 abstract 추가 및 중괄호 삭제

	void stop() {

	}
}
