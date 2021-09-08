package ch04.condition;

import java.util.Scanner;

public class DayByMonthTest {

    public static void main(String[] args) {

        System.out.println("Input a month by 1 ~ 12.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 2:
                days = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default :
                days = 31;
        }
        System.out.printf("%d month is in %d day", month, days);
        scanner.close();

    }
}
