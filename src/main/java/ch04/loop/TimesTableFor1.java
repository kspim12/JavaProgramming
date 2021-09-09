package ch04.loop;

import java.util.Scanner;

public class TimesTableFor1 {

    public static void main(String[] args) {
        System.out.println("Input multiple table.");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        for ( int i = 1; i < 10; i++ ) {
            System.out.printf("%d * %d = %d\t", dan, i, dan*i);
        }
    }
}
