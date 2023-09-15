
public class CastingTest {

	public static void main(String[] args) {
		// 형변환(Casting)
		// boolean은 제외
		// 타입을 다른 타입으로 변형하는 것
		// 자동형변환, 강제형변환
		/// ------------------------------------> 자동형변환
//		byte < short < int < long < float < double 
//			char
		// 강제형변환 <------------------------------
		
		int i = 30;
		byte b = (byte)i; // 강제형변환
		System.out.println(b);
		
		int i2 = 300;
		byte b2 = (byte)i2; // byte의 경우 -128~127까지 값을 받을 수 있음, 즉 300을 다 못봤고 값 손실이 발생함
		System.out.println(b2);
		
		byte b3= 30;
		int i3 = b3;
		
		System.out.println(i3); // 자동형변환
		
		// byte <-> char , short <-> char 
		// 자동형변환 불가, 강제형변환만 가능
		
		byte b4 = 97;
		char c = (char)b4;
		
		System.out.println(c);
		
		char c2 = 'a';
		short s = (short)c2;
		System.out.println(s);
		
		int i4 = 10;
		double d = i4;
		System.out.println(d);
		
		double d2 = 10.3;
		int i5 = (int)d2;
		System.out.println(i5);
	}
}
