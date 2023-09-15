import java.util.Scanner;

public class LoopTest2 {
	public static void main(String[] args) {
		
		
		// 반복문의 제어
		// break : 즉시 종료
		// continue : 실행문의 제어
		// if문과 같이 사용
		//
		
		
//		for(int i = 1; i <= 10; i++) {
//			
//			
//			if(i > 5) {
//				break;
//			}
//			
//			
//			System.out.println("Hello World!");
//			
//		}
		
		
//		for(int i = 0; i <= 10; i++) {
//			if(i % 2 == 0) {
//				continue; // print 실행 x, 바로 i 증감식으로
//			}
//				
//			System.out.println(i);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		
//		
//		while(true) {
//			
//			System.out.println("숫자입력: ");
//			int choice = sc.nextInt();
//			
//			System.out.println("Hello World!");
//
//			if(choice == 5) {
//				System.out.println("Exit!");
//				break;
//			}
//		}
		
//		boolean flag = true;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while(flag) {
//			System.out.println("숫자입력");
//			int num = sc.nextInt();
//
//			System.out.println("Hello World!");
//			
//			if(num == 5) {
//				flag = false;
//			}			
//		}
//		System.out.println("프로그램 종료");
		
		
		// 두자리 이상의 정수를 입력 받는다. 34564
		// 각 숫자의 자리수의 합을 구한다. 3 + 4 + 5 + 6 + 4 = 22
		// 결과 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력: ");
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		
//		System.out.println(sum);
		
		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("두자리 이상의 변수 입력");
//		int num = sc.nextInt();
//		
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		System.out.println(sum);
		
//		do {
//			실행문
//		} while(조건식){
//			
//			int x = 120;
//			do {
//				System.out.println(x);	
//				x++;
//			} while(x > 100);
	
	
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 2; j <= 9; j++) {
//				if(j >= 2 && j <= 4) {
//					System.out.print(j + "*" + i + "=" + j * i) ;
//					System.out.print("   ");
//				} else if(j >= 5 && j <= 7) {
//					System.out.print(j + "*" + i + "=" + j * i) ;
//					System.out.print("   ");
//				} else if(j >= 8 && j <= 9) {
//					System.out.print(j + "*" + i + "=" + j * i) ;
//					System.out.print("   ");
//				}
//			} 
//			System.out.println();
//		}
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				int x = j + 1 + (i - 1) / 3 * 3;
				int y = i % 3 == 0 ? 3 : i % 3;
				
				if(x > 9) {
					break;
				}
				
				System.out.print(x + "*" + y + "=" + x * y);
				System.out.print("     ");
			}
			
			System.out.println();
			if(i % 3 == 0) {
				System.out.println();
			}
			
			
			
		}
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
