
public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv t = new CaptionTv();
		
		t.channel = 7;
		t.channelUp();
		System.out.println(t.channel);
		
		t.displayCaption("�ڸ�ó�� ��.....");
		t.caption = true;
		t.displayCaption("�ڸ�ó�� ��......");
		
		InternetTv t2 = new InternetTv();
		t2.channel = 11;
		t2.channelDown();
		System.out.println(t2.channel);
		
		t2.displayInternet();
		t2.internet = true;
		t2.displayInternet();

	}

}
