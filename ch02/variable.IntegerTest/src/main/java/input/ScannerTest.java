package input;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String line = scanner.nextLine();
        System.out.printf("입력한 문자열: %s%n", line);
        System.out.println("정수를 입력하세요.");
        int num1 = scanner.nextInt();
        System.out.printf("입력한 정수: %d%n", num1);
        System.out.println("실수를 입력하세요.");
        double num2 = scanner.nextDouble();
        System.out.printf("입력한 실수: %f%n", num2);
        System.out.println("불리언을 입력하세요.");
        boolean bool = scanner.nextBoolean();
        System.out.printf("입력한 불리언: %b%n", bool);
        scanner.close();
    }
}
