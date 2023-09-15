package com.javachobo.modifier;

public class Time {
	// ���� ������
	// Ŭ������ ���� ����( ������ ��Ű���� ��ġ) 
	// public > protected > default > private
	
	// public : ��� ��Ű���� Ŭ�������� ���
	// protected : ���� ��ĳ���� Ŭ������ �ٸ� ��Ű���� ��� ���谡 �ִ� Ŭ����
	// default : ���� ��Ű���� Ŭ����
	// private : �ڱ� �ڽſ�����(�ڱ� Ŭ����������)��밡��
	
//	class : public, deafult
//	������� : public, protected, default, private
//	�޼ҵ� : public, protected, default, private
//	������ : public, protected, default, private
	
//	public int hour;
//	public int minute;
//	public int second; // �ܺο��� ���ٰ���

	// ������ ����
	private int hour;
	private int minute;
	private int second;
	
//	int hour;	// default�ε� ������ �Ǿ�����
//	int minute;
//	int second;
	
	
	// getter/setter
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("��ȿ�� ������ �ƴմϴ�.");
			return;
		}
		this. hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
