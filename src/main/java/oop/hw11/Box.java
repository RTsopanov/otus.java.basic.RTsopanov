package oop.hw11;


import java.util.List;

public class Box<T extends Fruit>{


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



//    public boolean compare(T box) {
//        int sum = this.fruits.getFirst().getWeightFruits() - box;
//
//        return sum;
//    }
//
//
//
//    public int weight() {
//        int wei = 0;
//        for (T fruit : fruits) {
//            wei += fruit.getWeightFruits();
//        }
//        System.out.println(wei);
//        return wei;
//    }




    @Override
    public String toString() {
        return
                "fruits= " + fruits;
    }
}





