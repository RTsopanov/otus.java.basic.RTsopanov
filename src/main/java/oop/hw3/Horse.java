package oop.hw3;

public class Horse implements Transport {
    static int strength = 100;


    public static boolean distance(String terrain, int distdistance) {
        if(Horse.strength <= 0) {
            System.out.println("Лошади нужно отдохнуть");
        }
        else {
            System.out.println("Лошадь в пути!");
            if (terrain.equals("forest") && (Horse.strength - distdistance <= 0)) {
                System.out.println("Лошадь прошла " + distdistance + " км по лесу. Лошадь устала!");
                Horse.strength = 0;
            }
            else if (terrain.equals("forest") && (Horse.strength - distdistance > 0)) {
                     Horse.strength = Horse.strength - distdistance;
                      System.out.println("Лошадь прошла " + distdistance + " км по лесу.");
            }
            else if (terrain.equals("field") && (Horse.strength - distdistance <= 0)) {
                     System.out.println("Лошадь прошла " + distdistance+ " км по полю. Лошадь устала!");
                     Horse.strength = 0;
            }
            else if (terrain.equals("field") && (Horse.strength - distdistance > 0)) {
                     Horse.strength = Horse.strength - distdistance;
                     System.out.println("Лошадь прошла " + distdistance + " км по полю.");
            }
            else if (terrain.equals("swamp")) {
                     System.out.println("Лошадь не умеет ходить по болоту!");
            }
            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                 }
            }
        return true;
        }

    }


