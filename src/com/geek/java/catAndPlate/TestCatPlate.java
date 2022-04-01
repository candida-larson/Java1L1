package com.geek.java.catAndPlate;

public class TestCatPlate {
    public static void main(String[] args) {
        Cat cat = new Cat("Dusya", 120);
        Plate plate = new Plate(130);

        plate.info();
        cat.eat(plate);
        plate.info();
        cat.satietyInfo();

        Plate bigPlate = new Plate(560);
        Cat[] cats = {
                new Cat("Manya", 97),
                new Cat("Vasya", 132),
                new Cat("Boris", 186),
                new Cat("Alex", 154)
        };

        for (Cat catItem : cats) {
            catItem.eat(bigPlate);
        }

        for (Cat catItem : cats) {
            catItem.satietyInfo();
        }
    }
}
