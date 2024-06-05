package oop.hw3;

public class Vezdehod implements Transport{



    public int distance(String terrain, int dist) {
        if(data.VEZDEHODGAS.getNum() <= 0) {
            System.out.println("Нет топлива!");
            return 0;
        }

        else {
            System.out.println("Вездеход в пути!");
            if (terrain.equals("forest") && (data.VEZDEHODGAS.getNum() - (dist * 0.3)  <= 0)) {
                System.out.println("Вездеход проехал " + data.VEZDEHODGAS.getNum() * 30 + "км по лесу. Закончилось топливо!");
                data.VEZDEHODGAS.setNum(0);
                return data.VEZDEHODGAS.getNum() * 30;
            }


            else if (terrain.equals("forest") && (data.VEZDEHODGAS.getNum() - (dist * 0.3) > 0)){
                data.VEZDEHODGAS.setNum(data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + "км  по лесу.");
                     return dist;
            }


            else if (terrain.equals("field") && (data.VEZDEHODGAS.getNum() - (dist * 0.2) <= 0)) {
                     System.out.println("Вездеход проехал " + data.VEZDEHODGAS.getNum() * 20 + " км по полю. Закончилось топливо!");
                data.VEZDEHODGAS.setNum(0);
                return data.VEZDEHODGAS.getNum();
            }


            else if (terrain.equals("field") && (data.VEZDEHODGAS.getNum() - (dist * 0.2) > 0)) {
                data.VEZDEHODGAS.setNum(data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + " км по полю.");
                     return dist;
            }


            else if (terrain.equals("swamp") && (data.VEZDEHODGAS.getNum() - (dist * 0.4) <= 0)) {
                      System.out.println("Вездеход проехал " + data.VEZDEHODGAS.getNum() * 40 + " км по болоту. Закончилось топливо!");
                data.VEZDEHODGAS.setNum(0);
                return data.VEZDEHODGAS.getNum() * 40;
            }


            else if (terrain.equals("swamp") && (data.VEZDEHODGAS.getNum() - (dist * 0.4) > 0)) {
                data.VEZDEHODGAS.setNum(data.VEZDEHODGAS.getNum() - dist);
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

