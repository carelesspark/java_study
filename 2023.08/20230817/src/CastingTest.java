
public class CastingTest {

	public static void main(String[] args) {
		// ����ȯ(Casting)
		// boolean�� ����
		// Ÿ���� �ٸ� Ÿ������ �����ϴ� ��
		// �ڵ�����ȯ, ��������ȯ
		/// ------------------------------------> �ڵ�����ȯ
//		byte < short < int < long < float < double 
//			char
		// ��������ȯ <------------------------------
		
		int i = 30;
		byte b = (byte)i; // ��������ȯ
		System.out.println(b);
		
		int i2 = 300;
		byte b2 = (byte)i2; // byte�� ��� -128~127���� ���� ���� �� ����, �� 300�� �� ���ð� �� �ս��� �߻���
		System.out.println(b2);
		
		byte b3= 30;
		int i3 = b3;
		
		System.out.println(i3); // �ڵ�����ȯ
		
		// byte <-> char , short <-> char 
		// �ڵ�����ȯ �Ұ�, ��������ȯ�� ����
		
		byte b4 = 97;
		char c = (char)b4;
		
		System.out.println(c);
		
		char c2 = 'a';
		short s = (short)c2;
		System.out.println(s);
		
		int i4 = 10;
		double d = i4;
		System.out.println(d);
		
		double d2 = 10.3;
		int i5 = (int)d2;
		System.out.println(i5);
	}
}
