package com.java.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		
		// ���� ������ �߻� ��Ű��
		try {
			Exception e = new Exception("���Ƿ� ���ܹ߻�");
			throw e;		// Exception ���� ���� �߻�
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
