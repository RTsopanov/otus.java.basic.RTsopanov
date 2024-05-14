package oop.praktika1;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isWellFed() {
        return wellFed;
    }

    public void setWellFed(boolean wellFed) {
        this.wellFed = wellFed;
    }


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = true;
    }

}