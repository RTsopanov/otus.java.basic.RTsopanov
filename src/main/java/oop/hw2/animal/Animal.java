package oop.hw2.animal;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwimming;
    int endurance;


    // GETTER
    public String getName(String name){
        return name;
    }
    public int getSpeedRun(int speedRun){
        return speedRun;
    }
    public int getSpeedSwimming(int speedSwimming){
        return speedSwimming;
    }
    public int getEndurance(int endurance){
        return endurance;
    }

    // SETTER
    public void setName(String name){
        this.name = name;
    }

    public void setSpeedRun(int speedRun){
        this.speedRun = speedRun;
    }

    public void setSpeedSwimming(int speedSwimming){
        this.speedSwimming = speedSwimming;
    }




    public Animal(String name, int speedRun, int speedSwimming, int endurance){
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwimming = speedSwimming;
        this.endurance = endurance;
    }

    public Animal(String name, int speedRun,  int endurance){
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }


    public void run(int distance){
        int time;
        endurance = endurance - distance;
        if(endurance == 0 || endurance < 0){
            endurance = 0;
            time = -1;
            System.out.println(name + " устал" + "\nВремя: " + time);
        }
        else{
            time = distance / speedRun;
            System.out.println("Затраченное время на бег: " + time + "\nВыносливость: " + endurance);
        }

    }


    public abstract void swim(int distance);



    public void info(){
        System.out.println("Имя: " + name + "\nСкорость бега: " + speedRun + "\nСкорость плавания: " + speedSwimming);
        if(endurance == 0){
            System.out.println(name + " устал");
        } else {
            System.out.println("Выносливость: " + endurance);
        }
    }
}