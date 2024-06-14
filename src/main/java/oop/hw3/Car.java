package oop.hw3;

public class Car implements Transport {


    public  int distance(Data terrain, int dist) {
        if (Data.CARGAS.getNum() <= 0) {
            System.out.println("В машине нет топлива!");
            return 0;
        }

        else {
            if (terrain.equals(Data.FOREST)) {
                System.out.println("Машина по лесу не проедет");
                return 0;
            }


            else if (terrain.equals(Data.FIELD)) {
                System.out.println("Машина в пути.");
                if (Data.CARGAS.getNum() - (dist * 0.1) <= 0) {
                    System.out.println("Машина проехала " + Data.CARGAS.getNum() * 10 + "км по полю. Закончилось топливо!");
                    Data.CARGAS.setNum(0);
                    return Data.CARGAS.getNum() * 10;
                }

                else if (Data.CARGAS.getNum() - (dist * 0.1) > 0) {
                    Data.CARGAS.setNum(Data.CARGAS.getNum() - dist);
                    System.out.println("Машина проехала " + dist + " км по полю.");
                return dist;
                }
            }


            else if (terrain.equals(Data.SWAMP)) {
                System.out.println("Машина не проедет по болоту!");
                return 0;
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
            }
        }
        return 0;
    }



}



