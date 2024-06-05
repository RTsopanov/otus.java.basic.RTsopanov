package oop.hw3;


public class Bike implements Transport {




    public int distance(String terrain, int dist) {
        if(data.BIKEGAS.getNum() <= 0) {
            System.out.println("Чуловеку нужно отдохнуть");
            return 0;
        }

        else {
            System.out.println("Человек выехал на велосипеде!");
            if (terrain.equals("forest") && (data.BIKEGAS.getNum() - (dist * 3) <= 0)) {
                System.out.println("Человек проехал на велосипеде" + data.BIKEGAS.getNum() * 3 + " км по лесу." + " устал!");
                data.BIKEGAS.setNum(0);
                return data.BIKEGAS.getNum() * 3;
            }


            else if (terrain.equals("forest") && (data.BIKEGAS.getNum() - (dist * 3) > 0)) {
                     data.BIKEGAS.setNum(data.BIKEGAS.getNum() - dist);
                     System.out.println("Человек проехал на велосипеде " + dist + " км по лесу.");
                     return dist;
            }


            else if (terrain.equals("field") && (data.BIKEGAS.getNum() - (dist * 2) <= 0)) {
                        System.out.println( "Человек проехал на велосипеде" + data.BIKEGAS.getNum() * 2 + " км по полю.");
                        data.BIKEGAS.setNum(0);
                        return data.BIKEGAS.getNum() * 2;
            }


            else if (terrain.equals("field") && (data.BIKEGAS.getNum() - (dist * 2) > 0)) {
                        data.BIKEGAS.setNum(data.BIKEGAS.getNum() - dist);
                        System.out.println("Человек проехал на велосипеде" + dist + " км по полю."  );
                        return dist;
            }


            else if (terrain.equals("swamp")) {
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

