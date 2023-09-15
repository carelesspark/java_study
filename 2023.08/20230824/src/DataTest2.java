
public class DataTest2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		change(d); 
		
		System.out.println(d.x);

	}
	static void change(Data d) {  // 이번엔 주소 값을 넘김, 즉 d.x가 1000으로 바뀜
		d.x = 1000;
		System.out.println("chage() : " + d.x);
	}

	
	// 문제 정리하면서 value(값에 의한 호출) vs reference(참조에 의한 호출) 정리하기
}
