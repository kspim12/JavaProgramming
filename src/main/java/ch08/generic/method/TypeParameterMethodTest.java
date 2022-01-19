package ch08.generic.method;

public class TypeParameterMethodTest<T> {

  T some;

  public TypeParameterMethodTest(T some) {
    this.some = some;
  }

  public <P> void method1(P p) {
    System.out.println("클래스 레벨의 T" + some.getClass().getName());
    System.out.println("파라미터: " + p.getClass().getName());
  }

  public <P> P method2(P p) {
    System.out.println("클래스 레벨의 T" + some.getClass().getName());
    System.out.println("파라미터: " + p.getClass().getName());
    return p;
  }

  public static void main(String[] args) {
    TypeParameterMethodTest<String> tpmt = new TypeParameterMethodTest<>("Hello");

    tpmt.method1(10);
    tpmt.<Long>method2(20L);
  }

}
