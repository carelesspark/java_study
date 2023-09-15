package com.javachobo.polym;

public class Tv extends Product {
	// 부모 클래스에서 생상자가 기본생성자가 아니기에 밑줄이 Tv에 오류가 뜸
	// 이럴 때 super를 사용한다.

	
	Tv(){
		super(100);	
		}

	
}
