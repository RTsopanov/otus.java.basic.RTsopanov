package oop.hw7;

import java.util.*;

import static oop.hw7.PersonDataBase.*;
import static oop.hw7.Position.*;
import static oop.hw7.Sort.*;


public class Main {
    public static void main(String[] args) {

        int[] array = {5, 4, 0, -1, 7, 9, 12, 11, -13, 14, 3};



        int[] arr = {5, 4, 0, -1, 7, 9, 12, 11, -13, 14, 3};
        quickSort(arr, 0, arr.length - 1);






        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person(0L, "Robert", MANAGER),
                new Person(1L, "Vasy", DIRECTOR),
                new Person(2L, "Boss", DRIVER),
                new Person(3L, "Riha", ENGINEER),
                new Person(4L, "Sany", SENIOR_MANAGER),
                new Person(5L, "Andrey", DEVELOPER),
                new Person(6L, "Anton", QA),
                new Person(7L, "Oleg", JANITOR),
                new Person(8L, "Stepan", BRANCH_DIRECTOR),
                new Person(9L, "Ivan", JUNIOR_DEVELOPER)));


//TODO  Взятие элемента по индексу ArrayList О(1)
        PersonDataBase personDataBase = new PersonDataBase(list);
        findById( 5L);

        System.out.println();


//TODO Вставка элемента в начало LinkedList О(1)
//        add("AAA", PLUMBER, personDataBase.getLinkedList());
//        System.out.println(personDataBase.getLinkedList());
        System.out.println();


//TODO Поиск в HashSet  О(1)
//        System.out.println(isManager(MANAGER, personDataBase.getHashSet()));
//        System.out.println(isManager(JANITOR, personDataBase.getHashSet()));
        System.out.println();


//TODO Поиск в HashMap по ключу
//        System.out.println(isEmployee(7L, personDataBase.getHashMap()));
//        System.out.println(isEmployee(0L, personDataBase.getHashMap()));
    }




//    public static String findById(List<String> list, int id) {
//        return list.get(id);
//    }


    public  Person findById(Long id) {
        return getHashMap().get(id);
    }




    public static void add(String name, Position position, List<String> list) {
        list.add(0, name + " " + position);
    }



    public static boolean isManager(Position position, Set<Position> set) {
        if (position.equals(MANAGER) || position.equals(DIRECTOR) || position.equals(BRANCH_DIRECTOR)
                || position.equals(SENIOR_MANAGER)) {
            set.contains(position);
            return true;
        }
        return false;
    }



    public static boolean isEmployee(Long id, Map<Long, Position> map) {
        if (map.get(id).equals(MANAGER) || map.get(id).equals(DIRECTOR)
                || map.get(id).equals(BRANCH_DIRECTOR) || map.get(id).equals(SENIOR_MANAGER)) {
            map.containsKey(map.get(id));
            return false;
        }
        return true;
    }




//    Person person1 = new Person(0, "Robert", MANAGER);
//    Person person2 = new Person(1, "Vasy", DIRECTOR);
//    Person person3 = new Person(2, "Boss", DRIVER);
//    Person person4 = new Person(3, "Riha", ENGINEER);
//    Person person5 = new Person(4, "Sany", SENIOR_MANAGER);
//    Person person6 = new Person(5, "Andrey", DEVELOPER);
//    Person person7 = new Person(6, "Ivan", JUNIOR_DEVELOPER);

}
