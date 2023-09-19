package com.java.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// Optional
		// 객체를 감싸는 래퍼클래스
		// 객체의 값이 null 유무를 판단하는 용도로 사용

		
//		String str = null;
//		if(str != null) {
//			
//		}	// 기존의 경우 이러한 형식으로 객체의 null값의 유무를 판단했다.
		
//		String str = "abc";
//		
//		Optional<String> optVal = Optional.of(str);
//		System.out.println(optVal.get());	// Optional을 이용한 객체 값 출력
		
//		String str = null;
//		Optional<String> optVal = Optional.of(str);	// 객체 값이 null일 경우 오류가 발생
		
		
//		String str = "abc";
//		Optional<String> optVal = Optional.of(str);
//		
//		String rstr1 = optVal.get();
//		String rstr2 = optVal.orElse("");	//	optVal이 null 이면 ""(빈 문자열)을 반환
//		System.out.println(rstr1);
//		System.out.println(rstr2);
		
		// new String();
		// String str3 = new String();
//		String str3 = optVal.orElseGet(String::new);	// 매개변수 내에는 Supplier형식을 띄므로, 매개변수 없이 값을 리턴하는 람다 표현식 구현
//		String str4 = optVal.orElseThrow(NullPointerException::new);	// 객체가 null일 때 예외 처리
		
		String str = "123";
		
		int result = Optional.of(str)
		.filter(x -> x.length() > 0)
		.map(Integer::parseInt)	// 메소드 참조 방식 가능 (전에 식 : x -> Integer.parseInt(x))
		.orElse(-1);	// 숫자가 아닌 빈값의 경우 -1을 반환, orElse문 한번 더 찾아보기
		System.out.println(result);
//		
//		String str = null;
//		String result2 = Optional.ofNullable(str).orElse("null 값이다."); // str변수에 null값을 저장하고 ofNullable로 체크하는데 null일 경우 orElse에
//																		  // 정의한 값 result2에 저장
//		System.out.println(result2);

	}

}
