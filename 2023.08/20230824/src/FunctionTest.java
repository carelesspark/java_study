	import java.util.Arrays;

public class FunctionTest {
	public static void main(String[] args) {
//		Function fc = new Function();

//		fc.add();
//		fc.add2(1, 2);
//		int sum = fc.add3(6, 4);
//		System.out.println(sum);
//		fc.sub(5, 2);
//		fc.mul(5, 2);
//		fc.div(5, 2);
//		fc.remain(5,2);
////		
//		double sum1 = fc.div1(10, 3);
//		System.out.println(sum1);

//		fc.fun1(9);
//		
//		int result = fc.fun2(3, 6);
//		System.out.println(result);
//		
//		
//		float result2 = fc.div2(10, 0);
//		System.out.println(result2);
//		
//		
//		if(result2 == 0.0f) {
//			System.out.println("�Ű����� ����");
//		}
//		
//		Function2 fc2 = new Function2();
//		
//		fc2.method1();	// ȣ���ϴ� �޼ҵ带 ���� �ϰ� �ִ� ��ġ ã�� Ctrl + ���콺 ��Ŭ��
		
		Function fc = new Function();
		
		int a = 1;
		int b = 2;
		
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println(a + " ," + b);

		fc.defaultArg(a, b);
//		
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println(a + " ," + b);

		int[] arr = {1,2,3,4,5};
		
		System.out.println("�޼ҵ� ȣ����");
		System.out.println(Arrays.toString(arr));
		
//		
		fc.refArg(arr);
		
		System.out.println("�޼ҵ� ȣ����");
		System.out.println(Arrays.toString(arr)); 
//		
		// ���� ������ ���� ���� �ٲ� ������ �ּҰ��� �Ѱ�� �����̴�.
		// �迭�� ��� ������ �ּ� ���� �ѱ�⿡ ���� ������ ���� ������ ���� �� ����?
		
		
	}

}
