package oop.hw7;

import java.util.*;

public class PersonDataBase {

    private List<String> arrayList = new ArrayList<>();

    private  Map<Long, Person> hashMap = new HashMap<>();




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
                hashMap.put(pers.getId(), new Person(pers.getId(),pers.getName(), pers.getPosition()) );
            }

    }




    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }


    public  Map<Long, Person> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<Long, Person> hashMap) {
        this.hashMap = hashMap;
    }


}
