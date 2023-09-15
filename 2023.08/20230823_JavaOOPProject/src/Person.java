public class Person {
	
	//	클래스로 대상을 표현할 때 : 속성과 기능이 필요 
	
	// 속성을 표현할 때 : (변수) -> 사람의 경우 눈, 코, 입, 귀, 성별, 나이 등 눈에 보이는 것 
	
	String name = "박종혁";
	int age = 22;
	String gender = "남자";
	String address = "경기도 안산시";
	int legs = 2;
	
	// 기능을 표현할 때 : (메소드) -> 사람의 경우 보는 것, 냄새 맡는 것, 먹는 것, 듣는 것 등 
	
	void run() {
		System.out.println("두발로 달릴 수 있다.");
	}
	
	
	void showMyInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	
	
}
