package com.geek.java.lessonSix;

public class TestExample {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Animal catMusya = new Cat("Musya");
        Animal dog = new Dog("Sharik");

        cat.run(210);
        cat.swim(5);

        dog.run(499);
        dog.swim(11);

        Animal.getInstancesStatistic();

    }
}
