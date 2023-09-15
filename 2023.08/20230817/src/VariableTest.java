
public class VariableTest {

	public static void main(String[] args) {
		// 변수 : 데이터를 저장하는 역할
		// 기본형 8개
		// 변수의 형식은 : 타입 변수명
		// byte, char, short, long, int : 정수
		// float, double: 실수
		// boolean : 논리값
		// 정수 : int 기본자료형 -> 10
		// 실수 : double 기본자료형 -> 3.14

//		int age; // 변수의 선언(정수형)
//		age = 10; // 변수의 초기화
//		
//		System.out.println(age);
//		
//		age = 20;
//		
//		System.out.println(age);
//		
////		int x, y, z;
////		x = 10; y = 20; z = 30;
////
////		System.out.println(x);
//		
//
//		int x = 10, y = 20, z = 30;
//		System.out.println(z);
		
		boolean tf = false; // or true
		System.out.println(tf);
		
		byte b = 100;
		System.out.println(b);
		
		char c = 'a'; 
		System.out.println(c);
		
		char c2 = '가';
		System.out.println(c2);
		
		short s = 300;
		System.out.println(s);
		
		int i = 5000;
		System.out.println(i);
		
		int i2 = c;
		System.out.println(i2); // 이 경우 a = 97로 정해져있고, 정수형 타입의 i2 변수는 c를 받았으므로 숫자로 받게됌
		
		int i3 = c2;
		System.out.println(i3); // 이 경우 가 = 44032로 정해져있고, 정수형 타입의 i3 변수는 c2를 받았으므로 숫자로 받게됌
		
		long l = 2000000000000000l;
		System.out.println(l);
		
		float f = 3.14f;
		System.out.println(f); // float의 경우 값 뒤에 접미사 f를 붙이지 않으면 double로 인식되기에 float 타입을 사용할 때 값 뒤에 f를 붙어야 함
		
		double d = 3.14;
		System.out.println(d);
		
		char c3 = 'a';
		String s1 = "abc";
		
		System.out.println(c3);
		System.out.println(s1);
		
		
		
		
		
	}

}
