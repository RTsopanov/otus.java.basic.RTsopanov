package oop.hw3;

import  oop.hw3.Human;




public class Bike implements Transport {




    public static boolean distance(String terrain, int distdistance) {
        if(Human.strength <= 0) {
            System.out.println("Чуловеку нужно отдохнуть");
        }
        else {
            System.out.println("Человек выехал на велосипеде!");
            if (terrain.equals("forest") && (Human.strength - (distdistance * 3) <= 0)) {
                System.out.println("Человек проехал на велосипеде" + Human.strength * 3 + " км по лесу." + " устал!");
                Human.strength = 0;
            }
            else if (terrain.equals("forest") && (Human.strength - (distdistance * 3) > 0)) {
                     Human.strength = Human.strength - distdistance;
                     System.out.println("Человек проехал на велосипеде " + distdistance + " км по лесу.");
            }
            else if (terrain.equals("field") && (Human.strength - (distdistance * 2) <= 0)) {
                        System.out.println( "Человек проехал на велосипеде" + Human.strength * 2 + " км по полю.");
                        Human.strength = 0;
            }
            else if (terrain.equals("field") && (Human.strength - (distdistance * 2) > 0)) {
                        Human.strength = Human.strength - distdistance;
                        System.out.println("Человек проехал на велосипеде" + distdistance + " км по полю."  );
            }
            else if (terrain.equals("swamp")) {
                     System.out.println("Человек не может поехать на велосипеде по болоту!");
            }
            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                }
            }
        return true;
        }



    }

