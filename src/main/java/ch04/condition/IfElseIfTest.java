package ch04.condition;

import java.util.Scanner;

public class IfElseIfTest {

    public static void main(String[] args) {
        System.out.println("Input Integer between 32 ~ 126 ");
        Scanner scanner = new Scanner(System.in);
        int scanned = scanner.nextInt();
        String type = null;
        if ( scanned >= 48 && scanned < 58 ) {
            type = "Integer";
        } else if ( scanned >= 66 && scanned < 91 ) {
            type = "Capital Character";
        } else if ( scanned >= 92 && scanned < 123 ) {
            type = "Little Character";
        } else {
            type = "etc.";
        }
        System.out.printf("Integer %d Is Charatered in %c and %s.%n", scanned, scanned, type);
        scanner.close();
    }
}
