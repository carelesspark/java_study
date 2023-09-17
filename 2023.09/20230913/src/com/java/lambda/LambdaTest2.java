package com.java.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {
		// 함수형 인터페이스의 형변환
		// Object로 직접 형변환 불가
		
//		(Object)(()->{}) // Object로 직접 형변환 불가
		// 함수형 인터페이스로 형변환 후 Object타입으로 변환
		
		MyFunction f = () -> {};	// MyFunction f = (MyFunction)(()->{});
//		Object obj = (Object)(MyFunction)(() -> {});	// 이렇게 함수형 인터페이스로 형변환 후 Object 타입으로 형변환 함 
		Object obj = (MyFunction)(() -> {});			// 허나 앞의 Object는 생략 가능하기에 이렇게 작성해도 괜찮음
		
		String str = ((Object)(MyFunction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{});
		System.out.println((MyFunction)(()->{}));		// 뒤의 toString 생략된 것
		
	}

}
