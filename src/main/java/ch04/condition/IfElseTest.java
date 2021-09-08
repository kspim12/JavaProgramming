package ch04.condition;

import java.util.Random;

public class IfElseTest {

    public static void main(String[] args) {
        String result = null;
        Random myRandom = new Random();

        System.out.println("big Int? small Int?");
        int num1 = myRandom.nextInt(100);
        if ( num1 >= 50 ) {
            result = "big Integer";
        } else {
            result = "small Integer";
        }
        System.out.printf("%d is %s%n", num1, result);

        System.out.println("even ?");
        int num2 = myRandom.nextInt(10);

        if ( num2 % 2 == 0 ) {
            result = "even";
        } else {
            result = "odd";
        }
        System.out.printf("%d is %s.%n", num2, result);

        result = (num2 %2 == 0 ) ? "even" : "odd";
        System.out.printf("%d is %s.%n", num2, result);
    }
}
