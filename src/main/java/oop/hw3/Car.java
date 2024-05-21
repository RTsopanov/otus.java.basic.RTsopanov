package oop.hw3;

public class Car implements Transport {
    static int gas = 80;


public static boolean distance(String terrain, int  distdistance) {
        if(Car.gas <= 0) {
            System.out.println("В машине нет топлива!");
            return false;
        }
        else {
            if (terrain.equals("forest")) {
                System.out.println("Машина по лесу не проедет");
            } else if (terrain.equals("field")) {
                System.out.println("Машина в пути.");

                if(Car.gas - distdistance * 0.1  <= 0){
                    System.out.println("Машина проехала " + Car.gas * 10 + "км по полю. Закончилось топливо!");
                    Car.gas = 0;
                }
                else if(Car.gas - (distdistance * 0.1) > 0){
                    Car.gas = Car.gas - distdistance;
                    System.out.println("Машина проехала " + distdistance + " км по полю.");
                }
            }
            else if (terrain.equals("swamp")) {
                System.out.println("Машина не проедет по болоту!");
            }
            else System.out.println("Укажите местность корректно (forest/field/swamp)!");
        }
    return true;
    }


}
