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
		Predicate<Integer> p = i -> i % 2 == 0; // ��ȯŸ���� true or false

		// f.apply();
		Function<Integer, Integer> f = i -> i / 10 * 10; // (Function�� ���� ���׸� Ÿ���� �Ű����� Ÿ��, ���� ���׸� Ÿ���� ���� Ÿ��)

		List<Integer> list = new ArrayList<>();

		LambdaTest2.<Integer>makeRandomList(s, list); // �� ��� LambdaTest2.<Integer>�� ������ ����(�Ű������� Ÿ�� ���߰� �����ϱ� ����)
		System.out.println(list);
		LambdaTest2.<Integer>printEvenNum(p, c, list); // ���������� LambdaTest2.<Integer>���� ����(�Ű������� Ÿ�� ���߰� �����ϱ� ����)

		List<Integer> newList = LambdaTest2.<Integer>doSomething(f, list); // ���������� LambdaTest2.<Integer>���� ����(�Ű������� Ÿ�� ���߰� �����ϱ� ����)
																			
		System.out.println(newList);

		// ���ٽĿ����� �޼ҵ� ����
		// ���ٽ��� �ϳ��� �޼ҵ常 ȣ���ϴ� ��� ���
		// ���´� Ŭ���� �̸�::�޼ҵ��̸�

//		Function<String, Integer> f = s -> Integer.parseInt(s); // �Ϲ������� �츮�� ����� ���
//		
//		Function<String, Integer> f2 = Integer::parseInt; // ���ٽĿ����� �޼ҵ� ����

//		BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2); // (BiFunction�� ù, �ι�°�� ���׸� Ÿ���� �Ű����� Ÿ��, ���� ���׸� Ÿ���� ���� Ÿ��)
//																			
//		BiFunction<String, String, Boolean> bf2 = String::equals; // ���ٽĿ����� �޼ҵ� ����
		

		// �� �ܿ��� ������������ ��ü ���� ����
//		class MyClass{
//			
//		}
//		
//		MyClass m = new MyClass(); // �츮�� ���� ����ϴ� ��ü ������
//		
//		Supplier<MyClass> s = () -> MyClass::new // ���������� ��ü ����
		
//		Function<Integer, MyClass> s2 = (i) -> new MyClass(i); // �����ڿ� ���� �־� �� ��
//		
//		Function<Integer, MyClass> s3 = MyClass::new;	// �޼ҵ� ���� ���
//				
//		BiFunction<Integer, Integer, MyClass> s4 = MyClass::new; // �����ڿ� ���� 2�� �־� �� ��, �޼ҵ� ���� ���

		
//		Function<Integer, int[]> f3 = (x) -> new int[x]; // ���������� ����� x���� �ִ� �迭��ü ����
//		
//		Function<Integer, int[]> f4 = int[]::new; // x���� �ִ� �迭 ��ü ���� ���� �޼ҵ� ���� ������� ���� �� �ִ�.
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

	// static ���� <T>�� �ڿ� ���� ���׸� Ÿ���� �����ϴ� Ÿ�� ����? ���׸� �޼ҵ��� ����
	// ���� ���� ������ FuncExTest���� Ȯ�ΰ���
	
	
	

}
