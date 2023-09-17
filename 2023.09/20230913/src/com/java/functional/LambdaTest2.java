package com.java.functional;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest2 {

	public static void main(String[] args) {

		// s.get();
		Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;

		// c.accept();
		Consumer<Integer> c = i -> System.out.print(" " + i + " ");

		// p.test();
		Predicate<Integer> p = i -> i % 2 == 0; // 반환타입이 true or false

		// f.apply();
		Function<Integer, Integer> f = i -> i / 10 * 10; // (Function은 앞의 제네릭 타입은 매개변수 타입, 뒤의 제네릭 타입은 리턴 타입)

		List<Integer> list = new ArrayList<>();

		LambdaTest2.<Integer>makeRandomList(s, list); // 이 경우 LambdaTest2.<Integer>는 생략도 가능(매개변수의 타입 유추가 가능하기 때문)
		System.out.println(list);
		LambdaTest2.<Integer>printEvenNum(p, c, list); // 마찬가지로 LambdaTest2.<Integer>생략 가능(매개변수의 타입 유추가 가능하기 때문)

		List<Integer> newList = LambdaTest2.<Integer>doSomething(f, list); // 마찬가지로 LambdaTest2.<Integer>생략 가능(매개변수의 타입 유추가 가능하기 때문)
																			
		System.out.println(newList);

		// 람다식에서의 메소드 참조
		// 람다식이 하나의 메소드만 호출하는 경우 사용
		// 형태는 클래스 이름::메소드이름

//		Function<String, Integer> f = s -> Integer.parseInt(s); // 일반적으로 우리가 사용한 방식
//		
//		Function<String, Integer> f2 = Integer::parseInt; // 람다식에서의 메소드 참조

//		BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2); // (BiFunction은 첫, 두번째의 제네릭 타입은 매개변수 타입, 뒤의 제네릭 타입은 리턴 타입)
//																			
//		BiFunction<String, String, Boolean> bf2 = String::equals; // 람다식에서의 메소드 참조
		

		// 그 외에도 람다형식으로 객체 생성 가능
//		class MyClass{
//			
//		}
//		
//		MyClass m = new MyClass(); // 우리가 본래 사용하던 객체 생성식
//		
//		Supplier<MyClass> s = () -> MyClass::new // 람다형식의 객체 생성
		
//		Function<Integer, MyClass> s2 = (i) -> new MyClass(i); // 생성자에 값을 넣어 줄 때
//		
//		Function<Integer, MyClass> s3 = MyClass::new;	// 메소드 참조 방식
//				
//		BiFunction<Integer, Integer, MyClass> s4 = MyClass::new; // 생성자에 값을 2개 넣어 줄 때, 메소드 참조 방식

		
//		Function<Integer, int[]> f3 = (x) -> new int[x]; // 람다형식을 사용한 x값을 넣는 배열객체 생성
//		
//		Function<Integer, int[]> f4 = int[]::new; // x값을 넣는 배열 객체 생성 역시 메소드 참조 방식으로 만들어볼 수 있다.
	}

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {

		List<T> newList = new ArrayList<T>(list.size());

		for (T i : list) {	
			newList.add(f.apply(i));
		}

		return newList;
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for (int i = 0; i < 10; i++) {
			list.add(s.get());
		}
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("{");

		for (T i : list) {
			if (p.test(i)) {
				c.accept(i);
			}
		}

		System.out.println("}");
	}

	// static 뒤의 <T>는 뒤에 사용될 제네릭 타입을 결정하는 타입 변수? 제네릭 메소드의 형식
	// 위에 대한 설명은 FuncExTest에서 확인가능
	
	
	

}
