//package com.java.generics;
//
//public class Box2<T> {
//	static T item;		
//	// static 변수, static한 변수의 경우 메모리를 한번 만 할당받는데, 밑에 처럼 타입 변수가 다른 객체 2개를 생성할 경우 모순이 발생함
//	// 따라서 클래스 변수(static 변수)는 제네릭스 적용이 불가능
//	
//	static int compare(T x, T y) {	// 마찬가지로 클래스 메소드의 매개변수는 제네릭스 적용이 불가능하다.
//		//.......
//	}
//	
//	T[] arr = new T[3];	// 배열 생성 시 제네릭스 적용이 불가능하다.	
//}
//
//
////Box2<Integer> box1 = new Box2<>();
////Box2<Boolean> box2 = new Box2<>();

package com.java.generics;

public class Box2<T> {
	
	// 와일드 카드 
//	<? extends T>	// 제네릭 타입의 상한제한(T타입 위로는 사용할 수 없음, T의 자식만)
//	<? super T> // 제네릭 타입의 하한제한(T타입 아래는 사용할 수 없음, T의 부모만)
//	<?> // 제네릭 타입에 제한이 x (Object와 같음, 모두 적용 가능), 사실 잘 안씀
	
	// 클래스의 제네릭스 타입
	// 메소드의 제네릭스 타입(제네릭한 메소드)
	
	// Box클래스의 경우 클래스와 메소드의 제네릭스 타입이 같았는데, 반대로 클래스의 제네릭스 타입과 메소드의 제네릭스 타입이 각각 분리되어 사용되는 경우도 있음
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


