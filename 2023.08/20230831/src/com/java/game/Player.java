package com.java.game;

import java.util.Scanner;

public class Player {	// ��� ������ �ʱ�ȭ�ؾߵǴ���? private�ϱ� ������ getter/setter�� �ؾߵǴ���? ����ؾ߉�
	

	private String name;
	private String word;
	private Scanner sc;
	
	
	// �̸��� ��� ó�� �ޱ⸸ �ϸ� �Ǳ⿡ getter�� ����ϸ� ��
	// ������ �ڿ� ���� ������ ���� ������ �Ǵ��ϴ� ���� ���� ���⼭ ����
	
	public Player(String name) {	// �ܺο��� �޾ƿ��� �� �̸� �ϳ� �ۿ� ����
		super();
		this.name = name;
		sc = new Scanner(System.in);
	}
	
	
	public String getName() {	// name ������ private �ϱ� ������ ��
		return name;
	}

	
	
	public String getWordFromUser() {		// �Է� ���
		System.out.println(name + ">> ");
		word = sc.nextLine();
		System.out.println(name + "�Բ��� '" + word + "'��(��) �Է��ϼ̽��ϴ�.");
		return word;
	}
	
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1;	// ������ ������ �ε��� ��ȣ = �ܾ��� ��ü ���� - 1
		if(lastWord.charAt(lastIndex) == word.charAt(0)) {	
			return true;
		}

		return false;
	}
	
	
}
