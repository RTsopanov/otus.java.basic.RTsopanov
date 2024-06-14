package oop.hw3;

public class Vezdehod implements Transport{



    public int distance(Data terrain, int dist) {
        if(Data.VEZDEHODGAS.getNum() <= 0) {
            System.out.println("Нет топлива!");
            return 0;
        }

        else {
            System.out.println("Вездеход в пути!");
            if (terrain.equals(Data.FOREST) && (Data.VEZDEHODGAS.getNum() - (dist * 0.3)  <= 0)) {
                System.out.println("Вездеход проехал " + Data.VEZDEHODGAS.getNum() * 30 + "км по лесу. Закончилось топливо!");
                Data.VEZDEHODGAS.setNum(0);
                return Data.VEZDEHODGAS.getNum() * 30;
            }


            else if (terrain.equals(Data.FOREST) && (Data.VEZDEHODGAS.getNum() - (dist * 0.3) > 0)){
                Data.VEZDEHODGAS.setNum(Data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + "км  по лесу.");
                     return dist;
            }


            else if (terrain.equals(Data.FIELD) && (Data.VEZDEHODGAS.getNum() - (dist * 0.2) <= 0)) {
                     System.out.println("Вездеход проехал " + Data.VEZDEHODGAS.getNum() * 20 + " км по полю. Закончилось топливо!");
                Data.VEZDEHODGAS.setNum(0);
                return Data.VEZDEHODGAS.getNum();
            }


            else if (terrain.equals(Data.FIELD) && (Data.VEZDEHODGAS.getNum() - (dist * 0.2) > 0)) {
                Data.VEZDEHODGAS.setNum(Data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + " км по полю.");
                     return dist;
            }


            else if (terrain.equals(Data.SWAMP) && (Data.VEZDEHODGAS.getNum() - (dist * 0.4) <= 0)) {
                      System.out.println("Вездеход проехал " + Data.VEZDEHODGAS.getNum() * 40 + " км по болоту. Закончилось топливо!");
                Data.VEZDEHODGAS.setNum(0);
                return Data.VEZDEHODGAS.getNum() * 40;
            }


            else if (terrain.equals(Data.SWAMP) && (Data.VEZDEHODGAS.getNum() - (dist * 0.4) > 0)) {
                Data.VEZDEHODGAS.setNum(Data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + " км по болоту.");
                     return dist;
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                }
            }
        return 0;
    }

    }

