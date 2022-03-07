package com.geek.java;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        System.out.println("Task #1:");
        byte[] inputBytesForRevert = {0, 1, 1, 0, 1, 1};
        System.out.println(Arrays.toString(revertArray(inputBytesForRevert)));

        System.out.println("Task #2:");
        int[] inputBytesForFill = new int[100];
        System.out.println(Arrays.toString(fillArray(inputBytesForFill)));

    }

    private static byte[] revertArray(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    private static int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

}
