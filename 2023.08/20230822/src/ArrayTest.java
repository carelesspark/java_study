import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		 배열
//		 동일한 타입의 데이터 여러 개를 하나의 변수로 관리하는 방법
//		 1차원 배열 : int[] 변수명
// 		 다차원 배열 : int[][] 변수명	
//		 배열은 데이터의 순차처리 위해서 주로 사용한다.

//		int x, y, z;
//		x = 10;
//		y = 20;
//		z = 30;
//		
//		int[] arr; // 배열변수의 선언
//		arr = new int[5]; // 배열의 생성
//		
//		int[] arr = new int[5]; // 선언과 생성 동시에
//		
//		arr[0] = 10;	// 배열의 초기화
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[4]);

//		int[] arr = {10, 20, 30, 40, 50}; // 선언, 생성, 초기화
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[4]);

		// 배열의 활용
		// 반복문( for )
		// 배열의 크기 : arr.length

//		int[] arr = new int[10];
//		
//		
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);

		// int[] arr = new int[] {10,20,30}; // 메소드의 메개변수 값, 리턴값으로 사용
//		
//		char[] arr = new char[3];
//		arr[0] = 'a';
//		arr[1] = 'c';
//		arr[2] = 'b';
//		arr[3] = 'd';

//		String[] strArr = new String[5];
//		strArr[0] = "H";
//		strArr[1] = "He";
//		strArr[2] = "Hel";
//		strArr[3] = "Hell";
//		strArr[4] = "Hello";
//		
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}

		// 배열의 복사
		// 반복문을 이용한 방식
		// 함수를 이용한 방식(arraycopy())
		// Arrays.toString(arr1)

//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		
//		System.arraycopy(arr1, 0, arr2, 0, 5);
//		
//		System.out.println(Arrays.toString(arr2));

//		int [] score = { 79, 88, 91, 33, 100, 55, 95};
//		
//		
//		
//		int max = score[0];
//		int min = score[0];
//		
//		
//		for(int i = 1; i < score.length; i++) {
//			if(max < score[i]) {
//				max = score[i];
//			}
//			
//			if(min > score[i]) {
//				min = score[i];
//			}
//		}
//		
//		System.out.println(max);
//		System.out.println(min);

		// 배열 값 섞기

//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		
//		int x = 10;
//		int y = 20;
//		int temp;
//		
//		
//		temp = x;
//		
//		
//		x = y;
//		y = temp;

//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int index1 = 0; index1 < arr.length; index1++) {
//            int index2 = (int) (Math.random() * 10);
//            int tmp = arr[index1];
//
//            arr[index1] = arr[index2];
//            arr[index2] = tmp;
//        }
//
//        System.out.println(Arrays.toString(arr));
//		

//		int[] loto = new int[6];
//		
//		for(int i = 0; i < loto.length; i++) {
//			int num = (int)(Math.random() * 45) + 1;
//			
//			loto[i] = num;
//		}
//		
//		System.out.println(Arrays.toString(loto));

		// 정렬
		// 오름차순, 내림차순
		// 선택정렬

//		int[] arr = {7,5,9,3,6};
//		
//		System.out.println(Arrays.toString(arr));
//		
//		// 정렬(오름차순)
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		
//		// 정렬(내림차순)
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		
//		
//		System.out.println(Arrays.toString(arr));

//		int[] loto = new int[6];
//
//		for (int i = 0; i < loto.length; i++) {
//			int num = (int) (Math.random() * 45) + 1;
//			loto[i] = num;
//			for (int j = 0; j < i; j++) {
//				if (loto[i] == loto[j]) {
//					i--;
//				} 
//				if(loto[i] < loto[j]) {
//					int tmp;
//					tmp = loto[i];
//					loto[i] = loto[j];
//					loto[j] = tmp;
//				}
//			}
//
//		}
//
//		System.out.println(Arrays.toString(loto));
		
		
		
//		int[] lotto = new int[6];
//		
//		for(int i = 0; i < lotto.length; i++) {
//			int num = (int)(Math.random() * 45) + 1;
//			lotto[i] = num;
//			for(int j = 0; j < i; j++) {
//				if(lotto[i] == lotto[j]) {
//					i--;
//				}
//				if(lotto[i] < lotto[j]) {
//					int tmp;
//					tmp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = tmp;
//				}
//			}
//		}
//		
//		
//		System.out.println(Arrays.toString(lotto));
		
		// 강사님 풀이
		
//		int[] lotto = new int[6];
//		boolean ck;
//		
//		for(int i = 0; i < lotto.length; i++) {
//			while(true) {
//				lotto[i] = (int)(Math.random() * 45) + 1;
//				ck = false;
//				
//				for(int j = 0; j < i; j++) {
//					if(lotto[j] == lotto[i]) {
//						ck = true;
//						break;
//					}
//					
//					if(lotto[j] > lotto[i]) {
//						int tmp;
//						tmp = lotto[j];
//						lotto[j] = lotto[i];
//						lotto[i] = tmp;
//					}
//				}
//				if(ck == false){
//					break;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(lotto));
//		
		
//		int[] arr1 = {0,1,2,2,1,4,4,4,5,7,7,9,8};
//		
//		// 0~9
//		int[] result = new int[10];
//		
//		
//		System.out.println(Arrays.toString(result)); // 자동초기화 int는 기본 0으로 초기화
//		
//		for(int i = 0; i < arr1.length; i++) {
//			result[arr1[i]]++;
//		}
//		
//		System.out.println(Arrays.toString(result));
//		
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(i +"의 개수는 각각 " + result[i] + "개 있다.");
//		}
		
		
		
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[6];
		
		System.arraycopy(arr1, 0, arr2, 0, 4);
		
		
		System.out.print(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
