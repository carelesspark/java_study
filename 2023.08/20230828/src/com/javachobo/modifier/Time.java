package com.javachobo.modifier;

public class Time {
	// 접근 제어자
	// 클래스간 참조 범위( 기준의 패키지의 위치) 
	// public > protected > default > private
	
	// public : 모든 패키지의 클래스에서 사용
	// protected : 동일 패캐지의 클래스와 다른 패키지라도 상속 관계가 있는 클래스
	// default : 동일 패키지의 클래스
	// private : 자기 자신에서만(자기 클래스에서만)사용가능
	
//	class : public, deafult
//	멤버변수 : public, protected, default, private
//	메소드 : public, protected, default, private
//	생성자 : public, protected, default, private
	
//	public int hour;
//	public int minute;
//	public int second; // 외부에서 접근가능

	// 정보의 은닉
	private int hour;
	private int minute;
	private int second;
	
//	int hour;	// default인데 생략이 되어있음
//	int minute;
//	int second;
	
	
	// getter/setter
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("유효한 범위가 아닙니다.");
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
