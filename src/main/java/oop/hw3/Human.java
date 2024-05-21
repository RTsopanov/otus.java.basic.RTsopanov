package oop.hw3;

public class Human extends Car {
     static String name;
    private static String currentTransport;

    static int strength = 100;


    public Human(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;

    }

    public Human(String name) {
        this.name = name;
        this.currentTransport = "null";

    }


    public String getName() {
        return name;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentTransport(String currentTransport) {
        this.currentTransport = currentTransport;
    }


    public static void inTransport() {

        if (Human.currentTransport.equals("car")) {
            Car.distance("field", 100);
        } else if (Human.currentTransport.equals("vezdehod")) {
            Vezdehod.distance("swamp", 100);
        } else if (Human.currentTransport.equals("horse")) {
            Horse.distance("forest", 100);
        } else if (Human.currentTransport.equals("bike")) {
            Bike.distance("swamp", 100);
        } else if (Human.currentTransport.equals("null")) {
            System.out.println(name + " пошел пешком.");
        }
    }
}
