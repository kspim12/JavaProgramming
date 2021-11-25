package ch05.advanced;

import java.util.Arrays;

public class SortingAPI {

    public static void main(String[] args) {
        String[] arr = {"Java", "is", "A", "PIE"};
        Arrays.sort(arr);
        System.out.println("정렬 후");
        for ( String str : arr ) {
            System.out.printf("%s \t", str);
        }
    }
}
