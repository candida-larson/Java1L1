package com.geek.java.catAndPlate;

public class TestCatPlate {
    public static void main(String[] args) {
        Cat cat = new Cat("Dusya", 80);
        Plate plate = new Plate(130);

        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
