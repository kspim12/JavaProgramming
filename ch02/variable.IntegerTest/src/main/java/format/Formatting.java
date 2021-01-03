package format;

public class Formatting {

    public static void main(String[] args) {
        boolean b1 = true;
        int i1 = 65;
        double d1 = 3.141592;
        System.out.printf("b1: %b, i1: %d(%c), d1: %f%n", b1, i1, i1, d1);

        // 자릿수 지정
        System.out.printf("[%4d], [%-4d], [%04d]%n", i1, i1, i1);

        // 소수점 이하 자리 표현
        System.out.printf("[%010.3f], [%10.8f]%n", d1, d1);
    }
}
