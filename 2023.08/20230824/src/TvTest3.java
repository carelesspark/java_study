
public class TvTest3 {

	public static void main(String[] args) {
		// 객체배열
		
//		int x,y,z;
//		
//		x = 10;
//		y = 20;
//		z = 30;
//		
//		
//		int[] arr = new int[3];
//		arr[0] = x;
//		arr[1] = y;
//		arr[2] = z;
//		
//		Tv t1,t2,t3;
//		t1 = new Tv();
//		t2 = new Tv();
//		t3 = new Tv();
//		
//		Tv[] tvArr = new Tv[3];		// 배열의 선언과 생성
//		tvArr[0] = new Tv();		// 주소값 (예시( : ox100 ), 초기화)
//		tvArr[1] = new Tv();		// 주소값 (예시( : ox200 )
//		tvArr[2] = new Tv();		// 주소값 (예시( : ox300 )
//		
//		
//		
//		tvArr[0].channel = 10;
//		tvArr[1].channel = 20;
//		tvArr[2].channel = 30;
//		
//		System.out.println(tvArr[0].channel);
//		System.out.println(tvArr[1].channel);
//		System.out.println(tvArr[2].channel);
		
		Tv[] tvArr = new Tv[3];
		
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();	// 객체 배열 이유 : 데이터 참조?
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channel = (i + 1) * 10;
			System.out.println(tvArr[i].channel);
	}
		
		// 맨 위 배열식을 for문으로 정리한 것
//		객체를 배열의 형식으로 지정해서 선언가

	}

}
