package oop.hw3;

public class Horse implements Transport {



    public int distance(String terrain, int dist) {
        if(data.HORSESTRENGTH.getNum() <= 0) {
            System.out.println("Лошади нужно отдохнуть");
            return 0;
        }

        else {
            System.out.println("Лошадь в пути!");
            if (terrain.equals("forest") && (data.HORSESTRENGTH.getNum() - dist <= 0)) {
                System.out.println("Лошадь прошла " + dist + " км по лесу. Лошадь устала!");
                data.HORSESTRENGTH.setNum(0);
                return dist;
            }


            else if (terrain.equals("forest") && (data.HORSESTRENGTH.getNum() - dist > 0)) {
                     data.HORSESTRENGTH.setNum(data.HORSESTRENGTH.getNum() - dist);
                      System.out.println("Лошадь прошла " + dist + " км по лесу.");
                return dist;
            }


            else if (terrain.equals("field") && (data.HORSESTRENGTH.getNum() - dist <= 0)) {
                     System.out.println("Лошадь прошла " + dist+ " км по полю. Лошадь устала!");
                     data.HORSESTRENGTH.setNum(0);
                return dist;
            }


            else if (terrain.equals("field") && (data.HORSESTRENGTH.getNum() - dist > 0)) {
                     data.HORSESTRENGTH.setNum(data.HORSESTRENGTH.getNum() - dist);
                     System.out.println("Лошадь прошла " + dist + " км по полю.");
                return dist;
            }
            else if (terrain.equals("swamp")) {
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


