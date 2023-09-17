package com.java.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(new Student("박종혁", 1, 300), new Student("박종헉", 2, 400),
				new Student("박종힉", 5, 200), new Student("박조혁", 5, 250), new Student("박중혁", 1, 370),
				new Student("박진혁", 2, 400));
				// 받은 객체를 스트림화 함(받은 객체를 쭉 나열해 놓음)
		
		// studentStream.sorted().forEach(System.out::println); // 내림차순
		// studentStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);	// 오름차순
		
		
		studentStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);
		// 반 별로 오름차순(기본 정렬은 오름차순으로 정의되기 때문)
		
//		studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		// thenComparing(Comparator.naturalOrder())는 2차 정렬? -> 찾아서 정리해보기
		
	}

}
