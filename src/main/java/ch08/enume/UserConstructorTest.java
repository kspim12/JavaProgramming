package ch08.enume;

enum Family {
  FATHER("아빠"),MOTHER("엄마"),SON("dkemf"),DAUGHTER("딸");
  private String kor;

  Family(String kor) {
    this.kor = kor;
  }

  public String getKor() {
    return kor;
  }

  public void setKor(String kor) {
    this.kor = kor;
  }
}

public class UserConstructorTest {

  public static void main(String[] args) {
    Family current = Family.MOTHER;
    System.out.printf("값 확인: %s, kor:%s%n", current, current.getKor());
    current.setKor("어머니");
    System.out.printf("값 확인: %s, kor:%s%n", current, current.getKor());
  }

}
