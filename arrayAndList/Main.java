package hello.hellospring.arrayAndList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[4] = 5;
        arr[arr.length - 1] = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));
        boolean[] booleans = new boolean[5];
        System.out.println(booleans);


    }
}
