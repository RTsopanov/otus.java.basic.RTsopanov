package oop.hw11;


import java.util.List;

public class Box<T extends Fruit> {


    private List<T> fruits;


    public Box(List<T> fruits) {
        this.fruits = fruits;
    }


    public void put(T fruit) {
        fruits.add(fruit);


    }


    public void transferTo(Box<? super T> another) {
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }




    public boolean compare(Box<?> box) {
        return weight() == box.weight();
    }


    public int weight() {
        int wei = 0;
        for (T fruit : fruits) {
            wei += fruit.weight;
        }
        return wei;
    }




    @Override
    public String toString() {
        return
                "fruits= " + fruits;
    }


}





