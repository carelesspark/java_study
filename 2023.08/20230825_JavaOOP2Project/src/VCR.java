
public class VCR {
	boolean power;
	int counter = 0;
	
	
	void power() {
		System.out.println("전원");
	}
	
	void play() {
		System.out.println("시작");		
	}
	
	void stop() {
		
		System.out.println("멈춤");		
	}
	
	void rew() {
		
		System.out.println("뒤로 감기");		
	}
	
	void ff() {
		System.out.println("앞으로 감기");		
		
	}
}
