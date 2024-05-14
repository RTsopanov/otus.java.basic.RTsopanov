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

        if (plate1.isDecreaseFood()) {
            for (int i = 0; i < cats.length; i++) {


                if (plate1.getNowFoodAmount() <= 0) {
                    System.out.println("В миске нет еды, " + cats[i].getName() + " остался голодный");
                    plate1.setDecreaseFood(false);
                } else if (plate1.getNowFoodAmount() == cats[i].getAppetite()) {
                    plate1.setNowFoodAmount(plate1.getNowFoodAmount() - cats[i].getAppetite());
                    System.out.println(cats[i].getName() + " сытый" + "\nВ миске закончилась еда");
                    cats[i].setWellFed(true);
                    plate1.setDecreaseFood(false);
                } else if (plate1.getNowFoodAmount() < cats[i].getAppetite()) {
                    System.out.println("В миске мало еды. " + cats[i].getName() + " остался голодный");
                    plate1.setDecreaseFood(false);
                } else {
                    plate1.setNowFoodAmount(plate1.getNowFoodAmount() - cats[i].getAppetite());
                    System.out.println(cats[i].getName() + " сытый");
                    cats[i].setWellFed(true);
                    plate1.setDecreaseFood(false);

                }
            }


            System.out.println();
            plate1.info();
        }
    }
}
