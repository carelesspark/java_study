
public class Point3D extends Point {
	int z;
	
//	Point3D(){
//		super();	// 부모생성자 호출, super()는 항상 우선순위로 쓰여야함 다만 기본생성자는 생략되어졌기에 super()역시 생략되어왔음
//	} -> 생성자간 호출 관계
	
	// 오버라이딩(재정의)
	// 상속관계에서 부모 메소드를 자식이 재정의
	// 부모와 똑같이 생겼다.
	// 반환타입까지  동일해야한다.
	
	Point3D(int x, int y, int z){
		super(x, y);	// 부모 생성자에 대한 호출
//		this.x = x; // super(x, y);를 통해 부모쪽에서 초기화하게끔 만들었으므로 
		// 굳이 this.x, this. y 초기화를 자식클래스에서 작성 안해도 됌
//		this.y = y;
		this.z = z;
	}
	
	// 역할 분담을 함.
	
	String getLocation() {
		return "x : " + x + " , y : " + y + ", z : " + z;
	}
	
}
