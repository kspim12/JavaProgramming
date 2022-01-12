package ch08.inter.cowork.bteam;

import ch08.inter.cowork.common.Calculator;

public class CalculatorLogicTest {
    public static void main(String[] args) {
        Calculator calcLogic = new CalculatorImpl();
        int result = calcLogic.add(100, 200);
        System.out.printf("결과 확인: %d%n", result);
    }
}
