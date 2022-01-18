package ch08.generic.type;

class Toy {}
class Grocery{}

class NormalBox{
  private Object some;
  public Object getSome() {
    return some;
  }

  public void setSome(Object some) {
    this.some = some;
  }
}


public class NormalBoxTest {

  public static void main(String[] args) {
    NormalBox nBox1 = new NormalBox();
    nBox1.setSome(new Toy());
    Object some = nBox1.getSome();
    if ( some instanceof Toy ) {
      Toy toy = (Toy)some;
    } else if ( some instanceof Grocery ) {
      Grocery grocery = (Grocery) some;
    } else {
      System.out.println("알수 없음");
    }
  }
}
