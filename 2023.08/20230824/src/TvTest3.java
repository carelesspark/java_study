
public class TvTest3 {

	public static void main(String[] args) {
		// ��ü�迭
		
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
//		Tv[] tvArr = new Tv[3];		// �迭�� ����� ����
//		tvArr[0] = new Tv();		// �ּҰ� (����( : ox100 ), �ʱ�ȭ)
//		tvArr[1] = new Tv();		// �ּҰ� (����( : ox200 )
//		tvArr[2] = new Tv();		// �ּҰ� (����( : ox300 )
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
			tvArr[i] = new Tv();	// ��ü �迭 ���� : ������ ����?
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channel = (i + 1) * 10;
			System.out.println(tvArr[i].channel);
	}
		
		// �� �� �迭���� for������ ������ ��
//		��ü�� �迭�� �������� �����ؼ� ����

	}

}
