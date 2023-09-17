//람다식 : 메소드를 간략히 식으로 표현(화살표 함수)
//
//클래스 정의 없이 람다식 자체로 메소드 역할 수행
//
//이름 없는 함수(메소드)
//
//일반 메소드 정의
//int max(int a, int b){
//   return a > b ? a : b;
//}
//
//람다식으로 정의, return 사용 시 중괄호 사용
//(int a, int b) -> { return a > b ? a : b; }
//
//더 간편하게
//(int a, int b) -> a > b ? a : b;
//
//더 간편하게
//(a, b) -> a > b ? a : b;
//
//매개변수가 하나일 경우 가로 생략
//a -> a * a;
//
//위와 같은 람다형식의 무명함수들을 사용하기 위해서는 함수형 인터페이스가 필요함
//- 추상메소드는 하나만 작성한다.
//- @FunctionalInterface 사용
//
//타입 변수 = (int a, int b) -> a > b ? a : b;  이렇게 정의하면 해당 변수로 람다식을 호출할 수 있음
//이때 타입을 만들어 줘야 하는데 이를 함수형 인터페이스임
//
//@FunctionalInterface
//interface Myfunction {
//  public abstrct int max(int a, int b) // public abstract는 생략 가능
//}
//
//Myfunction f = (int a, int b) -> a > b ? a : b;
//int max = f.max(1,2);
//
//================================================
//
//interface Myfunction{
//   public abstract int max(int a, int b);
//}
//
//---------------------------------------------------------------------------
//class Myfunctionlmpl implements Myfunction{
//   int max(int a, int b); { // public abstract는 붙이지 않음 
//        return a > b ? a : b;
//  }
//}
//-------------------------------------------------------------------------
//Myfunction f = new Myfunction(){
//   int max(int a, int b){
//        return a > b ? a : b;
//   }
//} // 익명 클래스, Myfunction는 인터페이스 이므로 오버라이딩이 필요함
//
//f.max(1,2);
//
//-------------------------------------------------------------------
//이를 람다식으로 표현
//
//Myfunction f = (int a, int b) -> a > b ? a : b;
//
//f.max(1,2);
//===============================================
//
//class Desc implements Comparator<String>{
//	int compare(String o1, String o2){
//	     return o2.compareTo(o1); // 내림차순
//  }
//} 
//
//
//// 값을 추가할 수 없다.
//List<String> list = Arrays.asList("aaa", "ccc", "bbb");
//Collections.sort(list, new Desc()) // 정렬
//
//
//Collections.sort(list, new Comparator<String>(){
//        int compare(String o1, String o2){
//        return o2.compareTo(o1); // 내림차순
//  }
//}
//
//Collections.sort(list, (s1, s2) -> s2.compareTo(s1));