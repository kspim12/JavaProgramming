package ch03.compare;

public class CompareOperator {

    public static void main(String[] args) {
        System.out.println('A' > 'B');
        // 비교 연산에서의 형변환
        // int 이하의 연산 - 일단 int로 변경 : 65 == 100
        System.out.println('A' == 65);
        // 두 피연산자 중 큰 타입으로 형변환 : 3.0 == 3.0
        System.out.println(3 == 3.0);

        //주의 사항 : 0.1의 표현문제
        System.out.println(0.1 + " : " + 0.1f + " : " + (0.1 == 0.1f));
        System.out.println(0.5 + " : " + 0.5f + " : " + (0.5 == 0.5f));
        double d1 = 0.1;
        float f1 = 0.1f;
        System.out.println((int)(d1*10) == (int)(f1*10));
        System.out.println((float)d1 == f1);

        //문자열에서의 == 과 equals
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println((s1==s2) + " : " + s1.equals(s2));
    }
}
