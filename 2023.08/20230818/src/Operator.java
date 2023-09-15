
public class Operator {

	public static void main(String[] args) {
		// 연산자
		// 단항연산자, 이항연산자, 삼항연산자
		// 산술연산자(+,-,*,/,%)
//		
//		int x = 5, y = 2;
//		
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		System.out.println(x % y);
//		
//		System.out.println("나이는 " + 10 + "살 입니다.");
//		
//		
//		// 자동형변환(형의 승격)
//		// int형보다 작은 타입을 연산하면 무조건 int형으로 바뀐다
//		// int형보다 크면 큰타입을 따라 형변환
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = (byte)(b1 + b2); // byte + byte = int +;
//		
//		System.out.println(result);
//		
//		int i = 100;
//		float f = 12.5F;
//		float result2 = i + f; //int + float //int float -> float + float
//		System.out.println(result2);
				
		// 단항연산자
		// ++, -- (중감연산자)값을 1 증가, 1 감소
		// 변수에만 적용가능
		// 전치, 후치
		
//		int x = 10;
//		int y = 0;
//		
//		y = ++x + 10;
//		
//				System.out.println("x =  " + x + " y =" + y );
		
//		int x = 2;
//		int result = x * x * x;
//		
//		System.out.println(result);
		
//		int x = 1;
//		int y = 0;
//		
//		y = x * x - 3 * x + 7;
//		System.out.println(y);
		
		// 비교연산자
		// <, >, <=, >=, ==, !=
		// 결과가 true or false
		
//		int x = 10;
//		int y = 20;
////		
//		boolean result = x > y;
//		System.out.println(result);
//		
//		
//		result = x == y;
//		System.out.println(result);
//		
//		result = x != y;
//		System.out.println(result);
		
		// 논리연산자
		// &&, ||, !
		// 논리값을 사용해서 연산
		// &&는 주어진 식 중 모두 true여야지 true, ||는 주어진 식 중 하나만 true면 true
		// !는 반대로 true->false, false->true
		
//		int x = 10;
//		int y = 20;
//		int z = 35;
//		
//		boolean result = x == 10 && y == 20 && z == 35;
//		System.out.println(result);
//		
//		
//		result = x != 10 && y == 10;
//		System.out.println(result);
//		
//		result = x == 20 || y == 20;
//		System.out.println(result);
//		
//		boolean a = false;
//		a = !a;
//		System.out.println(a);
//		
		
//		int x = 5;
//		boolen result = x >= 1 && x <= 10; <-  1 <= x <= 10
//		
//		System.out.println(result);
		
//		int x = 5;
//		boolean result = x <= 5 || x >= 11; <-  x <= 5 or x >= 11
//		System.out.println(result);
		
		// 삼항연산자 ( 조건연산자 )
		// 조건식 ? 결과1 : 결과2
		
//		int x = 10;
//		int y = 20;
//		
//		int result = x > y ? x : y;
//		System.out.println(result);
		
		
//		int x = -5;
//		
//		int result =  x > 0 ? x : -x;
//		System.out.println(result);
		
		// 대입연산자
		// 변수에 값을 할당하는 연산자
		// 우선순위 가장 낮음 
		// = (단순 대입 연산자)
		// +=, -=, *=, /= : 복합대입연산자
		
		
//		int x;
//		x = 10;
//		
//		int y = 20;
//		y += 10;
//		System.out.println(y);
		
//		int x = 10;
//		int y = 20;
//		
//		y += x + 30;
//		System.out.println(y);
		
		
//		int money = 65245;
//		int total = 0;
//		
//		System.out.println("오만원권 : " + money / 50000 + "개");
//		
//		money %= 50000;
//		
//		System.out.println("만원권 : " + money / 10000 + "개");
//		
//		money %= 10000;
//		
//		System.out.println("오천원권 : " + money / 5000 + "개");
//		
//		money %= 5000;
//		
//		System.out.println("천원권 : " + money / 1000 + "개");
//		System.out.println("오백원 : " + money / 500 + "개");
//		System.out.println("백원 : " + money / 100 + "개");
//		
//		money %= 100;
//		
//		System.out.println("일원 : " + money / 1 + "개");
		
//		double sum = 0;
//		
//		int euro = 58;
//		int dollar = 32;
//		
//		double exchange1 = euro * 1320.48026;
//		double exchange2 = dollar * 1063.82979;
//		
//		sum = exchange1 + exchange2;
//		
//		System.out.println("58유로를 환전하면 " + exchange1 + "원이고,");
//		System.out.println("32달러를 환전하면 " + exchange2 +"원 입니다.");
//		System.out.println("따라서 합계금액은 " + (String.format("%.2f", sum)) + "원 입니다.");
		
		// 바구니 하나는 10개의 사과를 담을 수 있다.
		// 그럼 바구니는 몇개가 필요할까요?
		
//		int apple = 153;
//		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1 ;
//		
//		System.out.println("사과 " + apple + "개를 담기 위해서는 바구니 " + basket + "개가 필요하다.");
		
//		int basket2 = 10;
		
//		if(apple % 10 == 0) {
//			System.out.println("사과 " + apple + "개를 담기 위해서는 바구니 " + apple/basket2 + "개가 필요하다.");
//		} else {
//			System.out.println("사과 " + apple + "개를 담기 위해서는 바구니 " + (apple/basket2+1) + "개가 필요하다.");
//		}
		
		
		
//		double avg = 87.6454;
//		// 87.6754 -> 87.7
//		// 87.6454 -> 87.6
//		
//		// 내가 한 풀이
//		double round = (int)(avg * 100) % 10 >= 1 && (int)(avg * 100) % 10 <= 4 ? (int)(avg * 10)/10.0 : (int)(avg * 10)/10.0 + 0.1;
//
//
//		System.out.println(round);
//		
//		
//		// 다른 풀이
//		double avg2 = 87.6754;
//
//		avg2 = (int)(avg2 * 10 + 0.5) / 10.0;
//		
//		System.out.println(avg2);
//		
//		double d = 3.14152668;
//		System.out.printf("%.3f", d);
		
		
		
	}

}
