package com.java.collections;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode		// lombok 코드 한 줄로 중복 배제 가능

public class Person {
	
// 아래는 lombok을 사용하지 않았을 때,	
//	@Override
//	public boolean equals(Object obj) {	// 객체 생성 중복 체크
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
