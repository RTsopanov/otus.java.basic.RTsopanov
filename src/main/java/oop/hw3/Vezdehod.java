package oop.hw3;

public class Vezdehod implements Transport{
    static int gas = 200;


    public static boolean distance(String terrain, int distdistance) {
        if(Vezdehod.gas <= 0) {
            System.out.println("Нет топлива!");
        }
        else {
            System.out.println("Вездеход в пути!");
            if (terrain.equals("forest") && (Vezdehod.gas - (distdistance * 0.3)  <= 0)) {
                System.out.println("Вездеход проехал " + Vezdehod.gas * 30 + "км по лесу. Закончилось топливо!");
                Vezdehod.gas = 0;
            }
            else if (terrain.equals("forest") && (Vezdehod.gas - (distdistance * 0.3) > 0)){
                     Vezdehod.gas = Vezdehod.gas - distdistance;
                     System.out.println("Вездеход проехал " + distdistance + "км  по лесу.");
            }
            else if (terrain.equals("field") && (Vezdehod.gas - (distdistance * 0.2) <= 0)) {
                     System.out.println("Вездеход проехал " + Vezdehod.gas * 20 + " км по полю. Закончилось топливо!");
                     Vezdehod.gas = 0;
            }
            else if (terrain.equals("field") && (Vezdehod.gas - (distdistance * 0.2) > 0)) {
                      Vezdehod.gas = Vezdehod.gas - distdistance;
                     System.out.println("Вездеход проехал " + distdistance + " км по полю.");
            }
            else if (terrain.equals("swamp") && (Vezdehod.gas - (distdistance * 0.4) <= 0)) {
                      System.out.println("Вездеход проехал " + Vezdehod.gas * 40 + " км по болоту. Закончилось топливо!");
                     Vezdehod.gas = 0;
            }
            else if (terrain.equals("swamp") && (Vezdehod.gas - (distdistance * 0.4) > 0)) {
                    Vezdehod.gas = Vezdehod.gas - distdistance;
                     System.out.println("Вездеход проехал " + distdistance + " км по болоту.");
            }

            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                }
            }
        return true;
        }

    }

