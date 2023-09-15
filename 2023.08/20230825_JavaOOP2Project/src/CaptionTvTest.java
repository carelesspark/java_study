
public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv t = new CaptionTv();
		
		t.channel = 7;
		t.channelUp();
		System.out.println(t.channel);
		
		t.displayCaption("자막처리 중.....");
		t.caption = true;
		t.displayCaption("자막처리 중......");
		
		InternetTv t2 = new InternetTv();
		t2.channel = 11;
		t2.channelDown();
		System.out.println(t2.channel);
		
		t2.displayInternet();
		t2.internet = true;
		t2.displayInternet();

	}

}
