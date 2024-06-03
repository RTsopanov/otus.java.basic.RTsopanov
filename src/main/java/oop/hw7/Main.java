package oop.hw7;

import java.util.*;

import static oop.hw7.PersonDataBase.*;
import static oop.hw7.Position.*;


public class Main {
    public static void main(String[] args) {


        ArrayList<PersonDataBase> list1 = new ArrayList<>(Arrays.asList(
                new PersonDataBase ("Robert", 32l, MANAGER),
                new PersonDataBase("Vasy", 19l, DIRECTOR),
                new PersonDataBase("Boss", 23l, DRIVER),
                new PersonDataBase("Riha", 27l, ENGINEER),
                new PersonDataBase("Sany", 26l, SENIOR_MANAGER),
                new PersonDataBase("Andrey", 41l, DEVELOPER),
                new PersonDataBase("Anton", 37l, QA),
                new PersonDataBase("Oleg", 28l, JANITOR),
                new PersonDataBase("Stepan", 36l, BRANCH_DIRECTOR),
                new PersonDataBase("Ivan", 22l, JUNIOR_DEVELOPER)));


        LinkedList<PersonDataBase> list2 = new LinkedList<>(Arrays.asList(
                new PersonDataBase ("Robert", 32l, MANAGER),
                new PersonDataBase("Vasy", 19l, DIRECTOR),
                new PersonDataBase("Boss", 23l, DRIVER),
                new PersonDataBase("Riha", 27l, ENGINEER),
                new PersonDataBase("Sany", 26l, SENIOR_MANAGER),
                new PersonDataBase("Andrey", 41l, DEVELOPER),
                new PersonDataBase("Anton", 37l, QA),
                new PersonDataBase("Oleg", 28l, JANITOR),
                new PersonDataBase("Stepan", 36l, BRANCH_DIRECTOR),
                new PersonDataBase("Ivan", 22l, JUNIOR_DEVELOPER)));









        findById(0l);
        System.out.println();


        System.out.println(isManager(list1));


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
