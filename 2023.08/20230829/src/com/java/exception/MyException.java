package com.java.exception;
												// 직접 예외 클래스를 만들 때 Exception 클래스로 부터 상속받는다.
public class MyException extends Exception {	// 이 클래스는 보통 try/catch문에 사용되고, 이 클래스는 자바가 만든 게 아닌 내가 만든 예외 클래스 이므로
	MyException(){								// 이 클래스는 직접 예외 발생x, throw를 이용해 예외가 발생되게끔 만듬
		super("내가 만든 예외 클래스");
	}

}
