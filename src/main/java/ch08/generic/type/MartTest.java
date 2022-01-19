package ch08.generic.type;

import java.util.Date;

class Fruit {}
class Company {}

class Market<P> {
  protected P product;
}
interface Useable<D> {}

class Mart<C, P, D> extends Market<P> implements Useable<D> {
  private C coworker;

  public Mart(C coworker, P product) {
    this.coworker = coworker;
    this.product = product;
  }

  @Override
  public String toString() {
    return "Mart{" +
        "coworker=" + coworker +
        '}';
  }
}

public class MartTest {

  public static void main(String[] args) {
    Mart<Company, Fruit, Date> mart = new Mart<>(new Company(), new Fruit());
    System.out.println(mart);
  }

}
