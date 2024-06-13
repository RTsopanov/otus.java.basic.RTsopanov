package oop.hw7;

import java.util.*;

public class PersonDataBase {

    private List<String> arrayList = new ArrayList<String>();
    private List<String> linkedList = new LinkedList<>();
    private Set<Position> hashSet = new HashSet<>();
    private Map<Long, Position> hashMap = new HashMap<>();




    public  PersonDataBase(List<Person> arList){
        for (Person pers : arList) {
            arrayList.add(Math.toIntExact(pers.getId()), pers.getName() + " " + pers.getPosition());
            linkedList.add(pers.getName() + " " + pers.getPosition());
            hashSet.add(pers.getPosition());
            hashMap.put(pers.getId(), pers.getPosition());
        }

    }




    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    public List<String> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public Set<Position> getHashSet() {
        return hashSet;
    }

    public void setHashSet(Set<Position> hashSet) {
        this.hashSet = hashSet;
    }
    public Map<Long, Position> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<Long, Position> hashMap) {
        this.hashMap = hashMap;
    }


}
