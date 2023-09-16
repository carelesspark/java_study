package com.java.game;

import java.util.Scanner;

public class WordGameApp { 	// ������ ����ǵ��� �����ϴ� Ŭ����
	// Player ���� ������ scanner�� ������ �����ڰ� �Է��ϴ� �ܾ ����, �� Ŭ���������� ����� �����ڰ� ������ ���ΰ��� ���� scanner
	// ù �ܾ �� Ŭ�������� ����
	
	private Scanner sc;
	private String startWord = "�ƹ���";
	private Player[] players;
	// �� ��������� �� �ܺη� ������ �Ǵ� ������ ���⿡ getter/setter ��� ���ص���
	
	public WordGameApp() {	// �⺻������ �Լ�
		sc = new Scanner(System.in);
	}
	
	private void createPlayers() {	// �ܺο� ���� �ʿ䰡 ���� ������ private�� ����
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�? >> ");
		int nPlayers = sc.nextInt();
		players = new Player[nPlayers];
		
		for(int i = 0; i < players.length; i++) {
			System.out.println("������ �̸��� �Է����ּ���>> ");
			String name = sc.next();
			
			players[i] = new Player(name);		// �̷��� �ۼ��ϴ� ���ڸ� �Է��ϰ� ���� ���� ��, ������ �̸���
												// �ι� ����µ� �� ������ �����ο����� ��� �� �ƴ� ���Ͱ���
												// ���ۿ� �����־� ù��° �������� �̸����� ���� ���̴�.
												// ���� String name = sc.nextLine(); => sc.next();�� �ٲ��ش�.
		}
	}
	
	public void run() {
		System.out.println("======================");
		System.out.println("=== �����ձ� ���� Start ===");
		System.out.println("======================");
		
		createPlayers();	// 1�� �׽�Ʈ ���� ����, �� ������ �ʰ� ������� ������ ��ġ�� �׽�Ʈ �ϴ� ���� ����.
	}
	
	
	
}
