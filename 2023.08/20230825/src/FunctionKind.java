public class FunctionKind {
	// 속성(변수)
	
	// 기능(메소드)
	// 인스턴스 메소드
	// 클래스 메소드
	
	// 인스턴스 메소드
//	void add() {
//		System.out.println(3 + 5);
//	}
	
	
	// 클래스 메소드 : 생성 없이 사용가능(클래스 변수의 특성과 똑같음)
//	static void sub() {
//		System.out.println(6 - 2);
//	}
	
	
	// 클래스 멤버 와 인스턴스한 멤버의 참조 관계
	
	int iv;
	static int cv;
	
	
	
	
	
	void instanceMethod1() {
		iv = 10;
		cv = 20;
		// 인스턴스 메소드에서는 클래스 변수를 사용할 수 있음.
		// 클래스 변수는 이미 할당되어 있기 때문
	}
	
	void instanceMethod2(){
		instanceMethod1();
	}
	
	
	static void staticMethod1() {
//		iv = 20; 
		// static한 메소드에서는 인스턴스 변수를 사용할 수 없음, 
		// 아직 생성이 안되었고 할당 시점이 다르기 때문
		cv = 20;

	}
	
	static void staticMethod2() {
//		instanceMethod1();
		// 메모리의 할당 시점이 다름, 사용 불가
		staticMethod1();
	}
	
	
	// 정리하자면 클래스 멤버들의 관계를 볼 때,
	// 인스턴스 메소드에서는 인스턴스&클래스 변수가 쓰일 수 있지만
	// 클래스 메소드에서는 인스턴스 변수는x 클래스 변수는 사용 가능하다.
	
	// 똑같이 2번째의 인스턴스 메소드에서는 인스턴스&클래스 메소드 호출이 가능하지만,
	// 클래스 메소드에서는 인스턴스 메소드는 x 클래스 메소드의 호출이 가능하다.
	
	
	
	
	
	
	
	
	
	
}
