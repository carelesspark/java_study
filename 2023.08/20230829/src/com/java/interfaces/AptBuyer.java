package com.java.interfaces;

public class AptBuyer {
	
	// 사용자는 실제 클래스가 어떤 것인지 필요없다. 다만 
	// 아파트 정보를 직접 볼 필요 없이 중간에 있는 부동산 업자(인터페이스)를 통해 들여다 볼 수 있다.
	Info aptinfo;	// 이 부분은 다시 공부해보기, 인터페이스를 이욯해 값 가져쓰기
					// 나중에 DB 공부할 때 자주 사용되는 형식
	
	void setAptinfo(Info aptinfo) {
		this.aptinfo = aptinfo;
	}
	

	void aptInfo() {
		aptinfo.price();
		aptinfo.size();
	}
}
