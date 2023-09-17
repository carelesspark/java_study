package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayListTest {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();		// Ŭ������ ������ Object Ÿ���� 1���� �迭, �迭�� �� �� ����ȯ�� �Ͼ(Object��)
//		list.add(new Integer(1));	// Wrapper Ŭ���� ����ؼ� ���������� ���� ���� add
//		list.add(new Integer(5));
//		list.add(new Integer(2));
//		list.add(new Integer(3));
//		list.add(new Integer(1));	// �迭�� ��� �־��ִ� ������� ���� ��
		
//		Integer it = (Integer)list.get(0);	// �迭 �� �ҷ� ���� �� 
		
//		int it =  (Integer)list.get(0); // ĳ������ ���� ��ȯŸ���� Integer�� �ٲٰ� �̸� int Ÿ���� it ������ ����(��ڽ�?)
//		System.out.println(it);
		
//		for(int i = 0; i < list.size(); i++) {	// �⺻ for�� �̿�
//			int it = (Integer)list.get(i);
//			System.out.println(it);
//		}
//		
//		System.out.println("=========================");
//		
//		for( Object obj : list) {	// ���� for�� �̿�
//			int it = (Integer)obj;	// ĳ���� �� ��ڽ�
//			System.out.println(it);
//		}
//		
//		list.remove(2);	// �ε��� 2��° ���� ����, �� ArrayList�� ���� �ش��ϴ� �ε��� ��ȣ ���� ������ ��� �ڿ� �ִ� ������� ������ ������
//		System.out.println(list.size()); // �׷��� ����� ���� ������ 5���� ����� 4�� ����
//
//		System.out.println("=========================");
//		
//		for( Object obj : list) {	// ���� for�� �̿�
//			int it = (Integer)obj;	// ĳ���� �� ��ڽ�
//			System.out.println(it);
//		}
		
		// ArrayList�� LinkedList�� ������
		// ArrayList�� �տ��� �а� �����ϴ� ���� ���� (��������� �ӵ��� ����)
		// LinkedList�� �߰��� �ִ� ���� �����ϴ� ���� ����(��������� �ӵ��� ����)
		
//		LinkedList list = new LinkedList();
//		list.add(new Integer(1));
//		list.add(new Integer(3));
//		list.add(new Integer(5));
//		list.add(new Integer(4));
//		list.add(new Integer(2));
		
		// Stack
		// LIFO
		
//		Stack st = new Stack();
//		st.push("1");	// new String("1");
//		st.push("2");
//		st.push("3");
//		
//		System.out.println(st.peek());	// peek�� ��� �о���⸸ �ϱ� ������ �� �������� ���� ���� �����
//		System.out.println(st.peek());
//		System.out.println(st.peek());
//		
//		System.out.println("==============================");
//		
////		System.out.println(st.pop());	// �˴ٽ��� ������ LIFO�̱� ������ pop�� �� ��� �� �������� ���Դ� "3"���� ���� �����鼭 ������
////		System.out.println(st.pop());	
////		System.out.println(st.pop());	
//		
//		while(!st.isEmpty()) {	// ���� ���� ���� ����� ������ ������ ��� �� 
//			System.out.println(st.pop());
//		}
		
		// Queue
		// FIFO
		
//		Queue q = new LinkedList();
//		q.offer("1");
//		q.offer("2");
//		q.offer("3");
//		
//		while(!q.isEmpty()) {
//			System.out.println(q.poll());	// Queue�� ��� FIFO�̱� ������ ���� ���� "1"���� ���� ������.
//		}
		
		// ť �Ǵ� ����, ����Ʈ �� �ҷ����� �޼ҵ���� �� �پ���.. �ٸ��� ���ϸ� �� �˾ƾ��Ѵٴ� ��
		
		// �׷��� ǥ��ȭ ��
		// ������ �� �о���� ǥ��ȭ
		// Iterator
		// hasNext(), next(), remove()
		
		
//		Iterator it;
//		ArrayList
		
//		ArrayList list = new ArrayList();
//		list.add("1");	// ���ڿ��� ���� ���� int���� new Integer �ٿ�����! �� ������ ã�ƺ���
//		list.add("2");
//		list.add("3");
		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			String str = (String)it.next();	// ĳ����
//			System.out.println(str);
//		}
		
//		System.out.println("==================");
//		
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet set = new HashSet(); // Hash�� Set�� Ư¡�� ������
//		set.add(1);
//		set.add("1");
//		set.add(2);
//		set.add(2);
//		set.add(3);
//		System.out.println(set); // �ߺ� ��� x, Ÿ���� �ٸ��� �������
		
//		HashSet set = new HashSet();
//		
//		for(int i = 0; i < 6; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			set.add(lotto);
//			
//		}
//		
//		System.out.println(set);
		
		// �ٸ� ���� ���� ������ �ߺ� ���� �߻��� ��� ���� �����Ǿ �����µ� ������ ����� ��ƸԱ⿡ ���� ���ڰ� 2�� ���� 5���� ���ڸ� ��µǰԉ�.
		// ��� size()�� �̿��� 6���� ����� �� �� ���� �����Բ� �Ѵ�.
		
//		HashSet set = new HashSet();
//		
//		for(int i = 0; set.size() < 6; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			set.add(lotto);
//			
//		}
//		
//		System.out.println(set);
		
		
		// �̷��� �ڵ带 �ۼ��ϸ� ���� �������� �ߺ����� ���ŵǾ� �ȳ����ԵǴ� ������ ������ �ذ��ϰ�
		// ������ �ߺ��� �����ϱ����� ��� ��� �ڵ���� ����ȭ�� �� ����
		
		
		
		// ���� 
		
		HashSet set = new HashSet();
		int [][] board = new int[5][5];
		
		// 1 ~ 50 
		
		for(int i = 0; set.size() < 25; i++) {
			set.add((int)(Math.random() * 50) + 1);	// Integer����ȯ
		}
		
		ArrayList list = new ArrayList(set);
		
		Collections.shuffle(list); 		// �� �ڵ�� ���� ������, �� setŸ���� ���� ���ϱ⿡ ���� ó�� list���� ���� �� Collections.shuffle�� ���� ���� ������
		
		Iterator it = list.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				board[i][j] = (Integer)it.next();
				System.out.printf("%2d ", board[i][j]);
			}
			System.out.println();
		}
		
		// �� �ڵ�� �����ϰ� [5][5] �迭�� ���ڵ��� �� ������, ������ �߻�
		// ���������� ���·� ���������ϰ� ���Ե�, ���� ����� ���� �������� ���ؼ��� ������� ����(���� �����ϰ� ���� ���� �ʱ� ����)
		
		// �׷��� set ���� list�� ���� �ְ�, Collections.shuffle�� ���� ���� ���� �� �� ����.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
