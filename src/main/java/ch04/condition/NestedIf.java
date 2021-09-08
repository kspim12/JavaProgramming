package ch04.condition;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input yout age");
        int age = scanner.nextInt();

        System.out.println("Is accompanied ? ");
        boolean withParent = scanner.nextBoolean();

        if ( age >= 12 ) {
            result = "allowed";
        } else {
            if ( withParent ) {
                result = "blocked but accompanied, possible";
            } else {
                result = "blocked ";
            }
        }
        System.out.printf("age : %d, accompanied : %b, result : %s",
                age, withParent, result);
        scanner.close();

    }
}
