
public class FactorTest {
	public static void main(String[] args) {
//		int fac = 1;
//		
//		for(int i = 1; i <= 5; i++) {
//			fac *= i;
//		}
//		
//		System.out.println(fac);
		
		int factorial = fac(5);
		System.out.println(factorial);
	}
	
	// 재귀 호출
	// 무한 반복
	// 매개 변수가 종료시점을 결정한다.
	// 조건문을 사용한다.
	// return 문을 사용한다.
	
	// 보니까 static void일 때는 return을 안쓰는 거같음ㄴ
	static int fac(int n) {
		int result = 0;
		
		if(n == 1) {
			return 1;
		} else {
			result = n * fac(n-1);
		}
		return result;
		
	}

}
