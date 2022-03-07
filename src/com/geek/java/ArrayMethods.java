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

        System.out.println("Task #4:");
        int squareSize = 10;
        int[][] squareArr = squareWithDiagonals(squareSize);
        for (int i = 0; i < squareArr.length; i++) {
            System.out.println(">> " + Arrays.toString(squareArr[i]));
        }

        System.out.println("Task #5:");
        System.out.println(Arrays.toString(createFilledArray(3, 7)));

        System.out.println("Task #6:");
        int[] inputBytesForSearch = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -11, -56, -78, 0, -66, -5689, 117};
        System.out.println(">> min element = " + minArrayElement(inputBytesForSearch));
        System.out.println(">> max element = " + maxArrayElement(inputBytesForSearch));

        System.out.println("Task #7:");
        int[] arrayForBalancerChecker = {1, 1, 1, 2, 1};
        System.out.println("isBalancedArray = " + isBalancedArray(arrayForBalancerChecker));

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

    private static int[][] squareWithDiagonals(int squareSize) {
        int[][] squareArr = new int[squareSize][squareSize];

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {

                if (i == j) {
                    squareArr[i][j] = 1;
                }

                if (i + j == squareSize - 1) {
                    squareArr[i][j] = 1;
                }

            }
        }

        return squareArr;
    }

    private static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    private static int minArrayElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int maxArrayElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static boolean isBalancedArray(int[] arr) {

        if (arr.length < 2) {
            return false;
        }

        for (int borderIndex = 0; borderIndex < arr.length - 1; borderIndex++) {
            int sumOnLeft = 0;
            int sumOnRight = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i <= borderIndex) {
                    sumOnLeft += arr[i];
                } else {
                    sumOnRight += arr[i];
                }
            }

            if (sumOnLeft == sumOnRight) {
                return true;
            }
        }

        return false;
    }

}
