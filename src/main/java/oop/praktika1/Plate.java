package oop.praktika1;

public class Plate {
    private int volumePlate;
    private int number;
    private int nowFoodAmount;
    private int maxFoodAmmount;
    private boolean decreaseFood;

    public int getVolumePlate() {
        return volumePlate;
    }

    public void setVolumePlate(int volumePlate) {
        this.volumePlate = volumePlate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNowFoodAmount() {
        return nowFoodAmount;
    }

    public void setNowFoodAmount(int nowFoodAmount) {
        this.nowFoodAmount = nowFoodAmount;
    }

    public int getMaxFoodAmmount() {
        return maxFoodAmmount;
    }

    public void setMaxFoodAmmount(int maxFoodAmmount) {
        this.maxFoodAmmount = maxFoodAmmount;
    }

    public void setDecreaseFood(boolean decreaseFood) {
        this.decreaseFood = decreaseFood;
    }


    public Plate(int number, int volumePlate) {
        this.number = number;
        this.volumePlate = volumePlate;
        this.nowFoodAmount = volumePlate;
        this.maxFoodAmmount = volumePlate;
        this.decreaseFood = true;
    }


    public void info() {
        System.out.println("Миска №" + number + "\nОбъем миски: " + volumePlate + "\nМаксимальное кол-во еды: " + maxFoodAmmount +
                "\nТекущее кол-во еды: " + nowFoodAmount);
    }


    public void addFood(int a) {
        if (a > volumePlate || (nowFoodAmount + a) > volumePlate) {
            nowFoodAmount = volumePlate;
            System.out.println("Миска полная. \nВся еда не поместилась в миску. У вас осталось " + (a - maxFoodAmmount) + " еды");
        } else {
            nowFoodAmount = nowFoodAmount + a;
            System.out.println("В миске " + nowFoodAmount + " еды");
        }
    }


    public boolean isDecreaseFood() {
        return decreaseFood;
    }
}
