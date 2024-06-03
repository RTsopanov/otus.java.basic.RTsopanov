package oop.hw7;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    String name;
    int age;

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
    List<Cat> children = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Cat> getChildren() {
        return children;
    }

    public void setChildren(List<Cat> children) {
        this.children = children;
    }
}
