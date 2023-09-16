package com.java.etc;

import java.util.Objects;

public class Value {
	
	int value;

	public Value(int value) {	// Source 탭 Generate Constructor using field 사용
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {	// 오버라이딩을 통해 equals를 재정의하겠다.
		if(obj instanceof Value) {
			Value other = (Value)obj;
			return this.value == other.value;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value); 
	}

	
	
	// Object클래스의 기존 equals 메소드
//	public boolean equals(Object obj) {
//        return (this == obj);
//    }
	
}
