
public class TVCRTest {
	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		
		tvcr.channel = 30;
		tvcr.channelUp();
		
		System.out.println(tvcr.channel);
		
		tvcr.power();
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();	
	}

}
