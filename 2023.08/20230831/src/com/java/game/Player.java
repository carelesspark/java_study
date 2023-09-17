package com.java.game;

import java.util.Scanner;

public class Player {	// 멤버 변수를 초기화해야되는지? private하기 때문에 getter/setter를 해야되는지? 고민해야됌
	

	private String name;
	private String word;
	private Scanner sc;
	
	
	// 이름의 경우 처음 받기만 하면 되기에 getter만 사용하면 됌
	// 글자의 뒤와 다음 글자의 앞이 같은지 판단하는 역할 또한 여기서 구현
	
	public Player(String name) {	// 외부에서 받아오는 건 이름 하나 밖에 없음
		super();
		this.name = name;
		sc = new Scanner(System.in);
	}
	
	
	public String getName() {	// name 변수가 private 하기 때문에 초
		return name;
	}

	
	
	public String getWordFromUser() {		// 입력 기능
		System.out.println(name + ">> ");
		word = sc.nextLine();
		System.out.println(name + "님께서 '" + word + "'을(를) 입력하셨습니다.");
		return word;
	}
	
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1;	// 마지막 글자의 인덱스 번호 = 단어의 전체 길이 - 1
		if(lastWord.charAt(lastIndex) == word.charAt(0)) {	
			return true;
		}

		return false;
	}
	
	
}
