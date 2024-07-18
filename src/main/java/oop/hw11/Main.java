package oop.hw11;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {


        Apple app = new Apple(15);
        Orange ora = new Orange(20);

        Box<Apple> apple = new Box<>(new ArrayList<>());
        Box<Orange> orange = new Box<>(new ArrayList<>());
        Box<Fruit> fruit = new Box<>(new ArrayList<>());


        apple.put(app);
        orange.put(ora);


        apple.transferTo(fruit);
        orange.transferTo(fruit);


    }


}
