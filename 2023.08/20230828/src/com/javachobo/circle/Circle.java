package com.javachobo.circle;

public class Circle { 

	// ������ ���� public�� �پ��ִ� ���� �� �� ����
	// ������ ���� ������ ����߱⿡ public�� ��� ����
	// �ٸ� �ٸ� ��Ű������ ������ ����ϱ� ������
	// public�� ���̰� ��
	
	public double r;

	public Circle(double r) {
		this.r = r;
	} // �ٸ� ������ ����� �� ������ ������ �ʱ� ���� public�� ������?

	public double getArea() {
		return r * r * 3.14;
	}

}
