package ch06.method;

public class VariableArgsTest {

    public void add(int... params) {
        int sum = 0;
        for ( int i : params) {
            sum+=i;
        }
        System.out.printf("파라미터 개수 : %d, 총 합 : %d%n", params.length, sum);
    }

    public static void main(String args[] ) {
        VariableArgsTest vt = new VariableArgsTest();
        vt.add(1, 2, 3, 4, 5);
        vt.add(1, 2, 3);
        vt.add();
    }
}
