package ch04.loop;

public class TimesTableWhile2 {

    public static void main(String[] args) {

        int i = 1;
        while ( i <= 9 ) {
            System.out.printf("%d dan : ", i);
            int j = 1;
            while ( j <= 9 ) {
                System.out.printf("%d * %d = %d\t", i, j, i*j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
