//���ٽ� : �޼ҵ带 ������ ������ ǥ��(ȭ��ǥ �Լ�)
//
//Ŭ���� ���� ���� ���ٽ� ��ü�� �޼ҵ� ���� ����
//
//�̸� ���� �Լ�(�޼ҵ�)
//
//�Ϲ� �޼ҵ� ����
//int max(int a, int b){
//   return a > b ? a : b;
//}
//
//���ٽ����� ����, return ��� �� �߰�ȣ ���
//(int a, int b) -> { return a > b ? a : b; }
//
//�� �����ϰ�
//(int a, int b) -> a > b ? a : b;
//
//�� �����ϰ�
//(a, b) -> a > b ? a : b;
//
//�Ű������� �ϳ��� ��� ���� ����
//a -> a * a;
//
//���� ���� ���������� �����Լ����� ����ϱ� ���ؼ��� �Լ��� �������̽��� �ʿ���
//- �߻�޼ҵ�� �ϳ��� �ۼ��Ѵ�.
//- @FunctionalInterface ���
//
//Ÿ�� ���� = (int a, int b) -> a > b ? a : b;  �̷��� �����ϸ� �ش� ������ ���ٽ��� ȣ���� �� ����
//�̶� Ÿ���� ����� ��� �ϴµ� �̸� �Լ��� �������̽���
//
//@FunctionalInterface
//interface Myfunction {
//  public abstrct int max(int a, int b) // public abstract�� ���� ����
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
//   int max(int a, int b); { // public abstract�� ������ ���� 
//        return a > b ? a : b;
//  }
//}
//-------------------------------------------------------------------------
//Myfunction f = new Myfunction(){
//   int max(int a, int b){
//        return a > b ? a : b;
//   }
//} // �͸� Ŭ����, Myfunction�� �������̽� �̹Ƿ� �������̵��� �ʿ���
//
//f.max(1,2);
//
//-------------------------------------------------------------------
//�̸� ���ٽ����� ǥ��
//
//Myfunction f = (int a, int b) -> a > b ? a : b;
//
//f.max(1,2);
//===============================================
//
//class Desc implements Comparator<String>{
//	int compare(String o1, String o2){
//	     return o2.compareTo(o1); // ��������
//  }
//} 
//
//
//// ���� �߰��� �� ����.
//List<String> list = Arrays.asList("aaa", "ccc", "bbb");
//Collections.sort(list, new Desc()) // ����
//
//
//Collections.sort(list, new Comparator<String>(){
//        int compare(String o1, String o2){
//        return o2.compareTo(o1); // ��������
//  }
//}
//
//Collections.sort(list, (s1, s2) -> s2.compareTo(s1));