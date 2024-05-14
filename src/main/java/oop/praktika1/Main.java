package oop.praktika1;

public class Main {


    public static void main(String[] args) {

        Plate plate1 = new Plate(1, 31);



        Cat cat1 = new Cat("Barsik", 9);

        Cat[] cats = {
                new Cat("Barsik", 9),
                new Cat("Bosya", 12),
                new Cat("Chainik", 10)};


        plate1.info();
        System.out.println();

        plate1.addFood(cats);

        System.out.println();
        plate1.info();

    }
}
