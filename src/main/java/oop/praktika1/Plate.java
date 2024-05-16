package oop.praktika1;


public class Plate {
    private int maxFood;
    private int nowFood;
    private int volume;
    private boolean take;


    //GETTER
    public int getFoodMsx() {
        return maxFood;
    }

    public int getNowFood() {
        return nowFood;
    }

    public int getVolume() {
        return volume;
    }


    //SETTER
    public void setMaxFood(int maxFood) {
        this.maxFood = maxFood;
    }

    public void setNowFood(int nowFood) {
        this.nowFood = nowFood;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    //CONSTRUCTOR
    public Plate(int volume) {
        this.volume = volume;
        this.maxFood = volume;
        this.nowFood = maxFood;
        this.take = true;
    }


    public void add(int a) {
        if (a > maxFood || (a + nowFood) > maxFood) {
            nowFood = maxFood;
            System.out.println("Вся еда не поместилась в миску");
        }
    }


    public boolean take(int a) {
        if (take) {
            if (nowFood == a) {
                nowFood = nowFood - a;
                System.out.println("В миске закончилась еда");
                return take = false;
            } else if (nowFood <= 0) {
                nowFood = 0;
                System.out.println("В миске нет еды!");
                return take = false;
            } else if (nowFood < a) {
                System.out.println("В миске не достаточно еды!");
                return take = false;
            } else {
                nowFood = nowFood - a;
            }
        }
        return take = true;
    }


    @Override
    public String toString() {
        return "Объем миски: " + volume + "\nМаксимальное кол-во еды: " + maxFood +
                "\nТекущее кол-во еды: " + nowFood;
    }


//    public void info() {
//        System.out.println("Объем миски: " + volume + "\nМаксимальное кол-во еды: " + maxFood +
//                "\nТекущее кол-во еды: " + nowFood);
//    }
}
