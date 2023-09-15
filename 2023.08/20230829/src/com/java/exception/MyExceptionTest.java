package com.java.exception;

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
