
public class TvTest {
	public static void main(String[] args) {

		//new Tv();	// 객체 생성 == 메모리에 값(변수&메소드)을 할당한다.
					// 주소값을 가진다.
					// 특정 클래스 안에 정의되어있는 애들을 멤버(멤버변수)라고 한다.
		
		
//		new Tv().color = "red";
//		System.out.println();
		
		
		Tv t; // 변수의 선언(참조형 변수 -> 주소값을 다루는 변수) 
		t = new Tv();
		t.color = "red";
		System.out.println(t.color);
		
		t.channel  = 7;
		System.out.println(t.channel);
		
		t.channelUp();
		System.out.println(t.channel);
		// 클래스를 이용한 객체 생성 및 정리
		// 클래스의 인스턴스화
	}

}
