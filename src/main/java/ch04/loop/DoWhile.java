package ch04.loop;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.printf("Input sqrt num.(stop : 0)%n");
            i = scanner.nextInt();
            System.out.printf("%d sqrt : %f%n", i, Math.sqrt(i));
        } while ( i > 0 );
    }
}
