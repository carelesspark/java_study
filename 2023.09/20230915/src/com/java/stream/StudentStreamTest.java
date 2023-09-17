package com.java.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(new Student("������", 1, 300), new Student("������", 2, 400),
				new Student("������", 5, 200), new Student("������", 5, 250), new Student("������", 1, 370),
				new Student("������", 2, 400));
				// ���� ��ü�� ��Ʈ��ȭ ��(���� ��ü�� �� ������ ����)
		
		// studentStream.sorted().forEach(System.out::println); // ��������
		// studentStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);	// ��������
		
		
		studentStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);
		// �� ���� ��������(�⺻ ������ ������������ ���ǵǱ� ����)
		
//		studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		// thenComparing(Comparator.naturalOrder())�� 2�� ����? -> ã�Ƽ� �����غ���
		
	}

}
