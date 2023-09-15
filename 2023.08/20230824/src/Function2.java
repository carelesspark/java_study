
public class Function2 {
	void method1() { 	// 메소드가 호출되고 있는 위치 찾기 Ctrl + Alt + h
		System.out.println("method1");
		method2();
		System.out.println("method1");
	}
	
	void method2() {
		System.out.println("method2");
		method3();
		System.out.println("method2");
	}
	
	void method3() {
		System.out.println("method3");
	}
	
}
