
public class VarArgsTest {
	public static void main(String[] args) {
		// 가변인자
		// 메소드의 매개변수의 개수를 정하지 않고 사용하겠다.
		// 가변인자 메소드는 오버로딩이 안된다.
		// -> 가변인자 메소드의 경우 String...처럼 매개변수의 개수를 정해놓지 않고 정의했기에, 메소드를 호출할 때 어떤 메소드를 호출해야될지 모호해짐
		// CHAT GPT에 정의한 안되는 이유 노션에 서술
		
		
		concate("a", "b", "c", "d"); // 말 그대로 인자의 개수를 정해놓지 않고 사용하며, 받은 인자들을 배열화 시킴
		concate(new String[] {"1", "2", "3", "a"}); // 배열 형태로 인자를 보내고 싶으면 new String[] {}사용
		
	}
	// 전에 배웠던 내용을 복습하면, 밑에 메소드 코드에 static을 붙이는 이유는 붙이지 않을 경우 위의 main 메소드에서 사용할 수 없기 때문!(클래스 메소드에서 인스턴스 메소드 호출 x)
	
	
	
	static void concate(String... args) { // String[] args <- String 타입의 1차원 배열만 사용 가능한데 String...의 경우 모든 값을 배열화시킬 수 있음
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
	}

}
