package ch08.inter.cowork.bteam;

import ch08.inter.cowork.common.Calculator;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        System.out.printf("파라미터 확인: %d, %d%n", a, b);
        return a+b;
    }
}
