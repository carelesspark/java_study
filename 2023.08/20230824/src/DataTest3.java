
public class DataTest3 {

	public static void main(String[] args) {
//		Data d = new Data();
//		d.x = 10;
//		
//		System.out.println(d.x);
//		
//		Data d2 = copy(d);
//		
//		System.out.println(d.x);
//		System.out.println(d2.x);
//		
//	}
//	static Data copy(Data d) {
//		System.out.println("�޼��� ȣ��(copy): " + d.x);
//		
//		Data tmp = new Data();
//		
//		tmp.x = 100;
//		System.out.println("�޼��� ȣ��(tmp): " + tmp.x);
//		
//		return tmp;
//	}
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		Data d2 = copy(d);
		
		System.out.println(d.x);
		System.out.println(d2.x);
		
	}
	static Data copy(Data d) {
		System.out.println("�޼��� ȣ��(copy): " + d.x);
		
		Data tmp = new Data();
		
		tmp.x = 100;
		System.out.println("�޼��� ȣ��(tmp): " + tmp.x);
		
		d.x = tmp.x;
//		
		return tmp; // return �߱� ������ ���� �� ���������� �Ҹ���� �ʰ� ���� �ѱ� �� ����
	}	// ��ȯŸ���� ���۷��� ������� 
	

}
