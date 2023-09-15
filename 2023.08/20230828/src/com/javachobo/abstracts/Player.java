package com.javachobo.abstracts;

public abstract class Player {
	// 생성 불가
	// 상속만 가능
	// 추상 메소드가 존재(선언부만 존재-> 이런 메소드가 있다~) abstract 리턴타입 메소드명(); 즉, 구현부가 없음 -> 	추상화
	// 예시 : 동물들은 움직인다. 근데 동물들에 따라 어떻게 움직이는 지 다르다 (사람은 다리 2개, 코끼리는 다리 4개 등등) 그래서 걷는다라는 것만 정의해주고
	// 어떻게 걷는지는 세부 클래스에서 구현한다.
	// 즉, 자식클래스에서 반드시 오버라이딩 해야된다.
	
	int x;
	int y;
	
	// 추상클래스 내의 기본생성자는 생략 가능
	
	abstract void play(int pos); // 추상메소드는 중괄호 x
	abstract void stop();
}
