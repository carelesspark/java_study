package com.java.collections;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode		// lombok �ڵ� �� �ٷ� �ߺ� ���� ����

public class Person {
	
// �Ʒ��� lombok�� ������� �ʾ��� ��,	
//	@Override
//	public boolean equals(Object obj) {	// ��ü ���� �ߺ� üũ
//		if(obj instanceof Person) {
//			Person other = (Person)obj;
//			return this.name == other.name && this.age == other.age;
//		}
//		return false;
//	}
//	
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, age); // (value + "").hashCode();
//	}
	
	
	

	String name;
	int age;
	
	
}
