
public class Operator {

	public static void main(String[] args) {
		// ������
		// ���׿�����, ���׿�����, ���׿�����
		// ���������(+,-,*,/,%)
//		
//		int x = 5, y = 2;
//		
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		System.out.println(x % y);
//		
//		System.out.println("���̴� " + 10 + "�� �Դϴ�.");
//		
//		
//		// �ڵ�����ȯ(���� �°�)
//		// int������ ���� Ÿ���� �����ϸ� ������ int������ �ٲ��
//		// int������ ũ�� ūŸ���� ���� ����ȯ
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = (byte)(b1 + b2); // byte + byte = int +;
//		
//		System.out.println(result);
//		
//		int i = 100;
//		float f = 12.5F;
//		float result2 = i + f; //int + float //int float -> float + float
//		System.out.println(result2);
				
		// ���׿�����
		// ++, -- (�߰�������)���� 1 ����, 1 ����
		// �������� ���밡��
		// ��ġ, ��ġ
		
//		int x = 10;
//		int y = 0;
//		
//		y = ++x + 10;
//		
//				System.out.println("x =  " + x + " y =" + y );
		
//		int x = 2;
//		int result = x * x * x;
//		
//		System.out.println(result);
		
//		int x = 1;
//		int y = 0;
//		
//		y = x * x - 3 * x + 7;
//		System.out.println(y);
		
		// �񱳿�����
		// <, >, <=, >=, ==, !=
		// ����� true or false
		
//		int x = 10;
//		int y = 20;
////		
//		boolean result = x > y;
//		System.out.println(result);
//		
//		
//		result = x == y;
//		System.out.println(result);
//		
//		result = x != y;
//		System.out.println(result);
		
		// ��������
		// &&, ||, !
		// ������ ����ؼ� ����
		// &&�� �־��� �� �� ��� true������ true, ||�� �־��� �� �� �ϳ��� true�� true
		// !�� �ݴ�� true->false, false->true
		
//		int x = 10;
//		int y = 20;
//		int z = 35;
//		
//		boolean result = x == 10 && y == 20 && z == 35;
//		System.out.println(result);
//		
//		
//		result = x != 10 && y == 10;
//		System.out.println(result);
//		
//		result = x == 20 || y == 20;
//		System.out.println(result);
//		
//		boolean a = false;
//		a = !a;
//		System.out.println(a);
//		
		
//		int x = 5;
//		boolen result = x >= 1 && x <= 10; <-  1 <= x <= 10
//		
//		System.out.println(result);
		
//		int x = 5;
//		boolean result = x <= 5 || x >= 11; <-  x <= 5 or x >= 11
//		System.out.println(result);
		
		// ���׿����� ( ���ǿ����� )
		// ���ǽ� ? ���1 : ���2
		
//		int x = 10;
//		int y = 20;
//		
//		int result = x > y ? x : y;
//		System.out.println(result);
		
		
//		int x = -5;
//		
//		int result =  x > 0 ? x : -x;
//		System.out.println(result);
		
		// ���Կ�����
		// ������ ���� �Ҵ��ϴ� ������
		// �켱���� ���� ���� 
		// = (�ܼ� ���� ������)
		// +=, -=, *=, /= : ���մ��Կ�����
		
		
//		int x;
//		x = 10;
//		
//		int y = 20;
//		y += 10;
//		System.out.println(y);
		
//		int x = 10;
//		int y = 20;
//		
//		y += x + 30;
//		System.out.println(y);
		
		
//		int money = 65245;
//		int total = 0;
//		
//		System.out.println("�������� : " + money / 50000 + "��");
//		
//		money %= 50000;
//		
//		System.out.println("������ : " + money / 10000 + "��");
//		
//		money %= 10000;
//		
//		System.out.println("��õ���� : " + money / 5000 + "��");
//		
//		money %= 5000;
//		
//		System.out.println("õ���� : " + money / 1000 + "��");
//		System.out.println("����� : " + money / 500 + "��");
//		System.out.println("��� : " + money / 100 + "��");
//		
//		money %= 100;
//		
//		System.out.println("�Ͽ� : " + money / 1 + "��");
		
//		double sum = 0;
//		
//		int euro = 58;
//		int dollar = 32;
//		
//		double exchange1 = euro * 1320.48026;
//		double exchange2 = dollar * 1063.82979;
//		
//		sum = exchange1 + exchange2;
//		
//		System.out.println("58���θ� ȯ���ϸ� " + exchange1 + "���̰�,");
//		System.out.println("32�޷��� ȯ���ϸ� " + exchange2 +"�� �Դϴ�.");
//		System.out.println("���� �հ�ݾ��� " + (String.format("%.2f", sum)) + "�� �Դϴ�.");
		
		// �ٱ��� �ϳ��� 10���� ����� ���� �� �ִ�.
		// �׷� �ٱ��ϴ� ��� �ʿ��ұ��?
		
//		int apple = 153;
//		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1 ;
//		
//		System.out.println("��� " + apple + "���� ��� ���ؼ��� �ٱ��� " + basket + "���� �ʿ��ϴ�.");
		
//		int basket2 = 10;
		
//		if(apple % 10 == 0) {
//			System.out.println("��� " + apple + "���� ��� ���ؼ��� �ٱ��� " + apple/basket2 + "���� �ʿ��ϴ�.");
//		} else {
//			System.out.println("��� " + apple + "���� ��� ���ؼ��� �ٱ��� " + (apple/basket2+1) + "���� �ʿ��ϴ�.");
//		}
		
		
		
//		double avg = 87.6454;
//		// 87.6754 -> 87.7
//		// 87.6454 -> 87.6
//		
//		// ���� �� Ǯ��
//		double round = (int)(avg * 100) % 10 >= 1 && (int)(avg * 100) % 10 <= 4 ? (int)(avg * 10)/10.0 : (int)(avg * 10)/10.0 + 0.1;
//
//
//		System.out.println(round);
//		
//		
//		// �ٸ� Ǯ��
//		double avg2 = 87.6754;
//
//		avg2 = (int)(avg2 * 10 + 0.5) / 10.0;
//		
//		System.out.println(avg2);
//		
//		double d = 3.14152668;
//		System.out.printf("%.3f", d);
		
		
		
	}

}
