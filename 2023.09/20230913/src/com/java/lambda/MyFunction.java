package com.java.lambda;

@FunctionalInterface
public interface MyFunction {	// 함수형 인터페이스
	void run();		// 람다를 사용할 때 추상메소드가 하나라도 있어야함?
	//void MyMethod();
	
//	만약 람다식을 여러 번 사용할 경우 함수형 인터페이스 내에는 추상메소드 하나만 작성해야 되므로 하나하나 함수형 인터페이스를 만들기엔  너무 불편하다.
//	이때 자바에서 비슷한 형식을 미리 만들어둠 = java.util.function 패키지 내에 정의해둠
	// Supplier, Consumer, Function, Predicate, BiConsumer, BiFunction 클래스를 참고하면 어떤 느낌인지 알 수 있음
	// 특히 Runnable, Supplier, Consumer, Funtion 클래스는 알아두는 것이 좋음!
}
