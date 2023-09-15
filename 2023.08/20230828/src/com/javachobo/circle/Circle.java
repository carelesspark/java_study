package com.javachobo.circle;

public class Circle { 

	// 기존에 없던 public이 붙어있는 것을 알 수 있음
	// 기존엔 같은 폴더에 사용했기에 public이 없어도 됐음
	// 다만 다른 패키지에서 가져다 사용하기 때문에
	// public을 붙이게 됌
	
	public double r;

	public Circle(double r) {
		this.r = r;
	} // 다른 곳에서 사용할 때 문제가 생기지 않기 위해 public을 붙힌다?

	public double getArea() {
		return r * r * 3.14;
	}

}
