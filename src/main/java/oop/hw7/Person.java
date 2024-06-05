package oop.hw7;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int id;
    private Position position;
    private List<String> arrayList = new ArrayList<>();





    public Person(int id, String name, Position position) {
        this.name = name;
        this.id = id;
        this.position = position;
//        arrayList.add(id, name + " " + position);
    }


    public Person(List<Person> list) {
        for (Person pers : list) {
            arrayList.add(pers.getId(), pers.getName() );
        }

    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }
}