import java.util.Arrays;
import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {

		
//		// ���� : int x = 1; x ���� ����
//		// ��� : final int MAX = 100 => MAX = 200(X), ���� �տ� final�� ���̸� �̸��� �ݵ�� �빮�ڷ�!
//		
//		
//		final int SIZE = 5;
//		int x, y;
//		int num = 0;
//		int cnt = 0;
//		boolean value = true;
//		
//		int[][] bingo= new int[SIZE][SIZE]; // SIZE�� ����̱⿡ �迭�� ũ�Ⱑ �ٲ��� ����
//		
//		Scanner sc = new Scanner(System.in);
////		System.out.println("���� �Է�: ");
////		int me = sc.nextInt();
//		
//		
//		
//		for(int i = 0; i < SIZE; i++) {
//			for(int j = 0; j < SIZE; j++) {
//				bingo[i][j] = i * SIZE + j + 1;
//			} 
//		}
//		
//		for(int i = 0; i < SIZE; i++) {
//			for(int j = 0; j < SIZE; j++) {
//				x = (int)(Math.random() * SIZE);
//				y = (int)(Math.random() * SIZE);
//				
//				int tmp = bingo[i][j];
//				bingo[i][j] = bingo[x][y];
//				bingo[x][y] = tmp;
//				
//			} 
//		}
//		
//		
//		do {
//			for(int i = 0; i < SIZE; i++) {
//				for(int j = 0; j < SIZE; j++) {
//					System.out.printf("%2d  ", bingo[i][j]);
//				} 
//				System.out.println();
//			}
//			
//			System.out.println();
//			
//			System.out.println("1 ~ 25�� ���ڸ�  �Է��ϼ��� (����:0) >> ");
//			num = sc.nextInt();
//			
//			for(int i = 0; i < SIZE; i++) {
//				for(int j = 0; j < SIZE; j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//						value = false;
//						break;
//					}
//					cnt++;
//				} 
//				if(value == false) {
//					break;
//				}
//			}
//			
//			System.out.println("cnt : " + cnt);
//			
//		} while(num != 0);
		
		
		
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		char[][] result2 = new char[result[0].length][result.length];
		char[][] result3 = new char[result2[0].length][result2.length];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				int x = j;
				int y = star.length - 1 - i; 
				
				result[x][y] = star[i][j];
			}
		}
		
		for(int i = 0; i< result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				int x = j;
				int y = 4-i;
				
				result2[x][y] = result[i][j];
			}
		}
		
		for(int i = 0; i < result2.length; i++) {
			for(int j = 0; j < result2[i].length; j++) {
				System.out.print(result2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < result2.length; i++) {
			for(int j = 0; j < result2[i].length; j++) {
				int x = j;
				int y = 3-i;
				
				result3[x][y] = result2[i][j];
			}
		}
		
		for(int i = 0; i < result3.length; i++) {
			for(int j = 0; j < result3[i].length; j++) {
				System.out.print(result3[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
