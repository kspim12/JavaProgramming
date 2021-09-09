package ch04.loop;

public class BreakTest {

    public static void main(String[] args) {

        System.out.println("What is the smallest number that sqrt is bigger than 1000");
        int i = 0;
        while(true ) {
            if ( Math.pow(i, 2) > 1000 ) {
                break;
            }
            i++;
        }
        System.out.println((--i));
    }
}
