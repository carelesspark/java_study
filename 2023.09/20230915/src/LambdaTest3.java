import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaTest3 {

	public static void main(String[] args) {
		IntSupplier s = () -> (int) (Math.random() * 100) + 1; // �̷��� �ۼ��ϸ� ���׸� Ÿ���� ������ϴ� �δ��� ������
		IntConsumer c = i -> System.out.print(" " + i + " ");
		IntPredicate p = i -> i % 2 == 0;
		IntUnaryOperator op = i -> i / 10 * 10;

		int[] arr = new int[10];

		
		makeRandomList(s, arr);
		System.out.println(Arrays.toString(arr));		// �迭�� �ε��� ������ ������ Arrays.toString(arr)�� Ȯ��
		printEvenNum(p, c, arr);
		int[] newArr = doSomething(op, arr);
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}

	static void makeRandomList(IntSupplier s, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.getAsInt(); // ������ arr[i]�� ����, ����ȯ �߻�x
		}
	}

	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[ ");

		for (int i : arr) {
			if (p.test(i)) {
				c.accept(i);
			}
		}

		System.out.print(" ]");
	}

	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = op.applyAsInt(arr[i]);
		}

		return newArr;
	}
}
