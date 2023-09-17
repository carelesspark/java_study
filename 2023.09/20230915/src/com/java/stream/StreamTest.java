package com.java.stream;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

//	Stream
//
//	������ �ҽ��� ������ ������� ���� ��� �ٷ� �� �ְ� �ϰ� ������ ���̱� ���� ���
//	(�迭, �÷���)
//
//	��Ʈ�������� ���� �ѹ��� ��밡��(��ȸ��)
	
	public static void main(String[] args) {
//		String[] strArr = {"aaa", "ddd", "ccc"};
//		List<String> strList = Arrays.asList(strArr);
//		
//		// List -> Stream
//		Stream<String> strStream1 = strList.stream(); //��Ʈ�� ����(���� ���� ����)
//		Stream<String> strStream2 = Arrays.stream(strArr); //��Ʈ�� ����(���� ���� ����)
//		
//		
//		strStream1.sorted().forEach((i) -> System.out.println(i));	// Consumer ������ �����Լ���
//		strStream1.sorted().forEach(System.out::println);	// �޼ҵ� ��������� �̿��� Consumer ������ �����Լ���
		
//		System.out.println("========");
//		
//		Arrays.sort(strArr);
//		for(String str : strArr) {
//			System.out.println(str);
//		}
		
//		List<String> sorted = strStream2.sorted().collect(Collectors.toList());	// Stream -> List
//		System.out.println(sorted);
		
		// ��ȸ��
		// Stream�� ��ȸ���̹Ƿ� �ٽ� �����ؾ��Ѵ�.
		// stream has already been operatred upon or closed��� ������ �߻��ϴ� ���� �� �� ����
		
//		strStream1.sorted().forEach(System.out::println);	
//		long num = strStream1.count();
		
		
		// ��Ʈ���� ����
		// �߰�����(�����ؼ� ������ ����, �����͸� �������� �ʴ´�)
		// distinct(), filter(), limit(), sorted(), map()
		
		// ��������(�ѹ��� ����, �����Ͱ� ����ȴ�)
		// forEach()
		
		
//		String[] strArr2 = {"dd", "aaa", "CC", "cc", "b"};
//		Stream<String> stream = Stream.of(strArr);	// ��Ʈ�� ����
//		Stream<String> filterStream = stream.filter(predicate);
//		Stream<String> distinctStream = stream.distinct();
//		long num = stream.count();
		
//		�̷��� �� �ٷ� ��Ÿ�� ���� �ִ�.
//		long num = Stream<String> stream = Stream.of(strArr).filter().distinct().count();
		
		// �迭�� ��Ʈ�� ����
//		Stream<T> Stream.of(T...args values);
//		Stream<T> Stream.of(T[]);
//		Stream<T> Array.stream(T[]);
//		
//		IntStream	IntStream.of(int...args values)
//		IntStream	IntStream.of(int[])
//		IntStream	Array.stream(int[])	
		// �̿� ���� �������� �迭�� ��Ʈ���� �����Ѵ�.
		
		
		// Ư������ ������ ��Ʈ������ ����
//		IntStream intStream = IntStream.range(1, 5);	// 1 ~ 4�� ����
//		intStream.forEach(System.out::println);
//		
//		System.out.println("==============");
//		
//		IntStream intStream2 = IntStream.rangeClosed(1, 5);		// 1 ~ 5 ����
//		intStream2.forEach(System.out::println);
		
		// ���� ��
//		IntStream intStream = new Random().ints();	// ���� ��Ʈ��, ���� ����
//		intStream.limit(5).forEach(System.out::println);
		
		
//		IntStream intStream2 = new Random().ints(1, 5);		// 1 ~ 5������ ������ �����ϰ�
//		intStream2.limit(2).forEach(System.out::println);	// limit�� 2�� �ָ� 2���� 1 ~ 5 ������ ���� ���� ��� 
		
		
		// ��Ʈ���� �߰� ����
//		IntStream intStream = IntStream.rangeClosed(1, 10);
//		intStream.skip(3).limit(4).forEach(System.out::println); // 4, 5, 6, 7��� 123��ŵ �ϰ� ũ�� 4�� ���� 
		

//		IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);	
//		intStream.distinct().forEach(System.out::println); // ��û ���� �ߺ� ���� ����
		// ��, ����Ʈ�� �ִ� ����, �ߺ����� �������� stream�� ���� ���� �ذ��� �� ����
		
//		IntStream intStream = IntStream.rangeClosed(1, 10);
//		intStream.filter(i -> i % 2 == 0).forEach(System.out::println);
//		 // filter �޼ҵ�� predicate�� ���� ���� ��� ����, ���ǿ� ������ ��� filter
		
		// ��Ʈ���� ����
		String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
		Stream<String> stream = Stream.of(strArr);
//		stream.sorted().forEach(System.out::println);	// ��������, ���������̹Ƿ� �ٸ� ������ �ϱ� ���ؼ� �ݵ�� �ּ�ó��!
		
		System.out.println("===========");
		
		stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);	// ��������
		// ������ ������ �������� �������� �ϰ� �Ǹ�, ����� �⺻�� ���������� ���� �Ǿ� �����Ƿ� ������������ ���� ��
		
		
		// Comparator.comparing �� �޼ҵ�ε� ���� ���� ����
		// thenComparing() 
		// �� �޼ҵ���� StudentStreamTest���� Ȯ�ΰ���
		
		
		// map()
		// ���ϴ� Ư�� ���� �̾� ���ų�, Ư�����·� ��ȯ
		
		Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"), 
				new File("Ex2.java"), new File("Ex1.txt"));
		
		
		// peek()
		// �߰������� �� �ǰ� �ִ��� Ȯ���ϱ� ���� �޼ҵ�
		
		fileStream.map(File::getName)
		.filter(i -> i.indexOf('.') != -1)
		.peek(i -> System.out.printf("filename = %s\n", i))	// ���ϸ��� �� �������� Ȯ��, Consumer �Լ��� �������̽� ���
		.map(i -> i.substring(i.indexOf('.') + 1))
		.peek(i -> System.out.printf("ext = %s\n", i))	// Ȯ���ڰ� �� �������� Ȯ��, Consumer �Լ��� �������̽� ���
		.map(String::toUpperCase)
		.distinct()
		.forEach(System.out::println);
		// �����ϰ� �����ϸ� fileStream ���� ����� ���� �̸����� ������ �ִ� Ȯ���ڸ� �빮�ڷ� Ű��� �������� �ڵ�, Ȯ���ڰ� ���� ���, �ߺ��Ǵ� ��� ���� ������
		// �� �ڵ� �ϳ��ϳ� �����ؼ� �ؼ��غ���
		
	}

}
