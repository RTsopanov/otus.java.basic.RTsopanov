package oop.hw1;

public class Box {
    private int length;
    private int height;
    private int width;
    private String color;
    private String lid;
    private String item;


    public Box(int length, int height, int width, String color, String lid, String item) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
        this.lid = lid;
        this.item = item;
    }
    public Box(int length, int height, int width, String color, String lid) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
        this.lid = lid;
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

    public String getLid() {
        return lid;
    }
    public String getItem(){
        return item;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public void setLid(String lid) {
        if (lid.equals("Открыть") || lid.equals("Закрыть"))
            this.lid = lid;
    }
    public void setItem(String item){
        if(item.equals(null))
        this.item = item;
    }


    public void info() {
        System.out.println("Размер коробки: " + length + "*" + height + "*" + width);
        System.out.println("Цвет: " + color);
        if (lid.equals("Открыть")) {
            System.out.println("Крышка открыта");
        } else {
            System.out.println("Крышка закрыта");
        }
        if(item != null){
            System.out.println("В коробке лежит " + item);
        }
        else{
            System.out.println("В коробке ничего нет!");
        }
    }

    public void getBox(){
        if (item != null && lid.equals("Открыть")){
            System.out.println("Вы взяли из коробки " + item + " Коробка пуста!");
            item = null;}
            if(item == null){
                System.out.println("Из коробки нечего взять, т.к. коробка пуста!");
            }
            if(!lid.equals("Открыть")){
                System.out.println("Тебе не достать, крышка закрыта☺");
            }


    }

//    public void putBox(){
//        if(){}
//    }
}
