package com.java.exception;

public class ExceptionTest3 {
	public static void main(String[] args) {
		// ���� ���ѱ��(�����ϱ�)
		try {				// ����ó���� ���� �ƴ� ȣ���� �ʿ��� ���� ó���� �ϰԲ� ����
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
	
	static void method3() throws Exception {		// ���� ���ѱ��(�����ϱ�)
		throw new Exception("���� ���ѱ��");
	}

}
