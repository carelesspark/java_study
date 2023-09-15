
public class InternetTv extends Tv {
	boolean internet;
	
	void displayInternet() {
		if(internet) {
			System.out.println("홈페이지 연결 성공");
		} else {
			System.out.println("홈페이지 연결 실패");
		}
	}
}
