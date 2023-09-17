package com.java.enums;

public enum Week {
	MONDAY("������", "��"),
	TUESDAY("ȭ����", "��"),
	WEDNESDAY("������", "�"),
	THURSDAY("�����", "��"),
	FRIDAY("�ݿ���", "��"),
	SATURDAY("�����", "��"),
	SUNDAY("�Ͽ���", "��");
	
	// ����Ÿ���� ��ü
	// �ν��Ͻ� ������ ���� �� �ִ�.
	// �����ڸ� ���� �� �� �ִ�


	private String korean;
	private String chinese;
	
	Week(String korean, String chinese){
		this.korean = korean;
		this.chinese = chinese;
	}
	
	public String getKorean() {
		return korean;
	}

	public String getChinese() {
		return chinese;
	}

}
