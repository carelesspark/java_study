
public class DataTest2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		change(d); 
		
		System.out.println(d.x);

	}
	static void change(Data d) {  // �̹��� �ּ� ���� �ѱ�, �� d.x�� 1000���� �ٲ�
		d.x = 1000;
		System.out.println("chage() : " + d.x);
	}

	
	// ���� �����ϸ鼭 value(���� ���� ȣ��) vs reference(������ ���� ȣ��) �����ϱ�
}
