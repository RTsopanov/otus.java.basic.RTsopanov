package oop.hw11;

public class Main {
    public static void main(String[] args) {


        Apple apple = new Apple(20);
        Orange orange = new Orange(15);
        Fruit fruit = new Fruit();
        Box box = new Box<>();



        box.putInBox(apple, orange);
        System.out.println();





        System.out.println(box.getBox3());
        System.out.println();
        box.putInBoxFruit(box.getBox3(), box.getBox1());
        box.putInBoxFruit(box.getBox3(), box.getBox2());
        System.out.println(box.getBox3());




    }
}
