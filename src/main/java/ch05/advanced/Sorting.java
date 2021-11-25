package ch05.advanced;

import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        Random rand = new Random();
        int temp = 0;
        int[] arr = new int[10];
        for ( int i = 0; i < 10; i++ ) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("초기 상태");
        for ( int i : arr ) {
            System.out.printf("%d \t", i);
        }

        //정렬
        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j =0; j < arr.length -1; j++) {
                if ( arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\n 정렬 후");
        for ( int i : arr ) {
            System.out.printf("%d \t", i);
        }
    }
}
