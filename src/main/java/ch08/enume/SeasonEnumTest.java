package ch08.enume;


enum Season{
  SPRING, SUMMER, FALL, WINTER // 각각 0, 1, 2, 3의 ordinal 값을 가짐
}

public class SeasonEnumTest {
  public void compareEnum(Season season) {
    if ( season.equals(Season.SPRING)) {
      System.out.println("따뜻한 봄날입니다.");

    } else if ( season.compareTo(Season.WINTER) < 0) {
      System.out.println("최소한 겨울은 아니잖아요.");
    } else {
      System.out.println(season.compareTo(Season.WINTER));
    }
  }

  public void enumSwitch(Season season) {
    switch(season) {
      case SPRING:
        System.out.println("새 잎이 나는 시기");
        break;
      case SUMMER:
        System.out.println("열매가 무르 익는 시기");
        break;
      case FALL:
        System.out.println("잎이 떨어지는 시기");
        break;
      default:
        System.out.println("겨울잠을 자는 시기");
    }
  }

  public static void main(String[] args) {
    SeasonEnumTest set = new SeasonEnumTest();
    set.compareEnum(Season.FALL);
    set.enumSwitch(Season.SPRING);
  }

}
