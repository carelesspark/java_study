package com.java.lambda;

public class LambdaTest1 {

	static void execute(MyFunction f) {
		f.run();
	}

	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) { // 함수형 인터페이스는 람다식을 사용하기 위해 만들었다.
		MyFunction f1 = () -> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() {

			@Override
			public void run() {
				System.out.println("f2.run()");

			}

		}; // 람다식 전에는 이런 형식으로 사용했어야 함

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute(() -> System.out.println("run()"));

	}

}
