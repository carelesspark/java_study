package com.java.basic;

public class MemberTest {

	public static void main(String[] args) {
//		Member m = new Member();  기존의 객체생성
		
		Member m = Member.builder().id("Hong").pwd("1234")
				/*.age(20)*/.ADDR("서울").hobby("Sports").build(); 
		// lombok을 사용한 객체 빌딩(생성)
		// 이렇게 하면 Member 클래스 내의 멤버 변수 전체가 초기화가 되는데 만약 안하고 싶으면 빼면 된다.
		
		// 클래스 내에서 age = 10이라고 명시적 초기화를 진행해도 위와 같이 age를 빼고  객체생성을 하면 기본값인
		// 0이 출력된다.
		// 그래서 명시적 초기화 값을 보여주려면 위에 @Builder.default를 선언해주면 초기화 한 값 그대로 나온다.
		// 또한 hobby 부분에 NonNull을 선언해줬는데 만약 위에서 객체를 생성할 때
		// hobby를 생성하지 않을 경우 오류가 발생한다.
		
		
		System.out.println(m);
		
		// 또한 위의 객체 생성의 경우 생성자 함수를 main 메소드서 정의한 것이라고 보면 된다.
		// 풀면서 궁금증이 있었다. 어? 멤버변수를 private해놓았는데 어떻게 초기화를 할 수 있는거지?
		// 클래스는 변수, 메소드, 생성자로 이뤄져있는데 이 생성자를 main메소드에서 정의한 것 뿐이다.
		// 즉, 멤버 변수의 초기화는 생성자함수를 이용해 초기화 한 것이므로 멤버 변수의 private가 적용되어 있어도 멤버변수의 초기화를 진행할 수 있는 것이다.
		
	
	}

}
