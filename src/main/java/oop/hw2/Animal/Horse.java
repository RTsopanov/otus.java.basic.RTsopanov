package oop.hw2.Animal;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwimming, int endurance){
        super(name, speedRun, speedSwimming, endurance);
    }

    public void swim(int distance){
        int time;
        endurance = endurance - distance * 4;
        if (endurance == 0 || endurance < 0) {
            endurance = 0;
            time = -1;
            System.out.println(name + " устал" + "\nВремя: " + time);
        } else {
            time = distance / speedSwimming;
            System.out.println("Затраченное время на плавание: " + time + "\nВыносливость: " + endurance);
        }
    }
}
