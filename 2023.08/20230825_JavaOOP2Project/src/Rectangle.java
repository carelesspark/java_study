//
//public class Rectangle{
//	Point[] p = new Point[2];
//		
//	
//	Rectangle(Point[] p) {
//		this.p = p;
//	}
//	
//	
//	void draw() {
//		for(int i = 0; i < p.length; i++) {
//			System.out.println("(" + p[i].x + ", " + p[i].y + ")");
//		}
//		System.out.println("�簢���� �׸��ϴ�.");
//	}
//	
//	
//	
//}


public class Rectangle extends ShapDraw{
	Point[] p = new Point[2];
	
	
	Rectangle(Point[] p) {
		this.p = p;
	}
	
	
	void draw() {
		for(int i = 0; i < p.length; i++) {
			System.out.println("(" + p[i].x + ", " + p[i].y + ")");
		}
		System.out.println("�簢���� �׸��ϴ�.");
	}
	
	
	
}