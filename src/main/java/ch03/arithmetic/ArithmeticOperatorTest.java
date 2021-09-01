package ch03.arithmetic;

public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        // 나누기와 나머지 연산자의 차이
        System.out.println(10 / 3);     // 3: 몫
        System.out.println(10 % 3 );    // 1 : 나머지

        // 연산 시의 형변환에서 int 이하의 피연산자끼리 연산은 최소 단위가 int
        //        byte b1 = 10;
        //        byte b2 = 20;
        //        //byte b3 = b1 + b2;
        //        //Type mismatch: cannot convert from int to byte
        //
        //        //연산시의 형변환 - int 이상의 피연산자 타입으로 형변환
        //        int i1 = 100;
        //        long l1 = 200;
        //        // int i2 = i1 + l1;
        // Type mismatch: cannot convert from long to int

        System.out.println(10 / 3);
        System.out.println(10 / 3.0);
    }
}
