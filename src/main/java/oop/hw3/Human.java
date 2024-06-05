package oop.hw3;


public class Human {
      String name;
      Transport currentTransport;




    public Human(String name, Transport currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public Human(String name) {
        this.name = name;
        this.currentTransport = currentTransport;
    }


    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }






    public int  inTransport() {
       return currentTransport.distance("field", data.DISTANCE.getNum());

    }
}
