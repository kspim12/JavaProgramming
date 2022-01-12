package ch08.inter.cowork.ateam;

import ch08.inter.cowork.bteam.CalculatorImpl;
import ch08.inter.cowork.common.Calculator;

import java.util.Scanner;

class CalculatorStub implements Calculator {

    @Override
    public int add(int a, int b) {
        System.out.printf("파라미터 확인: %d, %d%n", a, b);
        return 0;
    }
}

class CalculatorClient {
    Calculator calLogic = new CalculatorImpl();

    public void add() {
        System.out.println("첫 번째 정수를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하시오.");
        int b = scanner.nextInt();
        System.out.printf("결과: %d+%d=%d%n", a, b, calLogic.add(a, b));
    }
}


public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorClient client = new CalculatorClient();
        client.add();
    }
}
