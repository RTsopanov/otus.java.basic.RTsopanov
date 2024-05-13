package oop.hw1;

public class Box {
    private int length;
    private int height;
    private int width;
    private String color;
    private String item;
    private boolean isOpened  = true;


    public Box(int length, int height, int width, String color, boolean isOpened , String item) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
        this.isOpened  = isOpened ;
        this.item = item;
    }

    public Box(int length, int height, int width, String color, boolean isOpened ) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
        this.isOpened  = isOpened ;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public boolean getLid() {
        return isOpened ;
    }

    public String getItem() {
        return item;
    }




    public void setColor(String color) {
        this.color = color;
    }

    public void setisOpened (boolean isOpened ) {
        if (isOpened  == true || isOpened  == false)
            this.isOpened  = isOpened ;
    }



    public void put() {
        if (item == null) {
            this.item = item;
        }
        else {
            System.out.println("В коробке лежит " + item + ".  Места больше нет!" );
        }

    }


    public void info() {
        System.out.println("Размер коробки: " + length + "*" + height + "*" + width);
        System.out.println("Цвет: " + color);
        if (isOpened  == true) {
            System.out.println("Крышка открыта");
        } else {
            System.out.println("Крышка закрыта");
        }
        if (item != null) {
            System.out.println("В коробке лежит " + item);
        } else {
            System.out.println("В коробке ничего нет!");
        }
    }

    public void takeItem() {
        if (item != null && isOpened) {
            System.out.println("Вы взяли из коробки " + item + ". Коробка пуста!");
            item = null;
        }
        else if (item == null) {
            System.out.println("Из коробки нечего взять, т.к. коробка пуста!");
        }
        if (!isOpened ) {
            System.out.println("Тебе не достать, крышка закрыта☺");
        }
    }


}
