
public class CardTest {
	public static void main(String[] args) {
		
//		Card.cv = 30;
//		System.out.println(Card.cv);
//		
//		Card c = new Card();
//		c.iv = 10;
//		c.cv = 20;
////		
//		System.out.println(c.iv);
//		System.out.println(c.cv);

//		Card c1 = new Card();
//		Card c2 = new Card();
//		
//		c1.iv = 10;
//		c2.iv = 20;
//		
//		System.out.println(c1.iv);
//		System.out.println(c2.iv);
//		
//		
//		Card.cv = 30;
//		
//		System.out.println(c1.cv);
//		System.out.println(c2.cv);
//		
//		c1.cv = 40;
//		
//		System.out.println(c1.cv);
//		System.out.println(c2.cv);
		
		// 동일한 타입으로 생성된 객체는 값을 공유하기에 Card.cv로 값을 정해도
		// c1, c2 역시 값이 똑같으며 c1.cv로 값을 지정해도 c2 역시 똑같다.
		
		
		
		
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.pattern = "spade";
		c1.num = 1;
		
		c2.pattern = "clover";
		c2.num = 10;
		
		System.out.println(c1.pattern + "/" + c1.num + "/" + c1.width + "/" + c1.height);;
		System.out.println(c2.pattern + "/" + c2.num + "/" + c2.width + "/" + c2.height);;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
