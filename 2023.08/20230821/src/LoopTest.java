public class LoopTest {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");

		// for, while, do~while

//		for(초기값; 조건식; 증감값) {
//			실행문;
//		}

//		for(int i = 1; i <= 10; ++i) {
//			System.out.println(i + ". 안녕");
//		}
//		
//		for(int i = 1; i <= 10; i+=2) {
//			System.out.println(i + ". 안녕");
//		}

//		for(int i = 10; i >= 1; i--) {
//			System.out.println(i + ". hello");
//		}
//		
//		for(int i = 1, j = 10; i <= 10; i++, j--) {
//			System.out.println(i + ". hello, " + j + ". hi");
//		}

//		for(;;) { // 무한반복
//			System.out.println("hello");
//		}

//		for(;true;) { // 무한반복
//			System.out.println("hello");
//		}

		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10

//		int total = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			total += i;
//		}
//		System.out.println(total);

//		int total = 1;
//		
//		for(int i = 5; i >= 1; i--) {
//			total *= i;		// total = total * i
//		}
//		
//		System.out.println(total);
//		
//		

		// 1 + (-2) + 3 + (-4) + 5 + (-6) + ...... + (-10)


//		int total = 0;
//		for(int i = 1, j = -2; i <= 10; i+=2, j-=2) {
//			total += i;
//			total += j;
//			System.out.print(i);
//			if(j == -10) {				
//				System.out.print(" + (" + j + ") = " );
//			} else {
//				System.out.print(" + (" + j + ") + " );
//			}
//		}
//		
//		System.out.println(total);
//		

//		int sum = 0;
//		int s = 1;
//		
//		for(int i = 1; i <= 10; i++, s=-s) {
//			sum += (i * s);
//		}
//		
//		System.out.println(sum);

//		for(int i = 1; i <= 30; i++) {
//			System.out.println(i / 3 + " , " + i % 3);
//		}

//		초기값
//		
//		while(조건식) {
//			실행문
//			증감식
//		}

//		int i = 1;
//			while(i <= 10) {
//				System.out.println(i + ". Hello World!");
//				++i;
//			}

//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i += 2;
//		}

//		int i = 10;
//		while(i >= 1) {
//			System.out.println(i);
//			--i;
//		}

//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);

//		while(true) { // 무한반복
//			
//		}

		// 중첩 반복문
//		for() {
//			for() {
//				실행문
//			}
//		}

//		int num = 1;
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 3; j++) {
//				System.out.println("i = " + i + ", j = " + j);
//			}
//		}

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		*
//		**
//		***
//		****
//		*****

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//				*
//			   **
//			  ***
//			 ****
//			*****

		
//			for(int i = 1; i <= 5; i++) {
//				for(int j = 1; j <= 5 - i; j++) {
//					System.out.print(" ");
//				} 
//				for(int x = 1; x <= i; x++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		
//		
//			
//			for(int i = 1; i <= 5; i++) {
//				for(int j = 1; j <= 5; j++) {
//					if(i + j < 6) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}

//	*****
//	****
//	***
//	**
//	*
//	
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 6 - i; j++) {
//				System.out.print("*");
//			}
//			for(int x = 5; x >= 5 - x; x--) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println();
//		
////		
////	*****
////	 ****
////	  ***
////	   **
////	    *
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int x = 1; x <= 6 - i; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		
////		
////			*			공백 + 별  = 5
////		   ***					= 6
////		  *****					= 7
////		 *******				= 8
////		*********				= 9
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j < i + 5; j++) {
//				if(i + j < 6) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

//		int i = 0;
//
//		while (i <= 10) {
//			int j = 1;
//			while (j <= 10) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(i <= 5) {
					if(5 - i < j && j < 5 + i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if(i - 5 < j && j < 15 - i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
