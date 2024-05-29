package oop.hw3;

public class Vezdehod implements Transport{



    public static void distance(String terrain, int dist) {
        if(data.VEZDEHODGAS.getNum() <= 0) {
            System.out.println("Нет топлива!");
        }

        else {
            System.out.println("Вездеход в пути!");
            if (terrain.equals("forest") && (data.VEZDEHODGAS.getNum() - (dist * 0.3)  <= 0)) {
                System.out.println("Вездеход проехал " + data.VEZDEHODGAS.getNum() * 30 + "км по лесу. Закончилось топливо!");
                data.VEZDEHODGAS.setNum(0);
            }


            else if (terrain.equals("forest") && (data.VEZDEHODGAS.getNum() - (dist * 0.3) > 0)){
                data.VEZDEHODGAS.setNum(data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + "км  по лесу.");
            }


            else if (terrain.equals("field") && (data.VEZDEHODGAS.getNum() - (dist * 0.2) <= 0)) {
                     System.out.println("Вездеход проехал " + data.VEZDEHODGAS.getNum() * 20 + " км по полю. Закончилось топливо!");
                data.VEZDEHODGAS.setNum(0);
            }


            else if (terrain.equals("field") && (data.VEZDEHODGAS.getNum() - (dist * 0.2) > 0)) {
                data.VEZDEHODGAS.setNum(data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + " км по полю.");
            }


            else if (terrain.equals("swamp") && (data.VEZDEHODGAS.getNum() - (dist * 0.4) <= 0)) {
                      System.out.println("Вездеход проехал " + data.VEZDEHODGAS.getNum() * 40 + " км по болоту. Закончилось топливо!");
                data.VEZDEHODGAS.setNum(0);
            }


            else if (terrain.equals("swamp") && (data.VEZDEHODGAS.getNum() - (dist * 0.4) > 0)) {
                data.VEZDEHODGAS.setNum(data.VEZDEHODGAS.getNum() - dist);
                     System.out.println("Вездеход проехал " + dist + " км по болоту.");
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                }
            }
        }

    }

