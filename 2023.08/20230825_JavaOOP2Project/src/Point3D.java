
public class Point3D extends Point2{
	int z;
	
	String getLocation() {
		return "x : " + x + " , y : " + y;
	}
	// 오버라이딩 : 보통 상속 구조에서 나타나는데 부모 클래스에서 정의한 메소드를 자식 클래스에서도 동일하게 메소드를 정의하는 것을 의미한다.
}
