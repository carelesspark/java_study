import java.util.Comparator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

// lombok 추가
@Getter
@Setter

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	// 생성자 함수 추가
	public Student(String name, String department, String id, double grade) {
		super();
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}



	// getter/setter 추가
}