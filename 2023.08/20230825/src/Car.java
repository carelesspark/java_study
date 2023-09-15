
public class Car {

	// 속성(변수)
	String color;
	String gearType;
	int door;
	
	
	
	// 생성자
	// 객체를 생성한다.
	// 멤버변수의 초기화(인스턴스 변수)
	// 오버로딩
	// 클래스의 이름과 똑같은 이름으로 만든다.
	// 객체를 생성할 때 딱 한번 호출된다.
	// 기본생성자는 생략이 가능(다만, 생상자 함수가 없을 때만 생략이 가능하고, 생성자가 하나라도 있으면 기본생성자의 생략 불가)
	// 생성자간 호출은 가능 -> this()
	
	//Car(){
		
	//} // 텅 비워져있는 위 생성자를 기본 생성자라고 함, 이러한 기본생성자는 생략이 가능하기에
	// 여지껏 앞에서 쓰지 않았던 이유이기도 하다.

	Car(){		
		this("white", "수동", 2);
	}
	
	Car(String color){		
		this(color, "수동", 2);
	}
	
	Car(String color, String gearType, int door){ // 매개변수로 속성을 넣으면서 생성자함수로 변수를 초기화하겠다는 의미!
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		// this.color = class 자신(멤버 변수), color = 지역 변수
		// this.gearType = class 자신(멤버 변수), gearType = 지역 변수
		// this.door = class 자신(멤버 변수), door = 지역 변수
	} 
	
	
	
	
	
	// 기능(메소드)
	

}
