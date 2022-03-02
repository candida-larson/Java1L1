package com.geek.java;

public class Methods {

    public static void main(String[] args) {
        System.out.println("checkSum = " + checkSum(111, 6));
    }

    private static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


}
