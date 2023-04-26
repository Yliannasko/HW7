package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] arr = new long[12];
        arr[0] = 8;
        arr[1] = 15;
        arr[2] = 13;
        arr[3] = 15;
        arr[4] = 17;
        arr[5] = 20;
        arr[6] = 19;
        arr[7] = 20;
        arr[8] = 7;
        arr[9] = 14;
        arr[10] = 14;
        arr[11] = 18;
        System.out.println(Arrays.toString(arr));

        int x = 8;
        int x2 = 15;
        int x3 = 13;
        int x4 = 15;
        int x5 = 17;
        int x6 = 20;
        int x7 = 19;
        int x8 = 20;
        int x9 = 7;
        int x10 = 14;
        int x11 = 14;
        int x12 = 18;

        System.out.println(x + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12);

        System.out.println((x + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12) / 12);


    }
}