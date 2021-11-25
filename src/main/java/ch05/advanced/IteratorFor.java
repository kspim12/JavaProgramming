package ch05.advanced;

import java.util.Random;

public class IteratorFor {

    public static void main(String[] args) {
        int[] datas = new int[100];
        Random random = new Random();
        for ( int i =0; i < datas.length; i++ ) {
            datas[i] = random.nextInt(100);
        }

        int evenSum = 0;
        for ( int i = 0; i < datas.length; i++ ) {
            int data = datas[i];
            if ( data %2==0 ) {
                evenSum += data;
            }
        }
        System.out.printf("짝수들의 합: %d%n", evenSum);

        int oddSum = 0;
        for ( int data : datas ) {
            if ( data %2 == 1 ) {
                oddSum += data;
            }
        }
        System.out.printf("홀수들의 합 : %d%n", oddSum);
    }
}
