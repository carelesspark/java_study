package com.java.etc;

import java.util.Objects;

public class Value {
	
	int value;

	public Value(int value) {	// Source �� Generate Constructor using field ���
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {	// �������̵��� ���� equals�� �������ϰڴ�.
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

	
	
	// ObjectŬ������ ���� equals �޼ҵ�
//	public boolean equals(Object obj) {
//        return (this == obj);
//    }
	
}
