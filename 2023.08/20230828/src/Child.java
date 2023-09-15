
public class Child extends Parent {
	int x = 20;
	
	
	
	void method() {
		System.out.println(x);		// 10,	Child에서 x = 20을 정의하면 20
		System.out.println(this.x);		// 10, Child에서 x = 20을 정의하면 20
		System.out.println(super.x);	// 10, this는 나 자신이고 super는 부모클래스 참조
	}
}
