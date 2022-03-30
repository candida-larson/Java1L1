package com.geek.java.lessonSix;

public abstract class Animal {
    protected String name;
    protected int maximumRunningDistance;
    protected int maximumSwimmingDistance;
    private static int numberOfAnimalInstances = 0;
    private static int numberOfCatInstances = 0;
    private static int numberOfDogInstances = 0;

    public Animal(String name, int maximumRunningDistance, int maximumSwimmingDistance) {
        this.name = name;
        this.maximumRunningDistance = maximumRunningDistance;
        this.maximumSwimmingDistance = maximumSwimmingDistance;

        numberOfAnimalInstances++;

        if (this instanceof Cat) {
            numberOfCatInstances++;
        }

        if (this instanceof Dog) {
            numberOfDogInstances++;
        }
    }

    public void run(int obstacleLength) {
        if (maximumRunningDistance == 0) {
            System.out.println(name + " can`t run");
            return;
        }
        if (obstacleLength > maximumRunningDistance) {
            obstacleLength = maximumRunningDistance;
        }
        System.out.println(name + " ran " + obstacleLength + " meters");
    }

    public void swim(int obstacleLength) {
        if (maximumSwimmingDistance == 0) {
            System.out.println(name + " can't swim");
            return;
        }
        if (obstacleLength > maximumSwimmingDistance) {
            obstacleLength = maximumSwimmingDistance;
        }
        System.out.println(name + " swam " + obstacleLength + " meters");
    }

    public static void getInstancesStatistic() {
        System.out.println("Total animals: " + numberOfAnimalInstances);
        System.out.println("> Cats: " + numberOfCatInstances);
        System.out.println("> Dogs: " + numberOfDogInstances);
    }

}
