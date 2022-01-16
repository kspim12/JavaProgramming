package ch08.enume;

public class InnerEnumTest {

  enum MyEnum {
    DATE, BIRTH_DATE
  }

  public static void main(String[] args) {
    System.out.println(MyEnum.DATE);
  }

}

class OuterClass {
  public void useInnerEnum() {
    System.out.println(InnerEnumTest.MyEnum.BIRTH_DATE);
  }
}
