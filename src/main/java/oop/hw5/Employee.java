package oop.hw5;

public class Employee {
     private  String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }


    public  String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }


    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                name + ' ' + age;
    }
}
