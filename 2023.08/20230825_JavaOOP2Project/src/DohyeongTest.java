
public class DohyeongTest {
	public static void main(String[] args) {
//		Point p = new Point(10, 20);
//		
//		Circle c = new Circle(p, 5);
//		c.draw();
		
		
//		Point p1 = new Point(10, 20);
//		Point p2 = new Point(5, 10);
//		Point p3 = new Point(30, 15); //Triangle 수정 전 코드

		Point[] p = {
				new Point(10, 20),
				new Point(30, 40),
				new Point(50, 60),
		};	
		
		Point[] p2 = {
				new Point(30, 50),
				new Point(45, 70),
		};
		
//		Triangle t = new Triangle(p1, p2, p3);
		Triangle t = new Triangle(p);
		t.draw();
		
		System.out.println("=================");
		Rectangle r = new Rectangle(p2);
		r.draw();
	}

}
