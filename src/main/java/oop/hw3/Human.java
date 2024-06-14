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
        if (currentTransport == null){
            System.out.println(name + " пошел пешком " + Data.HUMANSTRENGTH.getNum() + " км.");
            return Data.HUMANSTRENGTH.getNum();
        }
        else
       return currentTransport.distance(Data.SWAMP, Data.DISTANCE.getNum());

    }
}
