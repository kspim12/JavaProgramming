package ch03.arithmetic;

public class InfinityNan {

    public static void main(String[] args) {
        try {
            int i = 1 / 0;
            // ArithmeticException 발생
            // int j = 1 % 0;
            // ArithmeticException 발생
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        double d1 = 1 / 0.0;
        double d2 = 1 % 0.0;
        System.out.printf("d1 : %f, d2: %f%n", d1, d2);

        canUse(d1);
        canUse(d2);
    }

    public static void canUse(double d) {
        if ( Double.isInfinite(d) || Double.isNaN(d) ) {
            System.out.println("cannot use value : " + d);
        } else {
            System.out.printf("d : %f%n", d);
        }
    }
}
