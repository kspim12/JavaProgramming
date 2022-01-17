package ch08.annotation;

import java.util.Date;

class SomeClass {
  @Deprecated
  public void oldMethod() {}
}

public class DeprecatedTest {

  public static void main(String[] args) {
    SomeClass sc = new SomeClass();
    sc.oldMethod();

    Date date = new Date(2000, 01, 01);
  }

}
