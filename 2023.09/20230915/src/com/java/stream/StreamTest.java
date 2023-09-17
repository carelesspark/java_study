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
//	데이터 소스의 종류와 상관없이 같은 방식 다룰 수 있게 하고 재사용을 높이기 위한 방법
//	(배열, 컬렉션)
//
//	스트림형식의 값은 한번만 사용가능(일회성)
	
	public static void main(String[] args) {
//		String[] strArr = {"aaa", "ddd", "ccc"};
//		List<String> strList = Arrays.asList(strArr);
//		
//		// List -> Stream
//		Stream<String> strStream1 = strList.stream(); //스트림 생성(값의 형식 변경)
//		Stream<String> strStream2 = Arrays.stream(strArr); //스트림 생성(값의 형식 변경)
//		
//		
//		strStream1.sorted().forEach((i) -> System.out.println(i));	// Consumer 구조의 람다함수식
//		strStream1.sorted().forEach(System.out::println);	// 메소드 참조방식을 이용한 Consumer 구조의 람다함수식
		
//		System.out.println("========");
//		
//		Arrays.sort(strArr);
//		for(String str : strArr) {
//			System.out.println(str);
//		}
		
//		List<String> sorted = strStream2.sorted().collect(Collectors.toList());	// Stream -> List
//		System.out.println(sorted);
		
		// 일회성
		// Stream은 일회성이므로 다시 생성해야한다.
		// stream has already been operatred upon or closed라는 오류가 발생하는 것을 볼 수 있음
		
//		strStream1.sorted().forEach(System.out::println);	
//		long num = strStream1.count();
		
		
		// 스트림의 연산
		// 중간연산(연속해서 여러번 가능, 데이터를 변경하지 않는다)
		// distinct(), filter(), limit(), sorted(), map()
		
		// 최종연산(한번만 가능, 데이터가 변경된다)
		// forEach()
		
		
//		String[] strArr2 = {"dd", "aaa", "CC", "cc", "b"};
//		Stream<String> stream = Stream.of(strArr);	// 스트림 생성
//		Stream<String> filterStream = stream.filter(predicate);
//		Stream<String> distinctStream = stream.distinct();
//		long num = stream.count();
		
//		이렇게 한 줄로 나타낼 수도 있다.
//		long num = Stream<String> stream = Stream.of(strArr).filter().distinct().count();
		
		// 배열의 스트림 생성
//		Stream<T> Stream.of(T...args values);
//		Stream<T> Stream.of(T[]);
//		Stream<T> Array.stream(T[]);
//		
//		IntStream	IntStream.of(int...args values)
//		IntStream	IntStream.of(int[])
//		IntStream	Array.stream(int[])	
		// 이와 같은 형식으로 배열의 스트림을 생성한다.
		
		
		// 특정정수 범위를 스트림으로 생성
//		IntStream intStream = IntStream.range(1, 5);	// 1 ~ 4값 생성
//		intStream.forEach(System.out::println);
//		
//		System.out.println("==============");
//		
//		IntStream intStream2 = IntStream.rangeClosed(1, 5);		// 1 ~ 5 생성
//		intStream2.forEach(System.out::println);
		
		// 임의 수
//		IntStream intStream = new Random().ints();	// 무한 스트림, 끝이 없음
//		intStream.limit(5).forEach(System.out::println);
		
		
//		IntStream intStream2 = new Random().ints(1, 5);		// 1 ~ 5까지의 범위를 지정하고
//		intStream2.limit(2).forEach(System.out::println);	// limit를 2번 주면 2개의 1 ~ 5 사이의 랜덤 값이 출력됌 
		
		
		// 스트림의 중간 연산
//		IntStream intStream = IntStream.rangeClosed(1, 10);
//		intStream.skip(3).limit(4).forEach(System.out::println); // 4, 5, 6, 7출력 123스킵 하고 크기 4로 제한 
		

//		IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);	
//		intStream.distinct().forEach(System.out::println); // 엄청 쉽게 중복 제거 가능
		// 즉, 리스트에 있던 삭제, 중복등의 문제들을 stream을 통해 쉽게 해결할 수 있음
		
//		IntStream intStream = IntStream.rangeClosed(1, 10);
//		intStream.filter(i -> i % 2 == 0).forEach(System.out::println);
//		 // filter 메소드는 predicate와 같은 형식 사용 가능, 조건에 부합할 경우 filter
		
		// 스트림의 정렬
		String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
		Stream<String> stream = Stream.of(strArr);
//		stream.sorted().forEach(System.out::println);	// 오름차순, 최종연산이므로 다른 연산을 하기 위해선 반드시 주석처리!
		
		System.out.println("===========");
		
		stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);	// 내림차순
		// 현재의 정렬을 기준으로 역정렬을 하게 되며, 현재는 기본인 오름차순이 정렬 되어 있으므로 내림차순으로 정렬 됌
		
		
		// Comparator.comparing 이 메소드로도 정렬 구현 가능
		// thenComparing() 
		// 위 메소드들은 StudentStreamTest에서 확인가능
		
		
		// map()
		// 원하는 특정 값만 뽑아 오거나, 특정형태로 변환
		
		Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"), 
				new File("Ex2.java"), new File("Ex1.txt"));
		
		
		// peek()
		// 중간연산이 잘 되고 있는지 확인하기 위한 메소드
		
		fileStream.map(File::getName)
		.filter(i -> i.indexOf('.') != -1)
		.peek(i -> System.out.printf("filename = %s\n", i))	// 파일명이 잘 찍히는지 확인, Consumer 함수형 인터페이스 사용
		.map(i -> i.substring(i.indexOf('.') + 1))
		.peek(i -> System.out.printf("ext = %s\n", i))	// 확장자가 잘 찍히는지 확인, Consumer 함수형 인터페이스 사용
		.map(String::toUpperCase)
		.distinct()
		.forEach(System.out::println);
		// 간단하게 설명하면 fileStream 내에 저장된 파일 이름들이 가지고 있는 확장자를 대문자로 키우고 가져오는 코드, 확장자가 없는 경우, 중복되는 경우 또한 배제함
		// 이 코드 하나하나 구분해서 해석해보기
		
	}

}
