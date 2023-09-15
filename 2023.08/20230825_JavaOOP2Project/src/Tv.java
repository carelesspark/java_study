
public class Tv /*extends Object*/{
	
	// 
	// 상속에서의 부모 클래스의 역할
	// 두개 이상의 자식 클래스에 공통으로 사용하는 요소를
	// 정의해서 전달해 준다.
	// 자바는 보통 단일상속, 객체지향 => 코드의 최소화, 유지 보수 용이
	// 포함의 경우 개수 제한이 없음. 상속은 한번만!
	// 모든 클래스는 Object라는 조상 클래스를 상속 받는다(위의 주석처리 참고). -> Source탭 Override에서 확인 가능
	// 어? 자바에서는 단일 상속만이 된다했는데 Object-> Tv -> TVCR 상속받고 있네? : 이부분 확실하게 찾아서 설명하기
	
	String color;
	boolean power; 	
	int channel;
	
	
	
	void power() {
		power = !power; 
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
		
	}
}

	// 클래스간 관계
	// 1. 상속 -> 상속이 없으면 유지보수가 안됌
	// 2. 포함 -> 상속을 제외하면  포함관계라 보면 됌
