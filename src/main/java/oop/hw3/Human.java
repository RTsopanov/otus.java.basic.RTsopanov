package oop.hw3;


public class Human {
      String name;
    private  String currentTransport;





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


    public  void inTransport() {

        if (currentTransport.equals("car")) {
            Car.distance("field", data.DISTANCE.getNum());
        }

        else if (currentTransport.equals("vezdehod")) {
            Vezdehod.distance("swamp", data.DISTANCE.getNum());
        }

        else if (currentTransport.equals("horse")) {
            Horse.distance("forest", data.DISTANCE.getNum());
        }

        else if (currentTransport.equals("bike")) {
            Bike.distance("swamp", data.DISTANCE.getNum());
        }

        else if (currentTransport.equals("null")) {
            System.out.println(name + " пошел пешком.");
        }
    }
}
