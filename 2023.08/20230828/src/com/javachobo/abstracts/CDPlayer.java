package com.javachobo.abstracts;

public class CDPlayer extends Player {
	   
	@Override
	void play(int pos) {
		
		System.out.println(pos + "�� �� ����");
	}

	@Override
	void stop() {
		
		System.out.println("����");
	}

}
