package com.java.exception;

public class ExceptionTest {
	public static void main(String[] args) {

		// ����ó��
		// �ذᰡ���� �ڵ带 ó���ϴ� ��

//		try {
////			������ ������ �ִ� ���๮	
//		} catch(Ŭ������ ������){
//			// ����ó���� ���� ���๮
//		} finally { // �ʼ��� �ƴ����� �ʿ��� �� �� �� �ִ� ����, ���� �߻� ������ ������� �����
//			
//		}

//		int number = 100;
//		int result = 0;
//
//		for (int i = 0; i < 10; i++) {
//			try { 
//				result = number / (int) (Math.random() * 9); // ���� ���� 0�� ������ �Ǹ� ������ �߻��ϰ� ���������.(java.lang.ArithmeticException: / by zero)
//				System.out.println(result);				
//			} // catch(ArithmeticException e) { // try �� ���� ���๮�� �ְ� �Ʊ� �߻��� ������ Ŭ�������� catch ���� �ȿ� �־��ش�. ���п� �������� ����
////				 System.out.println("0���� �����⸦ �����߽��ϴ�.");
//			 	catch(Exception e) { // Exception�� ��� ���� ó�� Ŭ����. ���п� �������� ����
//			 		System.out.println("0���� �����⸦ �����߽��ϴ�.");
//			 } 
//		}
		
		
		int number = 100;
		int result = 0;
		int[] arr = {1,2,3};

		for (int i = 0; i < 10; i++) {
			try { 
				
				result = number / (int) (Math.random() * 9); // ���� ���� 0�� ������ �Ǹ� ������ �߻��ϰ� ���������.(java.lang.ArithmeticException: / by zero)
				System.out.println(result);		
				
				arr[5] = 0;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());			// e.getMessage()�� �ش� ������ ������ ���� �������ִ� ����
				System.out.println("index number error");
				e.printStackTrace(); 						// e.printStackTrace()�� �ش� ������ ���� ������ �����ϴ� ����
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());  		// e.getMessage()�� �ش� ������ ������ ���� �������ִ� ����
				System.out.println("0���� ������ �߽��ϴ�.");		// �迭�� ������ �ְ� �������� ������ ���� �� �̷��� 2�� catch������ ��Ÿ�� ���� �ִ�.
				e.printStackTrace(); 						// e.printStackTrace()�� �ش� ������ ���� ������ �����ϴ� ����
			} catch(Exception e) {
				System.out.println("��� ���� ó�� ����");			// �̷��� ����ó�� �׸��� ���� ��� �ش� Ŭ�����̸��� catch������ �ذ��ϰ�
			}												// �� ���� ������ Exception���� ó���Ѵ�. ������ Exception�� ��� �� �ڿ� �־�ߵȴ�.
		}		
		
		
	}

}
