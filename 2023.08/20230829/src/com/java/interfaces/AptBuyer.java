package com.java.interfaces;

public class AptBuyer {
	
	// ����ڴ� ���� Ŭ������ � ������ �ʿ����. �ٸ� 
	// ����Ʈ ������ ���� �� �ʿ� ���� �߰��� �ִ� �ε��� ����(�������̽�)�� ���� �鿩�� �� �� �ִ�.
	Info aptinfo;	// �� �κ��� �ٽ� �����غ���, �������̽��� �̟G�� �� ��������
					// ���߿� DB ������ �� ���� ���Ǵ� ����
	
	void setAptinfo(Info aptinfo) {
		this.aptinfo = aptinfo;
	}
	

	void aptInfo() {
		aptinfo.price();
		aptinfo.size();
	}
}
