package ch08.inter.method;

interface StaticMethodInterface {
  static void staticMethod() {
    System.out.println("Static 메서드");
  }
}
public class StaticMethodTest {

  public static void main(String[] args) {

    StaticMethodInterface.staticMethod();
  }
}
