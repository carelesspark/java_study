import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		 �迭
//		 ������ Ÿ���� ������ ���� ���� �ϳ��� ������ �����ϴ� ���
//		 1���� �迭 : int[] ������
// 		 ������ �迭 : int[][] ������	
//		 �迭�� �������� ����ó�� ���ؼ� �ַ� ����Ѵ�.

//		int x, y, z;
//		x = 10;
//		y = 20;
//		z = 30;
//		
//		int[] arr; // �迭������ ����
//		arr = new int[5]; // �迭�� ����
//		
//		int[] arr = new int[5]; // ����� ���� ���ÿ�
//		
//		arr[0] = 10;	// �迭�� �ʱ�ȭ
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[4]);

//		int[] arr = {10, 20, 30, 40, 50}; // ����, ����, �ʱ�ȭ
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[4]);

		// �迭�� Ȱ��
		// �ݺ���( for )
		// �迭�� ũ�� : arr.length

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

		// int[] arr = new int[] {10,20,30}; // �޼ҵ��� �ް����� ��, ���ϰ����� ���
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

		// �迭�� ����
		// �ݺ����� �̿��� ���
		// �Լ��� �̿��� ���(arraycopy())
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

		// �迭 �� ����

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

		// ����
		// ��������, ��������
		// ��������

//		int[] arr = {7,5,9,3,6};
//		
//		System.out.println(Arrays.toString(arr));
//		
//		// ����(��������)
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
//		// ����(��������)
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
		
		// ����� Ǯ��
		
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
//		System.out.println(Arrays.toString(result)); // �ڵ��ʱ�ȭ int�� �⺻ 0���� �ʱ�ȭ
//		
//		for(int i = 0; i < arr1.length; i++) {
//			result[arr1[i]]++;
//		}
//		
//		System.out.println(Arrays.toString(result));
//		
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(i +"�� ������ ���� " + result[i] + "�� �ִ�.");
//		}
		
		
		
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[6];
		
		System.arraycopy(arr1, 0, arr2, 0, 4);
		
		
		System.out.print(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
