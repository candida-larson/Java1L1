package com.geek.java;

public class Methods {

    public static void main(String[] args) {
        System.out.println("checkSum = " + checkSum(111, 6));
        showSignOfNumber(-99);
        System.out.println("checkSignOfNumber = " + checkSignOfNumber(-99));
    }

    private static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void showSignOfNumber(int number){

        if( number >= 0 ){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }

    }

    private static boolean checkSignOfNumber(int number){
        if( number >= 0 ){
            return false;
        }else {
            return true;
        }
    }


}
