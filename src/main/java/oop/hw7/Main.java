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


        PersonDataBase personDataBase = new PersonDataBase(list);


//TODO   найти Person по id - O(1)
        System.out.println(personDataBase.findById(5L));
        System.out.println();


//TODO добавить Person - O(1)
        personDataBase.add(new Person(10L, "RRR", QA));
        System.out.println(personDataBase.getHashMap());
        System.out.println();



//TODO true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER   O(1)
        System.out.println(personDataBase.isManager(personDataBase.findById(1L)));
        System.out.println();


//TODO  true если Employee имеет любой другой Position  O(1)
        System.out.println(personDataBase.isEmployee(1L));

    }
}
