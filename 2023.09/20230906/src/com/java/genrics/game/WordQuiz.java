package com.java.genrics.game;

import java.util.ArrayList;
import java.util.Scanner;

public class WordQuiz {
	private String name;
	private ArrayList<Word> words;
	
	public WordQuiz(String name) {
		this.name = name;
		words = new ArrayList<Word>();
		words.add(new Word("love", "사랑"));
		words.add(new Word("animal", "동물"));
		words.add(new Word("candy", "사탕"));
		words.add(new Word("bear", "곰"));
		words.add(new Word("door", "문"));
		words.add(new Word("circle", "원"));
		words.add(new Word("honey", "꿀"));
		words.add(new Word("fault", "오류"));
		words.add(new Word("picture", "사진"));
		words.add(new Word("eye", "눈"));
		words.add(new Word("nose", "코"));
		words.add(new Word("heart", "심장"));
		words.add(new Word("bicycle", "자전거"));
		words.add(new Word("subway", "샌드위치"));
		words.add(new Word("train", "기차"));
		words.add(new Word("hambuger", "햄버거"));
		words.add(new Word("hotdog", "핫도그"));
	}
	
	// 문제의 보기를 구성하는 역할
	// 배열을 사용해서 보기 4개를 구상한다.
	
	int makeExample(int[] ex, int answerIndex) {
		int[] n = {-1, -1, -1, -1};
		int index;
		
		for(int i = 0; i < n.length; i++) {
			do {
				index = (int)(Math.random() * words.size());
			} while(index == answerIndex || exists(n, index));		// 정답이랑 같거나, 중복된 데이터일 경우를 판단
			n[i] = index;
			
		}
		
		System.arraycopy(n, 0, ex, 0, n.length);
		
		return (int)(Math.random() * n.length);	// 정답을 위치시킬 인덱스 번호
	}
	
	// 보기중에 정답이 있는지 없는지 확인하는 역할
	boolean exists(int[] n, int index) {
		for(int i = 0; i < n.length; i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}
	
	// 게임을 시작하는 메소드
	// 문제에 사용되는 단어와 보기의 정답을 구성하는 역할
	// 문제풀이의 정답유무를 확인하는 기능
	void run() { 
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "의 단어 테스트를 시작합니다. -1을 입력하면 종료");
		System.out.println("현재 " + words.size() + "개의 단어가 들어 있습니다.");
		
		while(true) {
			int answerIndex = (int)(Math.random()*words.size());
			String eng = words.get(answerIndex).getEnglish();
			
			int[] example = new int[4];
			int answerLocate = makeExample(example, answerIndex);
			
			// 문제 출력
			System.out.println(eng + "?");
			
			// 보기 출력
			for(int i = 0; i < example.length; i++) {
				System.out.println("(" + (i + 1) + ")" + words.get(example[i]).getKorean() + " ");
			}
			
			System.out.println(":>>");
			
			int in = sc.nextInt();	// 1 ~ 4 사이 값
			if(in == -1) {
				break;
			}
			in--;
			if(in == answerLocate) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
			}
		}
		
		System.out.println("게임 종료");
	}
	
}
