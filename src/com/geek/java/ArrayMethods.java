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

        System.out.println("Task #3:");
        int[] inputBytesForMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyArrayElement(inputBytesForMultiply, 6)));

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

    private static int[] multiplyArrayElement(int[] arr, int multiplier) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

}
