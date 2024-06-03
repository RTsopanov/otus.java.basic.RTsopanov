package oop.hw7;

import java.util.ArrayList;
import java.util.LinkedList;

public class PersonDataBase {
    private String name;

    private Long id;
    private Position position;
    static ArrayList<String> arrayList = new ArrayList<>();
    static LinkedList<String> linkedList = new LinkedList<>();


    public PersonDataBase(String name, Long id, Position position){
        arrayList.add(name + " " + id + " " + position);
        linkedList.add(name + " " + id + " " + position);

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


public static void info(){
    System.out.println(arrayList);

}
public static void info2(){
    System.out.println(arrayList);
}





}
