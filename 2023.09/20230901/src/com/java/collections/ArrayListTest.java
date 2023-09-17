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
//		ArrayList list = new ArrayList();		// 클래스에 들어가보니 Object 타입의 1차원 배열, 배열에 들어갈 때 형변환이 일어남(Object로)
//		list.add(new Integer(1));	// Wrapper 클래스 사용해서 참조형으로 만든 다음 add
//		list.add(new Integer(5));
//		list.add(new Integer(2));
//		list.add(new Integer(3));
//		list.add(new Integer(1));	// 배열의 경우 넣어주는 순서대로 값이 들어감
		
//		Integer it = (Integer)list.get(0);	// 배열 값 불러 오는 법 
		
//		int it =  (Integer)list.get(0); // 캐스팅을 통해 반환타입을 Integer로 바꾸고 이를 int 타입의 it 변수에 넣음(언박싱?)
//		System.out.println(it);
		
//		for(int i = 0; i < list.size(); i++) {	// 기본 for문 이용
//			int it = (Integer)list.get(i);
//			System.out.println(it);
//		}
//		
//		System.out.println("=========================");
//		
//		for( Object obj : list) {	// 향상된 for문 이용
//			int it = (Integer)obj;	// 캐스팅 후 언박싱
//			System.out.println(it);
//		}
//		
//		list.remove(2);	// 인덱스 2번째 문자 삭제, 이 ArrayList의 경우는 해당하는 인덱스 번호 값을 삭제할 경우 뒤에 있는 내용들이 앞으로 땡겨짐
//		System.out.println(list.size()); // 그래서 사이즈를 찍어보면 기존엔 5였던 사이즈가 4로 변함
//
//		System.out.println("=========================");
//		
//		for( Object obj : list) {	// 향상된 for문 이용
//			int it = (Integer)obj;	// 캐스팅 후 언박싱
//			System.out.println(it);
//		}
		
		// ArrayList와 LinkedList의 차이점
		// ArrayList는 앞에서 읽고 변경하는 점에 강점 (상대적으로 속도가 빠름)
		// LinkedList는 중간에 있는 값을 변경하는 점에 강점(상대적으로 속도가 빠름)
		
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
//		System.out.println(st.peek());	// peek의 경우 읽어오기만 하기 때문에 맨 마지막에 들어온 값을 출력함
//		System.out.println(st.peek());
//		System.out.println(st.peek());
//		
//		System.out.println("==============================");
//		
////		System.out.println(st.pop());	// 알다시피 스택은 LIFO이기 때문에 pop을 할 경우 맨 마지막에 들어왔던 "3"값이 먼저 나오면서 삭제됌
////		System.out.println(st.pop());	
////		System.out.println(st.pop());	
//		
//		while(!st.isEmpty()) {	// 스택 내의 값이 비어질 때까지 돌려라 라는 뜻 
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
//			System.out.println(q.poll());	// Queue의 경우 FIFO이기 때문에 먼저 들어온 "1"값이 먼저 나간다.
//		}
		
		// 큐 또는 스택, 리스트 등 불러오는 메소드들이 다 다양함.. 다르게 말하면 다 알아야한다는 것
		
		// 그래서 표준화 함
		// 데이터 값 읽어오기 표준화
		// Iterator
		// hasNext(), next(), remove()
		
		
//		Iterator it;
//		ArrayList
		
//		ArrayList list = new ArrayList();
//		list.add("1");	// 문자열은 생략 가능 int형은 new Integer 붙여야함! 그 이유는 찾아보기
//		list.add("2");
//		list.add("3");
		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			String str = (String)it.next();	// 캐스팅
//			System.out.println(str);
//		}
		
//		System.out.println("==================");
//		
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet set = new HashSet(); // Hash와 Set의 특징이 합쳐짐
//		set.add(1);
//		set.add("1");
//		set.add(2);
//		set.add(2);
//		set.add(3);
//		System.out.println(set); // 중복 허용 x, 타입이 다르면 상관없음
		
//		HashSet set = new HashSet();
//		
//		for(int i = 0; i < 6; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			set.add(lotto);
//			
//		}
//		
//		System.out.println(set);
		
		// 다만 위와 같은 문제는 중복 값이 발생할 경우 값이 배제되어서 나오는데 문제는 사이즈도 잡아먹기에 같은 숫자가 2번 들어가면 5개의 숫자만 출력되게됌.
		// 띠라서 size()를 이용해 6개의 사이즈가 들어갈 때 까지 돌리게끔 한다.
		
//		HashSet set = new HashSet();
//		
//		for(int i = 0; set.size() < 6; i++) {
//			int lotto = (int)(Math.random() * 45) + 1;
//			set.add(lotto);
//			
//		}
//		
//		System.out.println(set);
		
		
		// 이렇게 코드를 작성하면 위의 문제점인 중복값이 제거되어 안나오게되는 사이즈 문제도 해결하고
		// 기존에 중복을 제거하기위해 길게 썼던 코드들을 간편화할 수 있음
		
		
		
		// 문제 
		
		HashSet set = new HashSet();
		int [][] board = new int[5][5];
		
		// 1 ~ 50 
		
		for(int i = 0; set.size() < 25; i++) {
			set.add((int)(Math.random() * 50) + 1);	// Integer형변환
		}
		
		ArrayList list = new ArrayList(set);
		
		Collections.shuffle(list); 		// 이 코드는 값을 섞어줌, 단 set타입을 받지 못하기에 지금 처럼 list값에 대입 후 Collections.shuffle을 통해 값을 섞어줌
		
		Iterator it = list.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				board[i][j] = (Integer)it.next();
				System.out.printf("%2d ", board[i][j]);
			}
			System.out.println();
		}
		
		// 위 코드는 랜덤하게 [5][5] 배열에 숫자들이 잘 들어가지만, 문제가 발생
		// 오름차순의 형태로 질서정연하게 들어가게됨, 만약 빙고와 같은 문제들을 위해서는 사용하지 못함(완전 랜덤하게 값이 들어가지 않기 때문)
		
		// 그래서 set 값을 list에 집어 넣고, Collections.shuffle을 통해 값을 섞어 줄 수 있음.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
