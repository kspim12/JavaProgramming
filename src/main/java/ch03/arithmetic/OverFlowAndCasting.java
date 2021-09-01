package ch03.arithmetic;

public class OverFlowAndCasting {

    public static void main(String[] args) {

        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        System.out.println("Integer MAX_VALUE : " + i1);
        System.out.println("Integer overflow : " + i2);

        long l1 = i1 + 1;
        System.out.printf("allocate long type : %d%n", l1);

        long l2 = (long) (i1 + 1);
        System.out.printf("casting value : %d%n", l2);

        long l3 = (long) i1 + 1;
        System.out.printf("type converted operation : %d%n", l3);

        int i3 = 1000000 * 1000000 / 1000000;
        int i4 = 1000000 / 100000 * 100000;
        System.out.printf("i3 : %d, i4: %d%n", i3, i4);
    }
}