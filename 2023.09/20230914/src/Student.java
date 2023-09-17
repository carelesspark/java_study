import java.util.Comparator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

// lombok �߰�
@Getter
@Setter

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	// ������ �Լ� �߰�
	public Student(String name, String department, String id, double grade) {
		super();
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}



	// getter/setter �߰�
}