package com.geek.java.catAndPlate;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            return false;
        }
        food -= n;
        return true;
    }

    public boolean increaseFood(int n) {
        if (n < 0) {
            return false;
        }
        food += n;
        return true;
    }

    public void info() {
        System.out.println("Food in plate = " + food);
    }
}
