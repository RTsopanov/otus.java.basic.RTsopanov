package oop.praktika1;


public class Plate {
    private int maxCurrentAmount;
    private int currentAmount;
    private int volume;
    private boolean take;


    public int getFoodMsx() {
        return maxCurrentAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getTake() {
        return take;
    }


    public void setMaxCurrentAmount(int maxCurrentAmount) {
        this.maxCurrentAmount = maxCurrentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public Plate(int volume) {
        this.volume = volume;
        this.maxCurrentAmount = volume;
        this.currentAmount = maxCurrentAmount;
        this.take = true;
    }


    public void addAmount(int a) {
        if (a > maxCurrentAmount || (a + currentAmount) > maxCurrentAmount) {
            currentAmount = maxCurrentAmount;
            System.out.println("Вся еда не поместилась в миску");
        } else if (a <= maxCurrentAmount && a >= 0) {
            currentAmount = currentAmount + a;
            System.out.println("Вся еда поместилась в миску");
        } else System.out.println("Ошибка! Укажите количество еды корректно!");
    }


    public boolean takeAmount(int a) {
        if (take) {
            if (currentAmount > 0 && currentAmount >= a) {
                currentAmount = currentAmount - a;
                return take = true;

            }
        }
        return take = false;
    }


    @Override
    public String toString() {
        return "Объем миски: " + volume + "\nМаксимальное кол-во еды: " + maxCurrentAmount +
                "\nТекущее кол-во еды: " + currentAmount;
    }


//    public void info() {
//        System.out.println("Объем миски: " + volume + "\nМаксимальное кол-во еды: " + maxFood +
//                "\nТекущее кол-во еды: " + nowFood);
//    }
}
