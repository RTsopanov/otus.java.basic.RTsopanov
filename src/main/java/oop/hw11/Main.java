package oop.hw11;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Apple app = new Apple(20);
        Orange ora = new Orange(20);

        Box<Apple> apple = new Box<>(new ArrayList<>());
        Box<Orange> orange = new Box<>(new ArrayList<>());
        Box<Fruit> fruit = new Box<>(new ArrayList<>());



        apple.put(app);
        orange.put(ora);

        System.out.println("apple = " + apple.weight());
        System.out.println("orange = " + orange.weight());

        System.out.println(apple.compare(orange));

        apple.transferTo(fruit);
        orange.transferTo(fruit);



    }


}
