package oop.hw3;


public class Bike implements Transport {




    public int distance(Data terrain, int dist) {
        if(Data.BIKEGAS.getNum() <= 0) {
            System.out.println("Чуловеку нужно отдохнуть");
            return 0;
        }

        else {
            System.out.println("Человек выехал на велосипеде!");
            if (terrain.equals(Data.FOREST) && (Data.BIKEGAS.getNum() - (dist * 3) <= 0)) {
                System.out.println("Человек проехал на велосипеде" + Data.BIKEGAS.getNum() * 3 + " км по лесу." + " устал!");
                Data.BIKEGAS.setNum(0);
                return Data.BIKEGAS.getNum() * 3;
            }


            else if (terrain.equals(Data.FOREST) && (Data.BIKEGAS.getNum() - (dist * 3) > 0)) {
                     Data.BIKEGAS.setNum(Data.BIKEGAS.getNum() - dist);
                     System.out.println("Человек проехал на велосипеде " + dist + " км по лесу.");
                     return dist;
            }


            else if (terrain.equals(Data.FIELD) && (Data.BIKEGAS.getNum() - (dist * 2) <= 0)) {
                        System.out.println( "Человек проехал на велосипеде" + Data.BIKEGAS.getNum() * 2 + " км по полю.");
                        Data.BIKEGAS.setNum(0);
                        return Data.BIKEGAS.getNum() * 2;
            }


            else if (terrain.equals(Data.FIELD) && (Data.BIKEGAS.getNum() - (dist * 2) > 0)) {
                        Data.BIKEGAS.setNum(Data.BIKEGAS.getNum() - dist);
                        System.out.println("Человек проехал на велосипеде " + dist + " км по полю."  );
                        return dist;
            }


            else if (terrain.equals(Data.SWAMP)) {
                     System.out.println("Человек не может поехать на велосипеде по болоту!");
                     return 0;
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                }
            }
        return 0;
    }



    }

