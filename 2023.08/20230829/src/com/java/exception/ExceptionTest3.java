package com.java.exception;

public class ExceptionTest3 {
	public static void main(String[] args) {
		// 예외 떠넘기기(선언하기)
		try {				// 예외처리를 내가 아닌 호출한 쪽에서 예외 처리를 하게끔 만듦
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
	
	static void method1() throws Exception{ 
		method2();
	}
	
	static void method2() throws Exception {	
		method3();
	}	
	
	static void method3() throws Exception {		// 예외 떠넘기기(선언하기)
		throw new Exception("예외 떠넘기기");
	}

}
