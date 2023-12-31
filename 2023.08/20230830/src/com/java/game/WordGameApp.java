package com.java.game;

import java.util.Scanner;

public class WordGameApp { 	// 게임이 실행되도록 구현하는 클래스
	// Player 에서 구현한 scanner는 각각의 참가자가 입력하는 단어를 위함, 이 클래스에서는 몇명의 참가자가 참여할 것인가에 대한 scanner
	// 첫 단어도 위 클래스에서 구현
	
	private Scanner sc;
	private String startWord = "아버지";
	private Player[] players;
	// 위 멤버변수들 중 외부로 나가야 되는 변수는 없기에 getter/setter 사용 안해도됌
	
	public WordGameApp() {	// 기본생성자 함수
		sc = new Scanner(System.in);
	}
	
	private void createPlayers() {	// 외부에 사용될 필요가 없기 때문에 private를 붙임
		System.out.println("게임에 참가하는 인원은 몇명입니까? >> ");
		int nPlayers = sc.nextInt();
		players = new Player[nPlayers];
		
		for(int i = 0; i < players.length; i++) {
			System.out.println("참가자 이름을 입력해주세요>> ");
			String name = sc.next();
			
			players[i] = new Player(name);		// 이렇게 작성하니 숫자를 입력하고 엔터 했을 때, 참가자 이름을
												// 두번 물어보는데 그 이유는 참가인원수를 물어볼 때 쳤던 엔터값이
												// 버퍼에 남아있어 첫번째 참가자의 이름으로 들어가는 것이다.
												// 따라서 String name = sc.nextLine(); => sc.next();로 바꿔준다.
		}
	}
	
	public void run() {
		System.out.println("======================");
		System.out.println("=== 끝말잇기 게임 Start ===");
		System.out.println("======================");
		
		createPlayers();	// 1차 테스트 시작 지점, 다 만들지 않고 어느정도 과정을 거치고 테스트 하는 것이 좋다.
	}
	
	
	
}
