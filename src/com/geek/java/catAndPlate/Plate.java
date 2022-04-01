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

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
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
