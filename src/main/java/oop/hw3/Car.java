package oop.hw3;

public class Car implements Transport {


    public static void distance(String terrain, int dist) {
        if (data.CARGAS.getNum() <= 0) {
            System.out.println("В машине нет топлива!");
        }
        else {
            if (terrain.equals("forest")) {
                System.out.println("Машина по лесу не проедет");
            }


            else if (terrain.equals("field")) {
                System.out.println("Машина в пути.");
                if (data.CARGAS.getNum() - (dist * 0.1) <= 0) {
                    System.out.println("Машина проехала " + data.CARGAS.getNum() * 10 + "км по полю. Закончилось топливо!");
                    data.CARGAS.setNum(0);
                }

                else if (data.CARGAS.getNum() - (dist * 0.1) > 0) {
                    data.CARGAS.setNum(data.CARGAS.getNum() - dist);
                    System.out.println("Машина проехала " + dist + " км по полю.");
                }
            }


            else if (terrain.equals("swamp")) {
                System.out.println("Машина не проедет по болоту!");
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
            }
        }
    }


}



