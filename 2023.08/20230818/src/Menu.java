
public class Menu {
	public static void main(String[] args) {
//		ǰ��: �ѿ� �ɵ�� 	���� : 112500
//		ǰ��: ��ġ ������ 	���� : 25500
//		ǰ��: �ƽ��� ����	���� : 500

		String item1 = "�ѿ� �ɵ��"; int price1 = 112500;
		String item2 = "��ġ ������"; int price2 = 25500;
		String item3 = "�Ž��� ����"; int price3 = 500;
		
		
//		System.out.println("ǰ��: " + item1 + "          ����: " + price1);
//		System.out.println("ǰ��: " + item2 + "          ����: " + price2);
//		System.out.println("ǰ��: " + item3 + "          ����: " + price3);
		
		
		// ���� ���� : %d(����), %s(���ڿ�), %f(�Ǽ�), %c(����)
		
		System.out.printf("ǰ��1: %8s  ����: %-8d\n", item1, price1);
		System.out.printf("ǰ��2: %8s  ����: %-8d\n", item2, price2);
		System.out.printf("ǰ��3: %8s  ����: %-8d", item3, price3);
	}
}
