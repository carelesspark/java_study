package com.javachobo.modifier;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); 생성이 안됌
		
		Singleton s = Singleton.getInstance(); // 이러한 방법으로 객체 생성
		Singleton s2 = Singleton.getInstance(); 

		s.print();
		s2.print();
		
		System.out.println(s);
		System.out.println(s2); // 달라보여도 주소값이 같음, 싱글톤 패턴은 하나만 만들 수 이씀
	}

}
