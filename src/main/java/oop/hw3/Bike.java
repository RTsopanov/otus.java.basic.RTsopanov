package oop.hw3;

public class Bike implements Transport {



    public static boolean distance(String terrain, int distdistance) {
        if(Human.strength <= 0) {
            System.out.println(Human.name + " нужно отдохнуть");
        }
        else {
            System.out.println(Human.name + " выехал на велосипеде!");
            if (terrain.equals("forest") && Human.strength - (distdistance * 3) <= 0) {
                System.out.println(Human.name + " проехал на велосипеде" + Human.strength * 3 + " км по лесу." + Human.name + " устал!");
                Human.strength = 0;
            }
            else if (terrain.equals("forest") && Human.strength - (distdistance * 3) > 0){
                Human.strength = Human.strength - distdistance;
                System.out.println(Human.name + " проехал на велосипеде " + distdistance + " км по лесу.");
            }
            else if (terrain.equals("field") && Human.strength - (distdistance * 2) <= 0) {
                System.out.println(Human.name + " проехал на велосипеде" + Human.strength * 2 + " км по полю." + Human.name + " устал!");
                Human.strength = 0;
            }
            else if (terrain.equals("field") && Human.strength - (distdistance * 2) > 0) {
                Human.strength = Human.strength - distdistance;
                System.out.println(Human.name + " проехал на велосипеде" + distdistance + " км по полю." + Human.name + " устал!");
            }
            else if (terrain.equals("swamp")) {
                System.out.println(Human.name + " не может поехать на велосипеде по болоту!");
            }
            else System.out.println("Укажите местность корректно (forest/field/swamp)!");
        }
        return true;
    }
}
