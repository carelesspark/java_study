
public class CarTest {
	public static void main(String[] args) {
	Car c = new Car();	// Car()는 생성자의 호출
	
	System.out.println(c.color);
	System.out.println(c.gearType);
	System.out.println(c.door);
	
	
	System.out.println("===================");
	
	Car c2 = new Car("red");
	System.out.println(c2.color);
	System.out.println(c2.gearType);
	System.out.println(c2.door);
	
	
	System.out.println("===================");
	
	
	Car c3 = new Car("blue", "auto", 4);
	System.out.println(c3.color);
	System.out.println(c3.gearType);
	System.out.println(c3.door);
	
	
	}
	
	
		
	
}
