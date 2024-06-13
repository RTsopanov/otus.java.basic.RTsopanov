package oop.hw7;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static oop.hw7.Position.*;
import static oop.hw7.Position.SENIOR_MANAGER;

public class PersonDataBase {

    private List<String> arrayList = new ArrayList<>();

    private  Map<Long, Person> hashMap = new LinkedHashMap<>();



    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }
    public void setHashMap(Map<Long, Person> hashMap) {
        this.hashMap = hashMap;
    }

    public  Map<Long, Person> getHashMap() {
        return hashMap;
    }







//    public  PersonDataBase(List<Person> arList){
//        for (Person pers : arList) {
//            arrayList.add(Math.toIntExact(pers.getId()), pers.getName() + " " + pers.getPosition());
//            linkedList.add(pers.getName() + " " + pers.getPosition());
//            hashSet.add(pers.getPosition());
//            hashMap.put(pers.getId(), pers.getPosition());
//        }




    public  PersonDataBase(List<Person> arList){
        for (Person pers : arList) {
            arrayList.add(Math.toIntExact(pers.getId()), pers.getName() + " " + pers.getPosition());
            hashMap.put(pers.getId(), new Person(pers.getId(), pers.getName(), pers.getPosition()));
        }
    }



    public  Person findById(Long id) {
        return   getHashMap().get(id);
    }




    public  void add(Person person) {
        hashMap.put(person.getId(), new Person (person.getId(), person.getName(), person.getPosition()));
    }


    public boolean isManager(Person person) {
        if (person.getPosition().equals(MANAGER) || person.getPosition().equals(DIRECTOR) || person.getPosition().equals(BRANCH_DIRECTOR)
                || person.getPosition().equals(SENIOR_MANAGER)) {
            return true;
        }
        return false;
    }




    public  boolean isEmployee(Long id) {
        if (hashMap.get(id).getPosition().equals(MANAGER) || hashMap.get(id).getPosition().equals(DIRECTOR) || hashMap.get(id).getPosition().equals(BRANCH_DIRECTOR) ||
                hashMap.get(id).getPosition().equals(SENIOR_MANAGER))
        {
            return false;
        }
        return true;
    }


}
