
public class TVCR extends Tv{
	VCR vcr = new VCR();
	
	// 메인이 아닌 곳에서 메소드를 불러오려면 별도의 메소드를 만들어야함.
	void power() {
		vcr.power();
	}
	
	
	void play() {
		vcr.play();	
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}

}
