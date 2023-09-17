package com.java.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class LambdaTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		
//		for(Object obj : list) {
//			System.out.println((Integer)obj);
//		}
		
		list.forEach(i -> System.out.println(i));  // forEach에 마우스 커서를 두면 Consumer가 있음 = 람다식을 사용할 수 있음!, forEach는 list에서 값을 읽어오는 메소드
		// Consumer라는 함수형 인터페이스의 accept 메소드를 사용해서 람다식 정의함
		
		list.removeIf((x -> x % 2 == 0 || x % 3 == 0)); // 마찬가지로 removeIf는 Predicate가 있음 = 람다식을 사용할 수 있음!
		// Predicate boolean타입의 test메소드를 사용하는데 해당 식이 true면 삭제, fales면 삭제 하지 않음을 나타내고 위 식의 경우
		// list의 해당 값이 2 또는 3의 배수일 경우 삭제하게끔 만들었음
		
		// 이때 제네릭타입을 적용해야 원만하게 람다식을 사용 가능하다.
		
		System.out.println(list);
	
		list.replaceAll(i -> i * 10); 		// replaceAll도 UnaryOperator가 있음을 확인할 수 있음 -> 람다식 사용 가능!
		// UnaryOperator의 특징은 리턴타입과 매개변수의 타입이 같을 때 사용함
		
//		@FunctionalInterface
//		public interface UnaryOperator<T> extends Function<T, T> { <- 참고 
		
		System.out.println(list);
	
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		
		map.forEach((k,v) -> System.out.println(k + ", " + v));		// map에서 사용하는 forEach는  BiConsumer 사용 -> 람다식 사용
		// BiConsumer내의 accept 메소드를 사용해서 매개변수를 2개를 받는 형식
		
		
		
	}

}
