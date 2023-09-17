package com.java.genrics.game;

import java.util.ArrayList;
import java.util.Scanner;

public class WordQuiz {
	private String name;
	private ArrayList<Word> words;
	
	public WordQuiz(String name) {
		this.name = name;
		words = new ArrayList<Word>();
		words.add(new Word("love", "���"));
		words.add(new Word("animal", "����"));
		words.add(new Word("candy", "����"));
		words.add(new Word("bear", "��"));
		words.add(new Word("door", "��"));
		words.add(new Word("circle", "��"));
		words.add(new Word("honey", "��"));
		words.add(new Word("fault", "����"));
		words.add(new Word("picture", "����"));
		words.add(new Word("eye", "��"));
		words.add(new Word("nose", "��"));
		words.add(new Word("heart", "����"));
		words.add(new Word("bicycle", "������"));
		words.add(new Word("subway", "������ġ"));
		words.add(new Word("train", "����"));
		words.add(new Word("hambuger", "�ܹ���"));
		words.add(new Word("hotdog", "�ֵ���"));
	}
	
	// ������ ���⸦ �����ϴ� ����
	// �迭�� ����ؼ� ���� 4���� �����Ѵ�.
	
	int makeExample(int[] ex, int answerIndex) {
		int[] n = {-1, -1, -1, -1};
		int index;
		
		for(int i = 0; i < n.length; i++) {
			do {
				index = (int)(Math.random() * words.size());
			} while(index == answerIndex || exists(n, index));		// �����̶� ���ų�, �ߺ��� �������� ��츦 �Ǵ�
			n[i] = index;
			
		}
		
		System.arraycopy(n, 0, ex, 0, n.length);
		
		return (int)(Math.random() * n.length);	// ������ ��ġ��ų �ε��� ��ȣ
	}
	
	// �����߿� ������ �ִ��� ������ Ȯ���ϴ� ����
	boolean exists(int[] n, int index) {
		for(int i = 0; i < n.length; i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}
	
	// ������ �����ϴ� �޼ҵ�
	// ������ ���Ǵ� �ܾ�� ������ ������ �����ϴ� ����
	// ����Ǯ���� ���������� Ȯ���ϴ� ���
	void run() { 
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� ����");
		System.out.println("���� " + words.size() + "���� �ܾ ��� �ֽ��ϴ�.");
		
		while(true) {
			int answerIndex = (int)(Math.random()*words.size());
			String eng = words.get(answerIndex).getEnglish();
			
			int[] example = new int[4];
			int answerLocate = makeExample(example, answerIndex);
			
			// ���� ���
			System.out.println(eng + "?");
			
			// ���� ���
			for(int i = 0; i < example.length; i++) {
				System.out.println("(" + (i + 1) + ")" + words.get(example[i]).getKorean() + " ");
			}
			
			System.out.println(":>>");
			
			int in = sc.nextInt();	// 1 ~ 4 ���� ��
			if(in == -1) {
				break;
			}
			in--;
			if(in == answerLocate) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		
		System.out.println("���� ����");
	}
	
}
