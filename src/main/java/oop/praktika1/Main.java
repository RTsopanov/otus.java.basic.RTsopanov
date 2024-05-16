package oop.praktika1;

public class Main {
    public static void main(String[] args) {

//        Cat cat1 = new Cat("Riha", 16);


        Plate plate1 = new Plate(20);
        Cat[] cats = {
                new Cat("Riha", 21),
                new Cat("Bosya", 5),
                new Cat("Ioska", 7)
        };


        System.out.println(plate1);
        System.out.println();


        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
        }


        System.out.println();
        System.out.println(plate1);
//        plate1.info();

    }
}
