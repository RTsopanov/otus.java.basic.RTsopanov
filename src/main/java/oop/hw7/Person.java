package oop.hw7;

public class Person {
    private String name;
    private Long id;
    private Position position;
//    private List<String> arrayList = new ArrayList<>();



    public Person(Long id, String name, Position position) {
        this.name = name;
        this.id = id;
        this.position = position;
//        arrayList.add(name + " " + position)
        ;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

//    public List<String> getArrayList() {
//        return arrayList;
//    }
//
//    public void setArrayList(List<String> arrayList) {
//        this.arrayList = arrayList;
//    }


    @Override
    public String toString() {
        return "\nid = " + id +
                ", name = " + name +
                ", position= " + position;
    }
}