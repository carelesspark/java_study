import java.util.Arrays;

public class Function {
	// 속성

	// 기능(메소드)

	// 리턴타입 메소드이름([매개변수1, 매개변수2...]){
	// 해야할 일 (실행문)

	// [return 돌려받고 싶은 값]

	// }

	// 리턴타입 : void, 기본형타입(8개), 참조형, 기본형타입을 제외하면 참조형
	// 메소드 이름 : 작명
	// 매개분수 : (int x, int y)
	// 실행문 : System.out.print("Hello")
	// return : 리턴값

	void add() { // 메소드 정의
		System.out.println(3 + 4);

	}

	void add2(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	int add3(int a, int b) {
		int sum = a + b;
		return sum;
	}

	void sub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	void mul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	void remain(int a, int b) {
		System.out.println(a + " % " + b + " = " + (a % b));
	}

	double div1(int a, int b) {
		double result = a / (double) b;
		return result;
	}

	// return
	// 메소드의 종료(강제종료)
	// void인 경우

	void fun1(int x) {	

		if (x < 10) {
			System.out.println("메소드 강제 종료");
			return;
		}

		System.out.println(x);
	}

//	int fun2(int x, int y) { // 이런 경우 if 문을 만족하지 못하면 return이 없다 판단!
//		if(x > y) {
//			return x;
//		}
//	}

	int fun2(int x, int y) {
//		if( x > y ) {
//			return x;
//		} else {
//			return y;
//		}

		if (x > y) { // else 안쓰고 바로 return y;
			return x;
		}
		return y;

	}
	
	// 매개변수의 유효성 검사
	float div2(int a, int b) {
		
		// 나누기 할 때 정수를 0으로 나누면 안된다.
		
		if(b == 0) {
			return 0;
		}
		return a / (float)b;
		
		
	}
	
	
	void defaultArg(int a, int b) {
		a = 100;
		b = 200;
		System.out.println(a + " ," + b);
	}
	
	void refArg(int[] arr) { // void니까 값의 변화를 주지 않는다?? <- 이거 알아보기
		arr[0] = 100;
		System.out.println("refArg에서 출력");
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	

}
