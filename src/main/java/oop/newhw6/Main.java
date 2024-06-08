package oop.newhw6;

import oop.newhw6.PhoneBook;

import java.util.*;

import static oop.newhw6.PhoneBook.*;


//import static oop.hw6.PhoneBook.*;


public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook1 = new PhoneBook("Эрнесто Че Гевара", "+7-916-534-11-22");
        PhoneBook phoneBook2 = new PhoneBook("Иосиф Сталин", "+7-963-444-00-11");
        PhoneBook phoneBook3 = new PhoneBook("Франклин Рузвельт", "+7-927-333-15-15");
        PhoneBook phoneBook4 = new PhoneBook("Уинстон Черчель", "+7-917-222-17-17");
        PhoneBook phoneBook5 = new PhoneBook("Берия Лаврентий", "+7-999-698-34-58");



//        System.out.println();
//
        add("Антон Чехов",   "+7-999-999-99-99");
        System.out.println();
//
//        add("Берия Лаврентий", "+7-999-698-11-11");
//        System.out.println();
//
//        find("Берия Лаврентий");
//        System.out.println();

        System.out.println(containsPhoneNumber("+7-999-999-99-99"));

    }
}