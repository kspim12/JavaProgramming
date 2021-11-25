package ch05.basic;

public class BoundsTest {
    public static void main(String[] args) {
        char [] charArray = new char [3];
        for ( int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (i+'A');
        }
        // int 에는 char를 담을수 있지만 char 에는 int를 못담는다 .
        // int : 4byte , char : 1byte  .. 당연하군
        for ( int i = 0; i < 4; i++) {
            System.out.printf("%d 번째 요소: %c%n", i , charArray[i]);
        }
    }
}
