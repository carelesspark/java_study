import java.util.Arrays;

public class Function {
	// �Ӽ�

	// ���(�޼ҵ�)

	// ����Ÿ�� �޼ҵ��̸�([�Ű�����1, �Ű�����2...]){
	// �ؾ��� �� (���๮)

	// [return �����ް� ���� ��]

	// }

	// ����Ÿ�� : void, �⺻��Ÿ��(8��), ������, �⺻��Ÿ���� �����ϸ� ������
	// �޼ҵ� �̸� : �۸�
	// �Ű��м� : (int x, int y)
	// ���๮ : System.out.print("Hello")
	// return : ���ϰ�

	void add() { // �޼ҵ� ����
		System.out.println(3 + 4);

	}

	void add2(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	int add3(int a, int b) {
		int sum = a + b;
		return sum;
	}

	void sub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	void mul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	void remain(int a, int b) {
		System.out.println(a + " % " + b + " = " + (a % b));
	}

	double div1(int a, int b) {
		double result = a / (double) b;
		return result;
	}

	// return
	// �޼ҵ��� ����(��������)
	// void�� ���

	void fun1(int x) {	

		if (x < 10) {
			System.out.println("�޼ҵ� ���� ����");
			return;
		}

		System.out.println(x);
	}

//	int fun2(int x, int y) { // �̷� ��� if ���� �������� ���ϸ� return�� ���� �Ǵ�!
//		if(x > y) {
//			return x;
//		}
//	}

	int fun2(int x, int y) {
//		if( x > y ) {
//			return x;
//		} else {
//			return y;
//		}

		if (x > y) { // else �Ⱦ��� �ٷ� return y;
			return x;
		}
		return y;

	}
	
	// �Ű������� ��ȿ�� �˻�
	float div2(int a, int b) {
		
		// ������ �� �� ������ 0���� ������ �ȵȴ�.
		
		if(b == 0) {
			return 0;
		}
		return a / (float)b;
		
		
	}
	
	
	void defaultArg(int a, int b) {
		a = 100;
		b = 200;
		System.out.println(a + " ," + b);
	}
	
	void refArg(int[] arr) { // void�ϱ� ���� ��ȭ�� ���� �ʴ´�?? <- �̰� �˾ƺ���
		arr[0] = 100;
		System.out.println("refArg���� ���");
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	

}
