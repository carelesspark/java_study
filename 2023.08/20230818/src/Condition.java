
public class Condition {
	public static void main(String[] args) {
		
		
		// 조건문 
		// if, swtich ~ case
		
//		if(조건식(true or false)) {
//			실행문
//		} else {
//			실행문
//		}	
		
//		int age = 21;
//		
//		if(age >= 20) {
//			System.out.println("성인 입니다.");
//		} else {
//			System.out.println("성인이 아닙니다.");
//		}

		
//		int score = 40;
//		if(score >= 60) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격 입니다.");
//		}
		
//		int choice = 3;
//		
//		if(choice == 1) {
//			System.out.println("인형 선물");
//		} else if(choice == 2) {
//			System.out.println("핸드폰 선물");
//		} else if(choice == 3) {
//			System.out.println("자동차 선물");
//		} else if(choice == 4) {
//			System.out.println("집 선물");
//		} else if(choice == 5) {
//			System.out.println("음식 선물");
//		} else {
//			System.out.println("꽝");
//		}
		
	
		// 중첩 if문
//		if(조건문) {
//			if(조건식) {
//			
//			} else if(조건식) {
//				
//			}
//		} else {
//			
//		}
//		
		
		int x = 7;
		
		if(x % 2 == 0) {
			if(x % 3 == 0) {
				System.out.println(x + "은 2와 3의 공배수 입니다.");
			}
		} else {
			System.out.println(x + "은 2와 3의 공배수가 아닙니다.");
		}
		
		
		
		
		
	}
}
