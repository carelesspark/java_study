//import com.javachobo.circle.Circle;
import com.javachobo.circle.*; // *�� ��Ű�� ���� ��� Ŭ������ �� ����ϰڴٶ�� �ǹ�
// ������ ����� ǥ���� ���� *�� ������� ����

import static java.lang.Math.*;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		double area = c.getArea();
		System.out.println(area);
			
//		System.out.println(Math.random()); 
		// Math���� ������� ��κ� static��
		// Math�� ��� import�� ���� �ʾƵ� ��밡���ϴ�.
		// ������ ��ó�� import ���� ���
		System.out.println(random());
		// �̷������� ����� �� �ִ�.
		
	}
}
