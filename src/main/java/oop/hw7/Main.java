package oop.hw7;

import java.util.*;

import static oop.hw7.PersonDataBase.*;
import static oop.hw7.Position.*;


public class Main {
    public static void main(String[] args) {


//        ArrayList<Person> list = new ArrayList<>(Arrays.asList(
//                new Person (0, "Robert", MANAGER),
//                new Person(1, "Vasy", DIRECTOR),
//                new Person(2, "Boss", DRIVER),
//                new Person(3, "Riha", ENGINEER),
//                new Person(4, "Sany", SENIOR_MANAGER),
//                new Person(5, "Andrey", DEVELOPER),
//                new Person(6, "Anton", QA),
//                new Person(7, "Oleg", JANITOR),
//                new Person(8, "Stepan", BRANCH_DIRECTOR),
//                new Person(9, "Ivan", JUNIOR_DEVELOPER)));
//        System.out.println(arrayList);



Person person1 = new Person(0, "Robert", MANAGER);
Person person2 = new Person(1, "Vasy", DIRECTOR);
Person person3 = new Person(2, "Boss", DRIVER);
Person person4 = new Person(3, "Riha", ENGINEER);
Person person5 = new Person(4, "Sany", SENIOR_MANAGER);
Person person6 = new Person(5, "Andrey", DEVELOPER);
Person person7 = new Person(6, "Ivan", JUNIOR_DEVELOPER);
        System.out.println(person2.getArrayList());
        System.out.println(person2.getArrayList().size());




    }





// Взятие элемента по индексу ArrayList О(1)
    public static void findById(Long id){
        System.out.println(arrayList.get(Math.toIntExact(id)));
    }


// Вставка элемента в начало LinkedList О(1)
public static void add(String personDataBase){
        linkedList.add(0, String.valueOf(personDataBase));
}


//Поиск в HashSet  О(1)
    public static boolean isManager(ArrayList<PersonDataBase> list){
        Set<String> set = new HashSet<>();
        String str = String.valueOf(list.get(0).getPosition());
        for (PersonDataBase emp : list) {
            set.add(String.valueOf(emp.getPosition()));
        }
        if(set.contains(MANAGER) || set.contains(DIRECTOR) || set.contains(BRANCH_DIRECTOR) || set.contains(SENIOR_MANAGER)){
            return true;
        }
        return false;
    }



}
