package oop.hw2;

import oop.hw2.animal.Cat;
import oop.hw2.animal.Dog;
import oop.hw2.animal.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 4, 60);
        Dog dog = new Dog("Sharik", 3, 2, 50);
        Horse horse = new Horse("Julius", 15, 4, 90);

        cat.info();
        System.out.println();
        cat.run(50);
        System.out.println();

        dog.info();
        System.out.println();
        dog.run(45);
        System.out.println();

        horse.info();
        System.out.println();
        horse.run(91);
        System.out.println();


        cat.info();
        System.out.println();
        cat.swim(50);
        System.out.println();

        dog.info();
        System.out.println();
        dog.swim(5);
        System.out.println();

        horse.info();
        System.out.println();
        horse.swim(10);
    }
}
