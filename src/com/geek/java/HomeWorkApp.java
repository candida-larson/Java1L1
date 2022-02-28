package com.geek.java;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 11;
        int b = -19;

        if( a + b >= 0 ){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 23;

        if( value <= 0 ){
            System.out.println("Красный");
        }else if ( value > 0 && value <= 100){
            System.out.println("Желный");
        }else{
            System.out.println("Зеленый");
        }

    }

}
