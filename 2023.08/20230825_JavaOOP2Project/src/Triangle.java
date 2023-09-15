//
//public class Triangle {
//	Point p1;
//	Point p2;
//	Point p3;
//	
//	Triangle(Point p1, Point p2, Point p3){
//		this.p1 = p1;
//		this.p2 = p2;
//		this.p3 = p3;
//	}
//	
//	void draw() {
//		System.out.println("(" + p1.x + ", " + p1.y + ")");
//		System.out.println("(" + p2.x + ", " + p2.y + ")");
//		System.out.println("(" + p3.x + ", " + p3.y + ")");
//	}
//}


//public class Triangle {
//	Point[] p = new Point[3];
//	
//	Triangle(Point[] p){
//		this.p = p;
//	}
//	
//	void draw() {
//		for(int i = 0; i < p.length; i++) {
//			System.out.println("(" + p[i].x + ", " + p[i].y + ")");
//		}
//		
//		System.out.println("»ï°¢ÇüÀ» ±×·È½À´Ï´Ù.");
//		
//		
//	}
//}

public class Triangle extends ShapDraw{
	Point[] p = new Point[3];
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	void draw() {
		for(int i = 0; i < p.length; i++) {
			System.out.println("(" + p[i].x + ", " + p[i].y + ")");
		}
		
		System.out.println("»ï°¢ÇüÀ» ±×·È½À´Ï´Ù.");
		
		
	}
}
