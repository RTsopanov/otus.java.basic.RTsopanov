package oop.hw3;


public class Bike implements Transport {




    public static void distance(String terrain, int dist) {
        if(data.BIKEGAS.getNum() <= 0) {
            System.out.println("Чуловеку нужно отдохнуть");
        }

        else {
            System.out.println("Человек выехал на велосипеде!");
            if (terrain.equals("forest") && (data.BIKEGAS.getNum() - (dist * 3) <= 0)) {
                System.out.println("Человек проехал на велосипеде" + data.BIKEGAS.getNum() * 3 + " км по лесу." + " устал!");
                data.BIKEGAS.setNum(0);
            }


            else if (terrain.equals("forest") && (data.BIKEGAS.getNum() - (dist * 3) > 0)) {
                     data.BIKEGAS.setNum(data.BIKEGAS.getNum() - dist);
                     System.out.println("Человек проехал на велосипеде " + dist + " км по лесу.");
            }


            else if (terrain.equals("field") && (data.BIKEGAS.getNum() - (dist * 2) <= 0)) {
                        System.out.println( "Человек проехал на велосипеде" + data.BIKEGAS.getNum() * 2 + " км по полю.");
                        data.BIKEGAS.setNum(0);
            }


            else if (terrain.equals("field") && (data.BIKEGAS.getNum() - (dist * 2) > 0)) {
                        data.BIKEGAS.setNum(data.BIKEGAS.getNum() - dist);
                        System.out.println("Человек проехал на велосипеде" + dist + " км по полю."  );
            }


            else if (terrain.equals("swamp")) {
                     System.out.println("Человек не может поехать на велосипеде по болоту!");
            }


            else {
                System.out.println("Укажите местность корректно (forest/field/swamp)!");
                }
            }
        }



    }

