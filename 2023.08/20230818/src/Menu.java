
public class Menu {
	public static void main(String[] args) {
//		품명: 한우 꽃등심 	가격 : 112500
//		품명: 참치 선물팩 	가격 : 25500
//		품명: 맥스봉 한팩	가격 : 500

		String item1 = "한우 꽃등심"; int price1 = 112500;
		String item2 = "참치 선물팩"; int price2 = 25500;
		String item3 = "매스봉 한팩"; int price3 = 500;
		
		
//		System.out.println("품명: " + item1 + "          가격: " + price1);
//		System.out.println("품명: " + item2 + "          가격: " + price2);
//		System.out.println("품명: " + item3 + "          가격: " + price3);
		
		
		// 형식 문자 : %d(정수), %s(문자열), %f(실수), %c(문자)
		
		System.out.printf("품명1: %8s  가격: %-8d\n", item1, price1);
		System.out.printf("품명2: %8s  가격: %-8d\n", item2, price2);
		System.out.printf("품명3: %8s  가격: %-8d", item3, price3);
	}
}
