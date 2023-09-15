	import java.util.Arrays;

public class FunctionTest {
	public static void main(String[] args) {
//		Function fc = new Function();

//		fc.add();
//		fc.add2(1, 2);
//		int sum = fc.add3(6, 4);
//		System.out.println(sum);
//		fc.sub(5, 2);
//		fc.mul(5, 2);
//		fc.div(5, 2);
//		fc.remain(5,2);
////		
//		double sum1 = fc.div1(10, 3);
//		System.out.println(sum1);

//		fc.fun1(9);
//		
//		int result = fc.fun2(3, 6);
//		System.out.println(result);
//		
//		
//		float result2 = fc.div2(10, 0);
//		System.out.println(result2);
//		
//		
//		if(result2 == 0.0f) {
//			System.out.println("매개변수 오류");
//		}
//		
//		Function2 fc2 = new Function2();
//		
//		fc2.method1();	// 호출하는 메소드를 정의 하고 있는 위치 찾기 Ctrl + 마우스 왼클릭
		
		Function fc = new Function();
		
		int a = 1;
		int b = 2;
		
		System.out.println("메소드 호출 전");
		System.out.println(a + " ," + b);

		fc.defaultArg(a, b);
//		
		System.out.println("메소드 호출 후");
		System.out.println(a + " ," + b);

		int[] arr = {1,2,3,4,5};
		
		System.out.println("메소드 호출전");
		System.out.println(Arrays.toString(arr));
		
//		
		fc.refArg(arr);
		
		System.out.println("메소드 호출후");
		System.out.println(Arrays.toString(arr)); 
//		
		// 위의 문제에 비해 값이 바뀐 이유는 주소값을 넘겼기 때문이다.
		// 배열의 경우 무조건 주소 값을 넘기기에 지역 변수에 관한 영향이 없는 것 같음?
		
		
	}

}
