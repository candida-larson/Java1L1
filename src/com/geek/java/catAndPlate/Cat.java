package com.geek.java.catAndPlate;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (isSatiety()) {
            return;
        }
        if (plate.decreaseFood(appetite)) {
            setSatiety(true);
        }
    }

    public void satietyInfo() {
        if (isSatiety()) {
            System.out.println(String.format("%s cat is full", getName()));
        } else {
            System.out.println(String.format("%s cat is hungry", getName()));
        }
    }
}
