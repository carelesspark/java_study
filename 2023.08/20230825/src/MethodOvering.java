public class MethodOvering {
	// �����ε�(Overloading)
	// 1. �޼ҵ��� �̸��� ���ƾ� �Ѵ�.
	// 2. �Ű������� ���� �Ǵ� Ÿ�� �߿� �ϳ��� �޶�� �Ѵ�.
	// 3. ����Ÿ���� �����ε��� ������ �ƴϴ�.
	
	
	public static void main(String[] arg) {
		System.out.println(10); // int��
		System.out.println(10); // int��
		System.out.println(12.3); // double��
		System.out.println('a'); // char��
		System.out.println("ȫ�浿"); //String��
		
		
		// �� println ���� �޼ҵ�� �� �� �ְ� ���� �� 10, 12.3, 'a', "ȫ�浿"��  �Ű�������� �� �� �ִ�.
		// ��, ���� ���� �⺻���� �ڵ�鵵 �����ε��̶�� �� �� �ִ�.	
	
	}
	
	
	
	
	
	void add() {}
	void add(int x) {} // �Ű������� ������ �ٸ��� �����ε� ����
	// int add() { } ����Ÿ���� �������.
	
	
	void add(double x) {} // �Űܺ����� Ÿ���� �ٸ��� �����ε� ����
	void add(int x, int y) {} // �Ű������� ������ �ٸ��� �����ε� ����
	
	void add(int x, double y) {} // �Ű������� Ÿ���� �ٸ��� �����ε� ����
	void add(double x, int y) {} // �Ű������� Ÿ���� �ٸ��� �����ε� ����
	
	
}
