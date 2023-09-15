package com.java.exception;

public class ExceptionTest {
	public static void main(String[] args) {

		// 예외처리
		// 해결가능한 코드를 처리하는 것

//		try {
////			문제의 소지가 있는 실행문	
//		} catch(클래스명 변수명){
//			// 예외처리를 위한 실행문
//		} finally { // 필수는 아니지만 필요할 때 쓸 수 있는 형식, 예외 발생 유무와 상관없이 실행됨
//			
//		}

//		int number = 100;
//		int result = 0;
//
//		for (int i = 0; i < 10; i++) {
//			try { 
//				result = number / (int) (Math.random() * 9); // 랜덤 값중 0이 나오게 되면 오류가 발생하고 강제종료됨.(java.lang.ArithmeticException: / by zero)
//				System.out.println(result);				
//			} // catch(ArithmeticException e) { // try 문 내에 실행문을 넣고 아까 발생한 오류의 클래스명을 catch 구문 안에 넣어준다. 덕분에 정상종료 가능
////				 System.out.println("0으로 나누기를 실행했습니다.");
//			 	catch(Exception e) { // Exception은 모든 오류 처리 클래스. 덕분에 정상종료 가능
//			 		System.out.println("0으로 나누기를 실행했습니다.");
//			 } 
//		}
		
		
		int number = 100;
		int result = 0;
		int[] arr = {1,2,3};

		for (int i = 0; i < 10; i++) {
			try { 
				
				result = number / (int) (Math.random() * 9); // 랜덤 값중 0이 나오게 되면 오류가 발생하고 강제종료됨.(java.lang.ArithmeticException: / by zero)
				System.out.println(result);		
				
				arr[5] = 0;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());			// e.getMessage()는 해당 오류의 이유에 대해 설명해주는 역할
				System.out.println("index number error");
				e.printStackTrace(); 						// e.printStackTrace()는 해당 문제가 생긴 과정을 추적하는 역할
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());  		// e.getMessage()는 해당 오류의 이유에 대해 설명해주는 역할
				System.out.println("0으로 나누기 했습니다.");		// 배열의 오류도 있고 랜덤값의 오류가 있을 때 이렇게 2중 catch문으로 나타낼 수도 있다.
				e.printStackTrace(); 						// e.printStackTrace()는 해당 문제가 생긴 과정을 추적하는 역할
			} catch(Exception e) {
				System.out.println("모든 예외 처리 가능");			// 이렇게 예외처리 항목이 많을 경우 해당 클래스이름의 catch문으로 해결하고
			}												// 그 외의 오류는 Exception으로 처리한다. 때문에 Exception의 경우 맨 뒤에 넣어야된다.
		}		
		
		
	}

}
