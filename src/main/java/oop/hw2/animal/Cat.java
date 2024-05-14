package oop.hw2.animal;

public class Cat extends Animal{
        public Cat(String name, int speedRun, int endurance){
            super(name, speedRun, endurance);
        }

        public void swim(int distance){
            System.out.println(name + " не умеет плавать");
        }
}
