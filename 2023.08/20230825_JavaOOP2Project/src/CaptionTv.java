// Source �� - Override/Implement Methods : ��� Ȯ��
public class CaptionTv extends Tv {

	// �θ��� ��Ҹ� �ް�
	// �ڽ��� ������ �߰� ��Ҹ� �����Ѵ�.
	
	boolean caption;
	
	void displayCaption(String txt) {
		if(caption) {
			System.out.println(txt);
		}
	}
}
