package oop.praktika1;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getWellFed() {
        return wellFed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setWellFed(boolean wellFed) {
        this.wellFed = wellFed;
    }


    public void eat(Plate plate) {
        if (plate.takeAmount(appetite)) {
            System.out.println(name + " сытый.");
            wellFed = true;
        } else
            System.out.println(name + " остался голодный.");
    }
}