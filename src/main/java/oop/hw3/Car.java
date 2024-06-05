package oop.hw3;

public class Car implements Transport {


    public  int distance(String terrain, int dist) {
        if (data.CARGAS.getNum() <= 0) {
            System.out.println("В машине нет топлива!");
            return 0;
        }

        else {
            if (terrain.equals(data.FIELD)) {
                System.out.println("Машина по лесу не проедет");
                return 0;
            }


            else if (terrain.equals(data.FIELD)) {
                System.out.println("Машина в пути.");
                if (data.CARGAS.getNum() - (dist * 0.1) <= 0) {
                    System.out.println("Машина проехала " + data.CARGAS.getNum() * 10 + "км по полю. Закончилось топливо!");
                    data.CARGAS.setNum(0);
                    return data.CARGAS.getNum() * 10;
                }

                else if (data.CARGAS.getNum() - (dist * 0.1) > 0) {
                    data.CARGAS.setNum(data.CARGAS.getNum() - dist);
                    System.out.println("Машина проехала " + dist + " км по полю.");
                return dist;
                }
            }


            else if (terrain.equals("swamp")) {
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



