package com.java.enums;

public enum Week {
	MONDAY("월요일", "月"),
	TUESDAY("화요일", "火"),
	WEDNESDAY("수요일", "水"),
	THURSDAY("목요일", "木"),
	FRIDAY("금요일", "金"),
	SATURDAY("토요일", "土"),
	SUNDAY("일요일", "日");
	
	// 열거타입의 객체
	// 인스턴스 변수를 가질 수 있다.
	// 생성자를 정의 할 수 있다


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
