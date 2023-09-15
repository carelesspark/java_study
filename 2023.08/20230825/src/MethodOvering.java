public class MethodOvering {
	// 오버로딩(Overloading)
	// 1. 메소드의 이름이 같아야 한다.
	// 2. 매개변수의 개수 또는 타입 중에 하나는 달라야 한다.
	// 3. 리턴타입은 오버로딩의 조건이 아니다.
	
	
	public static void main(String[] arg) {
		System.out.println(10); // int형
		System.out.println(10); // int형
		System.out.println(12.3); // double형
		System.out.println('a'); // char형
		System.out.println("홍길동"); //String형
		
		
		// 위 println 역시 메소드라 볼 수 있고 각각 들어간 10, 12.3, 'a', "홍길동"을  매개변수라고 볼 수 있다.
		// 즉, 위와 같은 기본적인 코드들도 오버로딩이라고 볼 수 있다.	
	
	}
	
	
	
	
	
	void add() {}
	void add(int x) {} // 매개변수의 개수가 다르니 오버로딩 만족
	// int add() { } 리턴타입은 상관없다.
	
	
	void add(double x) {} // 매겨변수의 타입이 다르니 오버로딩 만족
	void add(int x, int y) {} // 매개변수의 개수가 다르니 오버로딩 만족
	
	void add(int x, double y) {} // 매개변수의 타입이 다르니 오버로딩 만족
	void add(double x, int y) {} // 매개변수의 타입이 다르니 오버로딩 만족
	
	
}
