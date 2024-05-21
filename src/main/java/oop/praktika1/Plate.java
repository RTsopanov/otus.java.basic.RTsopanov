package oop.praktika1;


public class Plate {
    private int maxCurrentAmount;
    private int currentAmount;
    private int volume;


    public Plate(int volume) {
        this.volume = volume;
        this.maxCurrentAmount = volume;
        this.currentAmount = maxCurrentAmount;
    }


    public int getFoodMsx() {
        return maxCurrentAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getVolume() {
        return volume;
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





    public void addAmount(int amount) {
        if (amount > maxCurrentAmount || (amount + currentAmount) > maxCurrentAmount) {
            currentAmount = maxCurrentAmount;
            System.out.println("Вся еда не поместилась в миску");
        } else if (amount <= maxCurrentAmount && amount >= 0) {
            currentAmount = currentAmount + amount;
            System.out.println("Вся еда поместилась в миску");
        } else System.out.println("Ошибка! Укажите количество еды корректно!");
    }


    public boolean takeAmount(int amount) {
            if (currentAmount > 0 && currentAmount >= amount) {
                currentAmount = currentAmount - amount;
            }
        return true;
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
