
public class Point {
	int x;
	int y;

	Point(){	// 기본생성자 생략
		super();
	}
	Point(int x, int y){
		this.x = x;	
		this.y = y;
	}
	
	
	String getLocation() {
		return "x : " + x + " , y : " + y;
	}
}
