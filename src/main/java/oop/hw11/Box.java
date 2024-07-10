package oop.hw11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<Apple> box1;
    private List<Orange> box2;
    private List<Fruit> box3;
    private Fruit fruit;
    private Apple apple;
    private Orange orange;
    private float appleWeight = 0.2f;
    private float orangeWeight = 0.3f;


    public Box() {
        this.box1 = new ArrayList<>();
        this.box2 = new ArrayList<>();
        this.box3 = new ArrayList<>();
    }


    public boolean putInBox(Apple boxApple, Orange boxOrange) {
        if (boxApple.getQuantityApple() != 0 || boxOrange.getQuantityOrange() != 0) {
            box1.add(boxApple);
            box2.add(boxOrange);
            System.out.println("Количество яблок в коробке Apple = " + boxApple.getQuantityApple());
            System.out.println("Количество апельсинов в коробке Orange = " + boxOrange.getQuantityOrange());

            return true;
        }
        return false;
    }


    public void putInBoxFruit(List<? super T> fruit, List<? extends T>  box) {
        fruit.addAll(box);
        }


    public List<Apple> getBox1() {
        return box1;
    }

    public void setBox1(List<Apple> box1) {
        this.box1 = box1;
    }

    public List<Orange> getBox2() {
        return box2;
    }

    public void setBox2(List<Orange> box2) {
        this.box2 = box2;
    }

    public List<Fruit> getBox3() {
        return box3;
    }

    public void setBox3(List<Fruit> box3) {
        this.box3 = box3;
    }
}





