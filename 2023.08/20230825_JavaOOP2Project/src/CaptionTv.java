// Source 탭 - Override/Implement Methods : 상속 확인
public class CaptionTv extends Tv {

	// 부모의 요소를 받고
	// 자식은 별도의 추가 요소를 구성한다.
	
	boolean caption;
	
	void displayCaption(String txt) {
		if(caption) {
			System.out.println(txt);
		}
	}
}
