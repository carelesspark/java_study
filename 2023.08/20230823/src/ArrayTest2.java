import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		// 2차원 배열
		// 행과 열의 구조를 가진다.
		
		
//		int[][] arr;	// 배열의 선언
//		arr = new int[5][3]; // 배열의 생성
//		index번호의 범위를 벗어나면 안된다.
		
		
		
		
//		int[][] arr = new int[5][3];	// 선언, 생성
//		
//		
//		arr[0][0] = 1; // 배열의 초기화
//		arr[4][2] = 15; 
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[4][2]);
//		
		
//		int[][] arr = { // 선언, 생성, 초기화
//					  {1,2,3}, 
//					  {4,5,6}, 
//					  {7,8,9}, 
//					  {10,11,12}, 
//					  {13,14,15} }; 
//		
//		
//		
// 		System.out.println(arr[0][0]);
//		System.out.println(arr[4][2]);
		
		
		
		
		// 배열의 활용
		// 배열의 크기 속성
		// 행 : arr.lengths
		// 열 : arr[0].length;
		
//		int[][] arr = new int [5][3];
//		
//		
//		for(int i = 0; i < arr.length; i++) { // 행
//			for(int j = 0; j < arr[i].length; j++) { // 열
//				arr[i][j] = 1;
//				
//			}
//		 } 
//		
//		for(int i = 0; i < arr.length; i++) { // 행
//				for(int j = 0; j < arr[i].length; j++) { // 열
//					System.out.print(arr[i][j] + "   ");
//				}
//				System.out.println();
//			}
		
//		int[] arr = new int[5];
//		
//		int[] arrcopy = arr; // arr의 주소값이 0x100이라고 했을 때, arrcopy에게도 0x100의 주소값이 복사됌
		
		// 2차원 배열의 경우, 
		// arr : 시작주소값, arr[0] : 행의 주소값, arr[0][0] : 
		// arr == arr[0]
		
		
//		int[][] arr = new int[2][2];
//		
//		int[][] arrcopy = arr; // 2차원 배열의 주소값 넘기기
		
		
//		int[][] arr = new int[2][5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i * 5) + j + 1;
//			}
//		}
//	
//		System.out.println(Arrays.deepToString(arr));
//		
//		
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				sum += arr[i][j];
//			}
//		}
//		
//		
//		System.out.println(sum);
		
		
//		int[][] score = {
//				{90, 90, 90},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40},
//				{50, 50, 50}
//
//		
//		};
//		
//		// 학생별 총점, 평균, 과목별 총점
//		
//		int korTotal = 0;
//		int engTotal = 0;
//		int mathTotal = 0;
//		
//		
//		
//		System.out.println("번호 국어,영어,수학 총점 평균");
//		System.out.println("=======================");
//		
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.print(i + 1 + ". "); // 번호 출력 부분
//			
//		
//			int sum = 0;
//			double avg = 0.0;
//			
//			korTotal += score[i][0];
//			engTotal += score[i][1];
//			mathTotal += score[i][2];
//			
//			
//			
//			for(int j = 0; j < score[i].length; j++) {
//				
//			
//				sum += score[i][j]; 
//				System.out.print(score[i][j] + "  "); // 국어, 수학, 영어 대입
//				
//			}
//			
//			avg = sum / (double)score[i].length;
//			System.out.println(sum + "  " + avg); // 총점과 평균 구하기
//		}
//		System.out.println("========================");
//		System.out.println("총점 " + korTotal + " " + engTotal + " " + mathTotal);
				
		
		
				
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
