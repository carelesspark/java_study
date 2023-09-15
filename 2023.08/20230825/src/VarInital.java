	
public class VarInital {
	// 멤버변수의 초기화
	// 자동 초기화 - 강제초기화 - 생성자 - 초기화블럭
	
	int x;	// 0;
	int y = 10;
	
	
	int iv;
	static int cv;
	
	static{	// 클래스 변수 초기화 블럭
		cv = 10;
	}
	
	{	// 인스턴스 변수 초기화 블럭
		iv = 10;
	}
	
	
	
	VarInital(){
		x = 20;
	}
}
