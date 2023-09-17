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
		
		list.forEach(i -> System.out.println(i));  // forEach�� ���콺 Ŀ���� �θ� Consumer�� ���� = ���ٽ��� ����� �� ����!, forEach�� list���� ���� �о���� �޼ҵ�
		// Consumer��� �Լ��� �������̽��� accept �޼ҵ带 ����ؼ� ���ٽ� ������
		
		list.removeIf((x -> x % 2 == 0 || x % 3 == 0)); // ���������� removeIf�� Predicate�� ���� = ���ٽ��� ����� �� ����!
		// Predicate booleanŸ���� test�޼ҵ带 ����ϴµ� �ش� ���� true�� ����, fales�� ���� ���� ������ ��Ÿ���� �� ���� ���
		// list�� �ش� ���� 2 �Ǵ� 3�� ����� ��� �����ϰԲ� �������
		
		// �̶� ���׸�Ÿ���� �����ؾ� �����ϰ� ���ٽ��� ��� �����ϴ�.
		
		System.out.println(list);
	
		list.replaceAll(i -> i * 10); 		// replaceAll�� UnaryOperator�� ������ Ȯ���� �� ���� -> ���ٽ� ��� ����!
		// UnaryOperator�� Ư¡�� ����Ÿ�԰� �Ű������� Ÿ���� ���� �� �����
		
//		@FunctionalInterface
//		public interface UnaryOperator<T> extends Function<T, T> { <- ���� 
		
		System.out.println(list);
	
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		
		map.forEach((k,v) -> System.out.println(k + ", " + v));		// map���� ����ϴ� forEach��  BiConsumer ��� -> ���ٽ� ���
		// BiConsumer���� accept �޼ҵ带 ����ؼ� �Ű������� 2���� �޴� ����
		
		
		
	}

}
