package com.geek.java.catAndPlate;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food - n < 0) {
            return;
        }
        food -= n;
    }

    public void info() {
        System.out.println("Food in plate = " + food);
    }
}
