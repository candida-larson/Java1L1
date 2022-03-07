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


}
