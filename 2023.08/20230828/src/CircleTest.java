//import com.javachobo.circle.Circle;
import com.javachobo.circle.*; // *는 패키지 내의 모든 클래스를 다 사용하겠다라는 의미
// 보통은 명시적 표현을 위해 *를 사용하지 않음

import static java.lang.Math.*;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		double area = c.getArea();
		System.out.println(area);
			
//		System.out.println(Math.random()); 
		// Math내의 멤버들은 대부분 static함
		// Math의 경우 import를 하지 않아도 사용가능하다.
		// 하지만 위처럼 import 해줄 경우
		System.out.println(random());
		// 이런식으로 사용할 수 있다.
		
	}
}
