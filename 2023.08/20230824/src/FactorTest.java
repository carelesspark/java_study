
public class FactorTest {
	public static void main(String[] args) {
//		int fac = 1;
//		
//		for(int i = 1; i <= 5; i++) {
//			fac *= i;
//		}
//		
//		System.out.println(fac);
		
		int factorial = fac(5);
		System.out.println(factorial);
	}
	
	// ��� ȣ��
	// ���� �ݺ�
	// �Ű� ������ ��������� �����Ѵ�.
	// ���ǹ��� ����Ѵ�.
	// return ���� ����Ѵ�.
	
	// ���ϱ� static void�� ���� return�� �Ⱦ��� �Ű�����
	static int fac(int n) {
		int result = 0;
		
		if(n == 1) {
			return 1;
		} else {
			result = n * fac(n-1);
		}
		return result;
		
	}

}
