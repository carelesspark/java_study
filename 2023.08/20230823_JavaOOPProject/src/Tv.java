
public class Tv {
	// 속성
	String color;
	boolean power;
	int channel;
	
	// 위 변수들을 멤버 변수라 지칭함
	
	// 기능 (속성의 변화를 줌)
	void power() {
		power = !power; 
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
		
		
		// 위와 같은 코드들은 클래스를 정의했다라고 할 수 있음.
	}
}
