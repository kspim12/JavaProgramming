package ch04.loop;

public class LabelTest {

    public static void main(String[] args) {
        outer: for (int i = 1; i < 10; i++ ) {
            inner : for ( int j = 1; j < 10 ; j++ ) {
                if ( j == 5 ) {
//                    break;
                    //break inner;
//                    break outer;
//                    continue;
                    continue inner;
                    //continue outer;
                }
                System.out.printf("%d*%d=%d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
