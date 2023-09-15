
public class Tv {
	// 속성
	String color;
	boolean power;
	int channel;
	
	// 위 변수들을 멤버 변수라 지칭함
	// 멤버 변수 : 자동초기화
	
	// 변수 기본형
	// 정수 : byte, short, int, long = 0
	// 실수 : float, double = 0.0f  double = 0.0
	// 논리값 : boolean = false
	// 문자 : char = ' '
	 
	
	
	// 변수 참조형
	// 초기값 : null
	// 문자열 : String = null
	
	
	
	
	
	// 기능 (속성의 변화를 줌)
	void power() {
		power = !power; 
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
		
	// 위 기능들을 멤버 메소드라고 지칭함
		
		
	// 위와 같은 코드들은 클래스를 정의했다라고 할 수 있음.
	}
}
