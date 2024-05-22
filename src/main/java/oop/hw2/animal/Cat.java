package oop.hw2.animal;

public class Cat extends Animal{
        public Cat(String name, int speedRun, int endurance){
            super(name, speedRun, endurance);
        }

        public int swim(int distance){
            int time= 0;
            System.out.println(name + " не умеет плавать");
            return time;
        }
}
