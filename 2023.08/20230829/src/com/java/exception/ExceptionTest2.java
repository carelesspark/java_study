package com.java.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		
		// 예외 강제로 발생 시키기
		try {
			Exception e = new Exception("고의로 예외발생");
			throw e;		// Exception 예외 강제 발생
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
