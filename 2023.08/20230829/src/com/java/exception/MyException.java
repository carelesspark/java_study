package com.java.exception;
												// ���� ���� Ŭ������ ���� �� Exception Ŭ������ ���� ��ӹ޴´�.
public class MyException extends Exception {	// �� Ŭ������ ���� try/catch���� ���ǰ�, �� Ŭ������ �ڹٰ� ���� �� �ƴ� ���� ���� ���� Ŭ���� �̹Ƿ�
	MyException(){								// �� Ŭ������ ���� ���� �߻�x, throw�� �̿��� ���ܰ� �߻��ǰԲ� ����
		super("���� ���� ���� Ŭ����");
	}

}
