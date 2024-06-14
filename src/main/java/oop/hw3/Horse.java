package oop.hw3;

public class Horse implements Transport {



    public int distance(Data terrain, int dist) {
        if(Data.HORSESTRENGTH.getNum() <= 0) {
            System.out.println("Лошади нужно отдохнуть");
            return 0;
        }

        else {
            System.out.println("Лошадь в пути!");
            if (terrain.equals(Data.FOREST) && (Data.HORSESTRENGTH.getNum() - dist <= 0)) {
                System.out.println("Лошадь прошла " + dist + " км по лесу. Лошадь устала!");
                Data.HORSESTRENGTH.setNum(0);
                return dist;
            }


            else if (terrain.equals(Data.FOREST) && (Data.HORSESTRENGTH.getNum() - dist > 0)) {
                     Data.HORSESTRENGTH.setNum(Data.HORSESTRENGTH.getNum() - dist);
                      System.out.println("Лошадь прошла " + dist + " км по лесу.");
                return dist;
            }


            else if (terrain.equals(Data.FIELD) && (Data.HORSESTRENGTH.getNum() - dist <= 0)) {
                     System.out.println("Лошадь прошла " + dist+ " км по полю. Лошадь устала!");
                     Data.HORSESTRENGTH.setNum(0);
                return dist;
            }


            else if (terrain.equals(Data.FIELD) && (Data.HORSESTRENGTH.getNum() - dist > 0)) {
                     Data.HORSESTRENGTH.setNum(Data.HORSESTRENGTH.getNum() - dist);
                     System.out.println("Лошадь прошла " + dist + " км по полю.");
                return dist;
            }
            else if (terrain.equals(Data.SWAMP)) {
                     System.out.println("Лошадь не умеет ходить по болоту!");
                return 0;
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                 }
            }
        return 0;
        }

    }


