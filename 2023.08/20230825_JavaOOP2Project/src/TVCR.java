
public class TVCR extends Tv{
	VCR vcr = new VCR();
	
	// ������ �ƴ� ������ �޼ҵ带 �ҷ������� ������ �޼ҵ带 ��������.
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
