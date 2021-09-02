package ch03.bit;

public class ShiftOperation {

    public static void main(String[] args) {
        int a = 0b1000;
        printBinaryAndInteger(a);
        int b = a<<2;
        printBinaryAndInteger(b);
        int d = a >> 2;
        printBinaryAndInteger(d);
        int e = a >>> 2;
        printBinaryAndInteger(e);

        a = -100;
        System.out.println(Integer.toBinaryString(a));
        int f = a >> 2;
        printBinaryAndInteger(f);
        int g = a >>> 2;
        printBinaryAndInteger(g);

    }

    static void printBinaryAndInteger(int i ) {
        System.out.printf("%32s, %d%n", Integer.toBinaryString(i), i);
    }
}
