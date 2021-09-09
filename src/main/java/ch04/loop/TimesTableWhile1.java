package ch04.loop;

import java.util.Scanner;

public class TimesTableWhile1 {

    public static void main(String[] args) {
        System.out.println("Input dan.");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        int i = 1;
        while ( i < 9 ) {
            System.out.printf("%d * %d = %d\t", dan, i, dan*i);
            i++;
        }
        System.out.println();
    }
}
