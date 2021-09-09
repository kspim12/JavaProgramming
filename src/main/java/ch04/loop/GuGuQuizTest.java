package ch04.loop;

import java.util.Random;
import java.util.Scanner;

public class GuGuQuizTest {

    public static void main(String[] args) {
        System.out.println("Answer gugudan quiz. (Stop : 0)");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while ( true ) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;

            System.out.printf("%d * %d = %n", num1, num2);

            //왜 ??
            // System.out.printf("test")
            // int result = scanner.nextInt();
            // test 가 input 받기 전에 출력이 안됨 ;;
            int result = scanner.nextInt();
            if ( result == 0 )
                break;
            else {
                if ( result == num1 * num2 ) {
                    System.out.println("You are correct");
                } else {
                    System.out.println("You are wrong, the answer is " + num1 * num2);
                }
            }
        }
        scanner.close();
    }
}
