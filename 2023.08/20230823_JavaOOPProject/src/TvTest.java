
public class TvTest {
	public static void main(String[] args) {

		//new Tv();	// ��ü ���� == �޸𸮿� ��(����&�޼ҵ�)�� �Ҵ��Ѵ�.
					// �ּҰ��� ������.
					// Ư�� Ŭ���� �ȿ� ���ǵǾ��ִ� �ֵ��� ���(�������)��� �Ѵ�.
		
		
//		new Tv().color = "red";
//		System.out.println();
		
		
		Tv t; // ������ ����(������ ���� -> �ּҰ��� �ٷ�� ����) 
		t = new Tv();
		t.color = "red";
		System.out.println(t.color);
		
		t.channel  = 7;
		System.out.println(t.channel);
		
		t.channelUp();
		System.out.println(t.channel);
		// Ŭ������ �̿��� ��ü ���� �� ����
		// Ŭ������ �ν��Ͻ�ȭ
	}

}
