
public class DataTest3 {

	public static void main(String[] args) {
//		Data d = new Data();
//		d.x = 10;
//		
//		System.out.println(d.x);
//		
//		Data d2 = copy(d);
//		
//		System.out.println(d.x);
//		System.out.println(d2.x);
//		
//	}
//	static Data copy(Data d) {
//		System.out.println("메서드 호출(copy): " + d.x);
//		
//		Data tmp = new Data();
//		
//		tmp.x = 100;
//		System.out.println("메서드 호출(tmp): " + tmp.x);
//		
//		return tmp;
//	}
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		Data d2 = copy(d);
		
		System.out.println(d.x);
		System.out.println(d2.x);
		
	}
	static Data copy(Data d) {
		System.out.println("메서드 호출(copy): " + d.x);
		
		Data tmp = new Data();
		
		tmp.x = 100;
		System.out.println("메서드 호출(tmp): " + tmp.x);
		
		d.x = tmp.x;
//		
		return tmp; // return 했기 때문에 끝날 때 지역변수가 소멸되지 않고 값을 넘길 수 있음
	}	// 반환타입을 레퍼런스 방식으로 
	

}
