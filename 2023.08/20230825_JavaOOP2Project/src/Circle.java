// 포함관계 -> Point 클래스에서 정의한 값들을 가져와 사용
// 상속의 경우 extends가 정의되어 있고, 가져온 값을 정의하지 않음(	밑의 Point center;와 같은 것)
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
//		System.out.println("중점이 (" + center.x + ", " + center.y + ")이고 반지름이 " + r + "인 원을 그립니다.");
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
		System.out.println("중점이 (" + center.x + ", " + center.y + ")이고 반지름이 " + r + "인 원을 그립니다.");
	}
}