
public class TvTest {
	public static void main(String[] args) {

		//new Tv();	// ��ü ���� == �޸𸮿� ��(����&�޼ҵ�)�� �Ҵ��Ѵ�.
					// �ּҰ��� ������.
					// Ư�� Ŭ���� �ȿ� ���ǵǾ��ִ� �ֵ��� ���(�������)��� �Ѵ�.
		
		
//		new Tv().color = "red";
//		System.out.println();
		
		
		// ������ ����(������ ���� -> �ּҰ��� �ٷ�� ����) 
		Tv t = new Tv();
		System.out.println(t.color);
		System.out.println(t.power);
		System.out.println(t.channel);
		
		
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
