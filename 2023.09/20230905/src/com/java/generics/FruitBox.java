package com.java.generics;

public class FruitBox<T extends Fruit & Eatable> extends Box<T> { 
	// 여기서 T는 Fruit를 상속받거나 Eatable 인터페이스를 상속받는 자식만 제네릭 타입으로 지정할 수 있게끔 하는 것
	// 타입을 제한해서 제네릭 타입을 지정하는 방식
	// 이때 Eatable은 인터페이스라 보통은 implements를 쓰지만 이렇게 제네릭 타입에 대해서는 extends를 사용함
}
