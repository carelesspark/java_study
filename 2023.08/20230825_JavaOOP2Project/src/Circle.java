// ���԰��� -> Point Ŭ�������� ������ ������ ������ ���
// ����� ��� extends�� ���ǵǾ� �ְ�, ������ ���� �������� ����(	���� Point center;�� ���� ��)
//public class Circle {
//	Point center;
//	int r;
//	
//	Circle(Point center, int r){
//		this.center = center;
//		this.r = r;
//	}
//	
//	void draw() {
//		System.out.println("������ (" + center.x + ", " + center.y + ")�̰� �������� " + r + "�� ���� �׸��ϴ�.");
//	}
//}

public class Circle{
	Point center;
	int r;
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("������ (" + center.x + ", " + center.y + ")�̰� �������� " + r + "�� ���� �׸��ϴ�.");
	}
}