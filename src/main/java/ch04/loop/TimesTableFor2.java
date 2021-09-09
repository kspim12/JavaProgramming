package ch04.loop;

public class TimesTableFor2 {

    public static void main(String[] args) {
        for ( int i = 1; i <= 9; i++ ) {
            System.out.print(i + " dan: " );
            for ( int j = 1; j <= 9; j++ ) {
                System.out.printf("%d * %d = %d \t", i, j, i*j);
            }
            System.out.println();
        }
    }
}
